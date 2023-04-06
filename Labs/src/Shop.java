public class Shop{
    
    float[][] items;

    //Constructor
    public Shop(){
        items = new float[10][];
    }
    public Shop(int nShelves){
        items = new float[nShelves][];
    }

    
    public Shop(int nShelves, int nItemsPerShelf){
        items = new float[nShelves][nItemsPerShelf];
    }

    //Getters
    /**
     * Get the price of an item in the shop
     * @param shelf the shelf where the item is
     * @param position The position of the item on the shelf
     * @return The price of the item (is there is one), -1 otherwise.
     */
    public float getItemPrice(int shelf, int position){
        if(shelf<0 || position < 0){
            return (float) -1;
        }

        return 5;
    }



    //Setters
}
