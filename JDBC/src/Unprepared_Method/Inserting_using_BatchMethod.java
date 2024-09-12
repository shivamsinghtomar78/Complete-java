package Unprepared_Method;

import java.sql.*;
import java.util.Scanner;

public class Inserting_using_BatchMethod {
    private static final String url="jdbc:mysql://localhost:3306/mydb";
    private static final String username="root";
    private static final String password="0819";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement=connection.createStatement();
            Scanner sc=new Scanner(System.in);
            while (true){
                System.out.print("Enter name: ");
                String name=sc.next();
                System.out.print("Enter age: ");
                int age=sc.nextInt();
                System.out.print("Enter marks: ");
                double marks=sc.nextDouble();
                System.out.print("Enter more data(Y/N): ");
                String choice =sc.next();
                String query=String.format("INSERT INTO students(name ,age,marks) VALUES('%s',%d,%f)",name,age,marks);

                statement.addBatch(query);
                if(choice.toUpperCase().equals("N")){
                    break;
                }
            }
            int[] arr=statement.executeBatch();
            for (int i = 0; i <arr.length ; i++) {
                if(arr[i]==0){
                    System.out.println("Query: "+i+ " not executed succesfully!!");
                }
                
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
