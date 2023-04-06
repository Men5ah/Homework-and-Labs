public class Cuboid extends ThreeDShape {
    private double length = 8;
    private double width = 9;
    private double height = 10;
    public Cuboid(String name, String colour, boolean is3d) {
        super(name, colour, true);
    }

    @Override
    public Double computeVolume() {
        double volume = length*width*height;
        return volume;
    }

    @Override
    public Double computeSurfaceArea() {
        double surfaceArea = (2*(length*width)) +( 2*(width*height)) + (2*(length*height));
        return surfaceArea;
    }

    @Override
    public String getDescription() {
        return "A cube is a 3 dimensional shape where the length, width and height are not equal.";
    }
}
