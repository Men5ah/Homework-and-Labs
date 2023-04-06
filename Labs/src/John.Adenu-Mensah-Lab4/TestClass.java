public class TestClass {
    public static void main(String[] args) {
        //Square.
        Square mySquare = new Square("Kiki", "Blue");
        double area = mySquare.computeArea();
        double perimeter = mySquare.computePerimeter();
        mySquare.draw();
        System.out.println("The square area is " + area + " and the perimeter is " + perimeter);

        //Rectangle.
        Rectangle myRect = new Rectangle("Kwame", "Red");
        double areaRect = myRect.computeArea();
        double perimeterRect = myRect.computePerimeter();
        myRect.draw();
        System.out.println("The rectangle area is " + areaRect + " and the perimeter is " + perimeterRect);

        //Cube
        Cube myCube = new Cube("Cube", "Red", true);
        System.out.println("\nCube:");
        System.out.println("Volume: " + myCube.computeVolume());
        System.out.println("Surface Area: " + myCube.computeSurfaceArea());
        //Cuboid
        Cuboid myCuboid = new Cuboid("Cuboid", "Yellow", true);
        System.out.println("\nCuboid:");
        System.out.println("Volume: " + myCuboid.computeVolume());
        System.out.println("Surface Area: " + myCuboid.computeSurfaceArea());
        

        //Arrays.
        Shape[] shapes = new Shape[2];
        shapes[0] = mySquare;
        shapes[1] = myRect;
        System.out.println("\n2D Shapes");
        for(int i = 0;i<shapes.length;i++){
            System.out.println("\nColour is: " + shapes[i].getColour());
            System.out.println("Name is: " + shapes[i].getName());
            System.out.println("Description is: " + shapes[i].getDescription());
        }

        Shape[] shapes3D = new Shape[2];
        shapes3D[0] = myCube;
        shapes3D[1] = myCuboid;
        System.out.println("\n3D Shapes");
        for(int i = 0;i<shapes3D.length;i++){
            System.out.println("\nColour is: " + shapes3D[i].getColour());
            System.out.println("Name is: " + shapes3D[i].getName());
            System.out.println("Description is: " + shapes3D[i].getDescription());
        }
    }
    
}
