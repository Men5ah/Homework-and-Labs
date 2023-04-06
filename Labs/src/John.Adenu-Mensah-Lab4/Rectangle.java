public class Rectangle extends Polygon {

    private double length = 8.0;
    private double width = 20.0;
    int[][] arr = new int[(int) length][(int) width];

    public Rectangle(String name, String colour) {
        super(name, colour, 4);
    }

    @Override
    public double computeArea() {
        double area = (length*width);
        return area;
    }

    @Override
    public double computePerimeter() {
        double perimeter = (2*length) + (2*width);
        return perimeter;
    }

    // Using modified code from the TicTacToeBoard implementation.
    @Override
    public void draw() {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public String getDescription() {
        return "A rectangle is a polygon shape with 4 sides. It's area is length*width and its perimeter is 2*length+2*width";
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle("Ato", "Red");
        rect.draw();
    }
}
