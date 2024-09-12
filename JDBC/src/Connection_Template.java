import java.sql.*;

public class Connection_Template {
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
            String quary=" select* from students";
          ResultSet resultSet=statement.executeQuery(quary);
          while(resultSet.next()){
              int id=resultSet.getInt("Id");
              String Name=resultSet.getString("name");
              int Age=resultSet.getInt("age");
              double Marks=resultSet.getDouble("marks");
              System.out.println("ID :"+id);
              System.out.println("Name :"+Name);
              System.out.println("Age :"+Age);
              System.out.println("Marks :"+Marks);
              System.out.println();
          }
        }catch (SQLException  e){
            System.out.println(e.getMessage());
        }

    }
}
