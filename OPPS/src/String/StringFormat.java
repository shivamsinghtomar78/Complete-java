package String;

import java.sql.SQLOutput;

public class StringFormat {
    public static void main(String[] args) {
        String name="Sandeep";
        int marks=45;
        System.out.println("Hello "+name+", your makrs are :"+marks);
        System.out.printf("Hello %s,your marks are:%d",name,marks);
    }
}
