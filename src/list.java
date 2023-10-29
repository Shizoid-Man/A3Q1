import java.util.ArrayList;

class list {
    public String name;
    ArrayList<Item> items = new ArrayList<>();

    public list(String name) {
        this.name = name;
    }

    //takes a string and returns the index of an item in the array with the same name
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
