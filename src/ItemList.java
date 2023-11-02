import java.util.ArrayList;
/*Assignment A3
Submitted to Lauren Himbeault
Submitted by Rudy Kreutzer
For COMP-1020-A1
Class Name: List
Stores Items in a list and uses methods to alter quantity
 */
public class ItemList {
    private String name;
   private ArrayList<Item> Items;

    public ItemList(String name) {
        this.name = name;
        Items = new ArrayList<>();
    }

    //takes a string and returns the index of an item in the array with the same name
    public int findName(String name) {
        for (int i = 0; i < Items.size(); ++i) {
            if (Items.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    //uses findName to index an item of "named" and increases it by amount
    public void increase(String name, int amount) throws IndexOutOfBoundsException {
        int index = findName(name);
        if (index == -1) {
            Items.add(new Item(name, amount));
        } else Items.get(index).add(amount);
    }

    //same as increase but subtracts and prints an error message when you subtract more than the amount if items
    public void decrease(String name, int amount) throws IndexOutOfBoundsException {
        int index=-1;

        index = findName(name);
        if(index == -1){
            System.out.printf(":Warning: decreasing quantity of %s by %d but none in list\n",name,amount);
        } else {
            int original = Items.get(index).getAmount();
            Items.get(index).subtract(amount);
            if (Items.get(index).getAmount() < 1) {
                System.out.printf(":Warning: decreasing quantity of %s by %d but only %d in list\n", name,amount, original);
                Items.remove(index);
            }
        }
    }

    public String toString() {
        String string = String.format("%s:\n", name);

        for (Item item : Items) {
            string += item;
        }

        return string;
    }
}
