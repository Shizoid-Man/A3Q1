import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class RudyKreutzerA3Q1 {
    public static final String FILE_NAME = "a3q1in.txt";
    public static list shoppingList = new list("Shopping List");
    public static list purchaseList = new list("Purchase List");
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
                shoppingList.increase(arguments[2], Integer.parseInt(arguments[1]));
                runtime();
            case "buy":
                try {
                    shoppingList.decrease(arguments[2], Integer.parseInt(arguments[1]));


                } catch (IndexOutOfBoundsException iob) {
                    System.out.println("Warning " + arguments[2] + " not in list removing quantity of " + arguments[1]);
                }
                purchaseList.increase(arguments[2], Integer.parseInt(arguments[1]));
                runtime();
            case "list":
                System.out.println(shoppingList.toString());
                System.out.println(purchaseList.toString());
                runtime();
            default:
                System.out.println("Bad Instruction");
                runtime();
        }
    }
}
class Item {
    private final String name;
    private int amount;

    public Item(String inName, int inAmount) {
        name = inName;
        amount = inAmount;
    }
    //add and subtract are methods used to alter quantity
    public void add(int quantity) {
        amount += quantity;
    }

    public void subtract(int quantity) {
        if (quantity >= amount) {
            amount = 0;
        } else amount -= quantity;

    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public String toString() {
        return String.format("%s: %d\n", name, amount);
    }
}
class list {
    public String name;
    ArrayList<Item> items = new ArrayList<>();

    public list(String name) {
        this.name = name;
    }
    //takes a string and returns the index of a item in the array with the same name
    public int findName(String name) {
        for (int i = 0; i < items.size(); ++i) {
            if (items.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    //uses findName to index an item of "named" and increases it by amount
    public void increase(String name, int amount) throws IndexOutOfBoundsException {
        int index = findName(name);
        if (index == -1) {
            items.add(new Item(name, amount));
        } else items.get(index).add(amount);
    }
    //same as increase but subtracts and prints an error message when you subtract more than the amount if items
    public void decrease(String name, int amount) throws IndexOutOfBoundsException {
        int index = findName(name);
        int original = items.get(index).getAmount();
        items.get(index).subtract(amount);
        if (items.get(index).getAmount() < 1) {
            System.out.printf("Warning removing quantity of %d while %s only " +
                    "has quantity of %d\n", amount, name, original);
            items.remove(index);
        }
    }
    public String toString() {
        String string = String.format("%s:\n", name);

        for (Item item : items) {
            string += item;
        }

        return string;
    }
}




