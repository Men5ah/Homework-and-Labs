public class TestBus {
    public static void main(String[] args) {
        Bus newBus = new Bus(3, "Takoradi02", "Gordon", "Transit", "Grey");

        System.out.println(newBus.getBusCapacity());
        System.out.println(newBus.getBusLicensePlateNumber());
        System.out.println(newBus.getBusMake());
        System.out.println(newBus.getBusModel());
        System.out.println(newBus.getBusColour());

        Person driver1 = new Person("Ebo", 55, "Male");
        Person passenger1 = new Person("Imane", 55, "Female");
        Person passenger2 = new Person("Ato", 25, "Male");
        Person passenger3 = new Person("Angelina",32, "Female" );
        Person passenger4 = new Person("Shokko", 15, "Female");
        Person.setDrivingAge(18);

        //Driver Test
        System.out.println("\nSet Driver Test");
        System.out.println(newBus.setDriver(driver1)); //true
        System.out.println(newBus.setDriver(passenger4)); //false

        //Has Driver
        System.out.println("\nHas Driver Test");
        System.out.println(newBus.hasDriver());
        System.out.println(!(newBus.hasDriver()));

        //Add Passenger Test
        System.out.println("\nAdd Passenger Test");
        System.out.println(newBus.addPassengers(passenger1));
        System.out.println(newBus.addPassengers(passenger2));
        System.out.println(newBus.addPassengers(passenger3));
        System.out.println(newBus.addPassengers(passenger4));

        //Remove Passenger Test
        System.out.println("\nRemove Passenger Test");
        System.out.println(newBus.removePassengers(passenger1));
        System.out.println(newBus.removePassengers(passenger2));
        System.out.println(newBus.removePassengers(passenger3));
        System.out.println(newBus.removePassengers(passenger4));

        //Get Passenger Test
        System.out.println("\nGet Passenger Test");
        System.out.println(newBus.getNumPassengers());

        //Get Occupants Test
        System.out.println("\nGet Occupants Test");
        System.out.println(newBus.getNumOccupants());

        //Has Passengers Test
        System.out.println("\nHas Passengers Test");
        newBus.addPassengers(passenger1);
        newBus.addPassengers(passenger4);
        System.out.println(newBus.hasPassengers());
        System.out.println(!(newBus.hasPassengers()));

        //Empty Test
        System.out.println("\nEmpty Test");
        System.out.println(newBus.isEmpty());
        System.out.println(!(newBus.isEmpty()));

        //Full Test
        System.out.println("\nFull Test");
        System.out.println(newBus.isFull());
        System.out.println(!(newBus.isFull()));

        //List Riders Test
        System.out.println("\nList Riders Test");
        newBus.listRiders();

        //Get Empty Seats Test
        System.out.println("\nGet Empty Seats Test");
        for(int i=0; i<newBus.getBusCapacity(); i++){
            System.out.println(newBus.getEmptySeats()[i]);
        }
    }
}
