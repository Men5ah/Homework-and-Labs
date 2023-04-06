/*public class TestPerson {
    public static void main(String[] args) {
        Person kofi = new Person("Kofi", 1, "Male");
        Person john = new Person("John", 19, "Male");
        Person ebo = new Person("Ebo", 55, "Male");

        // Testing the setters aand getters.
        Person.setVotingAge(18);
        Person.getVotingAge();

        Person.setDrivingAge(18);
        Person.getDrivingAge();

        Person.setMarriageAge(21);
        Person.getMarriageAge();


        // canVote
        System.out.println(kofi.canVote(kofi.getAge())); // False
        System.out.println(ebo.canVote(ebo.getAge())); // True

        // canMarry
        System.out.println("\n"+john.canMarry(john.getAge())); // False
        System.out.println(ebo.canMarry(ebo.getAge())); // True

        // canDrive
        System.out.println("\n"+kofi.canDrive(kofi.getAge())); // False
        System.out.println(ebo.canDrive(ebo.getAge())); // True


        // isInfant
        System.out.println("\n"+kofi.isInfant(kofi.getAge())); // True
        System.out.println(john.isInfant(john.getAge())); // False

        // isToddler
        System.out.println("\n"+kofi.isToddler(kofi.getAge())); // True
        System.out.println(john.isToddler(john.getAge())); // False

        // isChild
        System.out.println("\n"+kofi.isChild(kofi.getAge())); // True
        System.out.println(john.isChild(john.getAge())); // False

        //isTeen
        System.out.println("\n"+kofi.isTeenager(kofi.getAge())); // False
        System.out.println(john.isTeenager(john.getAge())); // True
        
        //isYouth
        System.out.println("\n"+ebo.isYouth(ebo.getAge())); // False
        System.out.println(john.isYouth(john.getAge())); // True

        //isAdult
        System.out.println("\n"+ebo.isAdult(ebo.canDrive(ebo.getAge()), 
        ebo.canMarry(ebo.getAge()), 
        ebo.canVote(ebo.getAge()))); // True

        System.out.println(john.isAdult(john.canDrive(john.getAge()), 
        john.canMarry(john.getAge()), 
        john.canVote(john.getAge()))); // False

        // createAdult
        Person anAdult = Person.createAdult("Alvin", "Male");
        System.out.println("\nNew Adult[Name: "+anAdult.getName()
        + ", Age: " + anAdult.getAge() + " years old"
        + ", Gender: " + anAdult.getGender() + "]");
    }
}*/
