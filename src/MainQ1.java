import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/*
Assignment A3
Submitted to Lauren Himbeault
Submitted by Rudy Kreutzer
For COMP-1020-A1
Class Name: MainQ1
Uses item and list to take file input and run commands from file and outputs the result
 */
public class MainQ1 {
    public static final String FILE_NAME = "a3q1in.txt";
    public static ItemList shoppingItemList = new ItemList("Shopping List");
    public static ItemList purchaseItemList = new ItemList("Purchase List");
    public static int index = 0;
    public static Scanner sc;

    //calls start and handles a File not found exception
    public static void main(String[] args) {
        try {
            start(FILE_NAME);
        } catch (FileNotFoundException fnf) {
            System.out.println("File Not Found\n" + fnf);
            System.exit(1);
        }
    }
    //takes in the file name and initializes a Scanner for runtime
    public static void start(String inFile) throws FileNotFoundException {
        File in = new File(inFile);
        sc = new Scanner(in);
        try {
            runtime();
            //this is used to find the end of the file
            //should technically be faster than checking if Scanner has another line
        } catch (NoSuchElementException end) {
            System.out.println("end of file");
            System.exit(0);
        }
    }

    public static void runtime() throws NoSuchElementException {

        String[] arguments = sc.nextLine().split(",");

        index++;
        switch (arguments[0]) {
            case "need":
                shoppingItemList.increase(arguments[2], Integer.parseInt(arguments[1]));
                runtime();
            case "buy":
                shoppingItemList.decrease(arguments[2], Integer.parseInt(arguments[1]));
                purchaseItemList.increase(arguments[2], Integer.parseInt(arguments[1]));
                runtime();
            case "list":
                System.out.println("\n==============");
                System.out.println(shoppingItemList.toString());
                System.out.println(purchaseItemList.toString());
                runtime();
            default:
                System.out.println("Bad Instruction");
                runtime();
        }
    }
}




