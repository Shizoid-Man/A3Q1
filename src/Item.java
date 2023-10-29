class Item {
    /*
Assignment A3
Submitted to Lauren Himbeault
Submitted by Rudy Kreutzer
For COMP-1020-A1
Class Name: Item
Stores basic info on an item
 */
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
