package prepared;

import java.sql.*;

public class Prepared_Statement_Retrivel {
    private static final String url="jdbc:mysql://localhost:3306/mydb";
    private static final String username="root";
    private static final String password="0819";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try{
            Connection connection= DriverManager.getConnection(url,username,password);
            String query = "Select marks from students where Id= ?";
//            Statement statement=connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
             preparedStatement.setDouble(1,5);
            ResultSet resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
                 double marks=resultSet.getDouble("marks");
                System.out.println("Marks: "+marks);
            }
            else {
                System.out.println("Marks not found");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}


