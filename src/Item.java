public class Item {
    private String name;
    private int amount;
    public Item(String inName, int inAmount){
        name=inName;
        amount=inAmount;
    }
    public void add(int num){
        amount+=num;

    }
    public void remove(int num){
        if (num>=amount){
            amount=0;
        }else amount-=num;
    }
    public String toString(){
        return String.format("%s: %d",name,amount);
    }
}
