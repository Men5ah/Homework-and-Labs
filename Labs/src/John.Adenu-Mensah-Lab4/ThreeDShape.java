public abstract class ThreeDShape extends Shape {
    
    public ThreeDShape(String name, String colour, boolean is3d) {
        super(name, colour, true);
    }

    public abstract Double computeVolume();

    public abstract Double computeSurfaceArea();
}
