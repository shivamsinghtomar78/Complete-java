package transaction_handling;

import java.sql.*;
import java.util.Scanner;

public class transaction {
    private static final String url = "jdbc:mysql://localhost:3306/lenden";
    private static final String username = "root";
    private static final String password = "0819";

    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            connection = DriverManager.getConnection(url, username, password);

            // Disable auto-commit mode
            connection.setAutoCommit(false);

            // Prepare SQL statements
            String debit_query = "UPDATE accounts SET balance = balance - ? WHERE account_number = ?";
            String credit_query = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";
            PreparedStatement debitPreparedStatement = connection.prepareStatement(debit_query);
            PreparedStatement creditPreparedStatement = connection.prepareStatement(credit_query);

            // Get user input
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter account number to debit: ");
            int account_numberD = sc.nextInt();
            System.out.print("Enter account number to credit: ");
            int account_numberC = sc.nextInt();
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            // Check if the balance is sufficient before debiting
            if (isSufficient(connection, account_numberD, amount)) {
                // Set parameters and execute the debit operation
                debitPreparedStatement.setDouble(1, amount);
                debitPreparedStatement.setInt(2, account_numberD);
                debitPreparedStatement.executeUpdate();

                // Set parameters and execute the credit operation
                creditPreparedStatement.setDouble(1, amount);
                creditPreparedStatement.setInt(2, account_numberC);
                creditPreparedStatement.executeUpdate();

                // Commit the transaction if everything is successful
                connection.commit();
                System.out.println("Transaction successful!!");
            } else {
                System.out.println("Insufficient balance. Transaction failed!!");
                connection.rollback();
            }

            // Clean up resources
            debitPreparedStatement.close();
            creditPreparedStatement.close();
            sc.close();
            connection.close();

        } catch (SQLException e) {
            try {
                if (connection != null) {
                    connection.rollback();
                    System.out.println("Transaction rolled back due to an error.");
                }
            } catch (SQLException rollbackEx) {
                System.out.println("Error during rollback: " + rollbackEx.getMessage());
            }
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.setAutoCommit(true);
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }

    static boolean isSufficient(Connection connection, int account_number, double amount) {
        try {
            String query = "SELECT balance FROM accounts WHERE account_number = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, account_number);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                double current_balance = resultSet.getDouble("balance");
                return current_balance >= amount;
            }
        } catch (SQLException e) {
            System.out.println("Error checking balance: " + e.getMessage());
        }
        return false;
    }
}
