package Unprepared_Method;

import java.sql.*;

public class insertion {
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
            String quary=String.format("INSERT INTO students(name,age,marks) VALUES(' %s',%o,%f)","Rahul",23,74.8);
            int rowsAffeted=statement.executeUpdate(quary);
            if(rowsAffeted>0){
                System.out.println("Data inserted successfully..");
            }
            else{
                System.out.println("Data not inserted");
            }
    }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
