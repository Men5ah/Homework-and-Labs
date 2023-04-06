public class Cube extends ThreeDShape {
    private double length = 8;
    private double width = 8;
    private double height = 8;
    public Cube(String name, String colour, boolean is3d) {
        super(name, colour, true);
    }

    @Override
    public Double computeVolume() {
        double volume = length*width*height;
        return volume;
    }

    @Override
    public Double computeSurfaceArea() {
        double surfaceArea = 6*(length*width);
        return surfaceArea;
    }

    @Override
    public String getDescription() {
        return "A cube is a 3 dimensional shape where the length, width and height are equal.";
    }
}
