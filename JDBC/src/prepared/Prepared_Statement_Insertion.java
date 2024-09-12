package prepared;

import java.sql.*;

public class Prepared_Statement_Insertion {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "0819";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO students(name, age, marks) VALUES(?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "Shivam");
            preparedStatement.setInt(2, 20);
            preparedStatement.setDouble(3, 99.2);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully..");
            } else {
                System.out.println("Data not inserted");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
