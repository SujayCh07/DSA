import java.io.*;
import java.util.Scanner;

public class TestArrivalClass {
    public static void main(String[] args) {
        String inputLine;
        Scanner fileInput;
        Arrival customers = new Arrival(0, 0);
        File inFile = new File("Customers.txt");

        System.out.println("Opening and reading file");

        try {
            fileInput = new Scanner(inFile);
            while (fileInput.hasNextLine()) {
                inputLine = fileInput.nextLine();
                String[] customerData = inputLine.split(" ");
                if (customerData.length == 3) {
                    int arrivalTime = Integer.parseInt(customerData[0]);
                    int serviceTime = Integer.parseInt(customerData[1]);
                    String name = customerData[2];
                    customers.addCustomer(arrivalTime, serviceTime, name);
                }
                System.out.println(inputLine);
            }
            fileInput.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
            System.exit(1);
        }

        System.out.println("End of program");
    }
}
