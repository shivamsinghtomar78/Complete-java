package Unprepared_Method;

import java.sql.*;

public class Update {
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
            Statement statement=connection.createStatement();
            String quary=String.format("UPDATE students SET marks=%f WHERE Id=%d",99.2,4);
            int rowsAffeted=statement.executeUpdate(quary);
            if(rowsAffeted>0){
                System.out.println("Data updated successfully..");
            }
            else{
                System.out.println("Data not updated");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }

}
