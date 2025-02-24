import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
public class TestArrivalClass {
    public static void main(String[] args){
        String inputLine;
        Scanner fileInput;
        ArrayList<String> customers = new ArrayList<String>();
        File inFile = new File("Customers.txt");
        System.out.println("Opening and reading file");
        try{
            fileInput = new Scanner(inFile);
            while(fileInput.hasNextLine()){
                inputLine = fileInput.nextLine();
                customers.add(Arrays.toString(inputLine.split("")));
                System.out.println(inputLine);
            } // end while
            fileInput.close();
        } // end try
        catch (FileNotFoundException e){
            System.out.println(e);
            System.exit(1);
        } // end catch
        /*
        for (int i = 0; i < customers.size(); i++){
            System.out.println(customers.get(i));
        }
         */
        System.out.println("end of program");


    }
}