package File_Handling;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        String fileName="java-course.txt";
        try  ( FileWriter  writer= new FileWriter(fileName)){
            writer.write("This is the best java course.\n");
            for (int i=0;i<100;i++){
                writer.write('*');
            }
            writer.flush();
            System.out.println("File wrtitten succesfully");

        }catch (IOException e){
            System.out.printf("Exception occured %s",e.getMessage());
        }

        }
    }

