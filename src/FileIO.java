// Text File Input
//

import java.util.Scanner;
import java.io.*;

public class FileIO {

    public static void main(String[] args){

        String inputLine;

        Scanner fileInput;
        File inFile = new File("TestData.txt");

        System.out.println("Opening and reading file");

        try{
            fileInput = new Scanner(inFile);

            while(fileInput.hasNext()){
                inputLine = fileInput.next();
                System.out.println(inputLine);
            } // end while

            fileInput.close();

        } // end try

        catch (FileNotFoundException e){
            System.out.println(e);
            System.exit(1);		// IO error; exit program
        } // end catch

        System.out.println("end of program");
    }
}
