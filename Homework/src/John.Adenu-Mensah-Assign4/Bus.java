public class Bus {
    //Instance variables
    private int busCapacity;
    private String busLicensePlate;
    private String busMake;
    private String busModel;
    private String busColour;
    private Person busDriver;
    private Person[] busPassengers;
    private int numberPassengers;

    // Methods
    public Bus(int busCapacity, String busLicensePlate, String busMake, String busModel, String busColour){
        this.busCapacity = busCapacity;
        this.busLicensePlate = busLicensePlate;
        this.busMake = busMake;
        this.busModel = busModel;
        this.busColour = busColour;
        this.busDriver = null;
        this.busPassengers = new Person[busCapacity];
        this.numberPassengers = 0;
    }

        //! Accessor Methods
        public int getBusCapacity(){
            return busCapacity;
        }
        public String getBusLicensePlateNumber(){
            return busLicensePlate;
        }
        public String getBusMake(){
            return busMake;
       }
        public String getBusModel(){
            return busModel;   
        }
        public String getBusColour(){
            return busColour;
        }

        //? Mutator Methods
        public boolean setDriver(Person driver){
            if(driver.canDrive()){
                busDriver = driver;
                return true;
            }
            return false;
        }

        public boolean hasDriver(){
            if(busDriver != null){
                return true;
            }
            return false;
        }

        public boolean addPassengers(Person person){
            for(int i = 0; i<busCapacity; i++){
                if(busPassengers[i] == null){
                    busPassengers[i] = person;
                    numberPassengers++;
                    return true;
                }
            }
            return false;
        }

        public boolean removePassengers(Person person){
            for(int i = 0; i<busCapacity; i++){
                if(busPassengers[i]!= null && busPassengers[i].equals(person)){
                    busPassengers[i] = null;
                    return true;
                }
            }
            return false;
        }

        public int getNumPassengers(){
            return numberPassengers;
        }
         public int getNumOccupants(){
            if(hasDriver()){int numOccupants = numberPassengers + 1;
            return numOccupants;}
            return numberPassengers;
         }
         public boolean hasPassengers(){
            return numberPassengers >= 1;
         }
         public boolean isEmpty(){
            return numberPassengers == 0;
         }
         public boolean isFull() {
            return numberPassengers == busCapacity;
         }

        public void listRiders(){
            for(int i = 0; i<busCapacity; i++){
                if(busPassengers[i]!= null){
                    System.out.println(busPassengers[i].getName()
                    + ", " + busPassengers[i].getAge()
                    + ", " + busPassengers[i].getGender());
                }
            }
        }

        public int[] getEmptySeats(){
            int emptySeatTrack = 0;
            int[] emptySeats = new int[busCapacity];
            for(int i = 0; i<busCapacity; i++){
                if(busPassengers[i] == null){
                    emptySeats[emptySeatTrack] = i;
                    emptySeatTrack++;
                }
            }
            return emptySeats;
        }
}
