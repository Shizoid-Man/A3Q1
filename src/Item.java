public class Item {
    private String name;
    private int amount;
    public Item(String inName, int inAmount){
        name=inName;
        amount=inAmount;
    }

    public String toString(){
        return String.format("%s: %d",name,amount);
    }
}
