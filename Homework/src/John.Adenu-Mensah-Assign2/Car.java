public class Car{
    private Person driver;
    private Person frontSeatPassenger;
    private Person backSeatPassenger1;
    private Person backSeatPassenger2;
    private Person backSeatPassenger3;
    //private String licensePlate;
    
    
    public Car() {
        this.driver = null;
        this.frontSeatPassenger = null;
        this.backSeatPassenger1 = null;
        this.backSeatPassenger2 = null;
        this.backSeatPassenger3 = null;
    }

    public Car(Person driver) {
        if (driver.getAge() < 18){
            System.out.println("Error. Driver must be at least 18 years old");
            System.exit(0);
            
        }else{
            this.driver = driver;
            this.frontSeatPassenger = null;
            this.backSeatPassenger1 = null;
            this.backSeatPassenger2 = null;
            this.backSeatPassenger3 = null;
        }
    }

    public boolean hasDriver(){
        return (this.driver != null);
    }

    public boolean hasPassangers(){
        return (this.frontSeatPassenger != null || this.backSeatPassenger1 != null || this.backSeatPassenger2 != null || backSeatPassenger3 != null) ; 
    }

    public boolean isEmpty(){
        return !this.hasDriver() && !this.hasPassangers();
    }

    public boolean isFull(){
        return (this.hasDriver() && (this.frontSeatPassenger != null && this.backSeatPassenger1 != null && this.backSeatPassenger2 != null && backSeatPassenger3 != null));
    }

    public boolean setDriver(Person driver){
        if (driver.getAge() > 18){
            this.driver = driver;
            return true;
        }
        return false;
    }
    public boolean addPassanger(Person passenger){
        if ((this.frontSeatPassenger == null)){this.frontSeatPassenger = passenger; return true;}
        else if ((this.backSeatPassenger1 == null)){this.backSeatPassenger1 = passenger; return true;}
        else if ((this.backSeatPassenger2 == null)){this.backSeatPassenger2 = passenger; return true;}
        else if ((this.backSeatPassenger3 == null)){this.backSeatPassenger3 = passenger; return true;}
        else{return false;}
    }

    public int getNumOccupants(){
        int count = 0;
        
        if (hasDriver()){count ++;}
        if ((this.frontSeatPassenger != null)){count += 1;}
        if ((this.backSeatPassenger1 != null)){count += 1;}
        if ((this.backSeatPassenger2 != null)){count += 1;}
        if ((this.backSeatPassenger3 != null)){count += 1;}

        return count;
    }

    public void listRiders(){
        System.out.println("Driver: " + this.driver.getName() + ". They are " + this.driver.getAge() + " years old.");
        if ((this.frontSeatPassenger != null)){System.out.println("Front Seat: "
        + this.frontSeatPassenger.getName() + " | Age: " + this.frontSeatPassenger.getAge());}

        if ((this.backSeatPassenger1 != null)){System.out.println("Back Seat #1: "
        + this.backSeatPassenger1.getName() + " | Age:" + this.backSeatPassenger1.getAge());}

        if ((this.backSeatPassenger2 != null)){System.out.println("Back Seat #2: "
        + this.backSeatPassenger2.getName() + " | Age:" + this.backSeatPassenger2.getAge());}

        if ((this.frontSeatPassenger != null)){System.out.println("Back Seat #3: "
        + this.backSeatPassenger3.getName() + " | Age:" + this.backSeatPassenger3.getAge());}
    }

    // Write a test to display the listRiders method using a new object called newCar
}