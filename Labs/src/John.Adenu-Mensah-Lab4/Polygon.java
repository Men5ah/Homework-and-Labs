public abstract class Polygon extends TwoDShape{
    private int numSides;
    public Polygon(String name, String colour, int numSides) {
        super(name, colour);
        this.numSides = numSides;
    }
    public int getNumSides() {
        return numSides;
    }
    
}