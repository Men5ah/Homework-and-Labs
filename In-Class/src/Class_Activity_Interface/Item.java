package Class_Activity_Interface;
public abstract class Item{
    String itemName;
    int itemQuant;

    public Item() {
        itemName = "Thing";
        itemQuant = 5;
    }

    public abstract String getItemName();

    public abstract void setItemName();
    
}