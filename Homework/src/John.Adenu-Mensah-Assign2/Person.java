 public class Person {
    private String name;
    private int age;
    private char gender;

    
    // Mutator Methods
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if (age >= 0){
            this.age = age;
        }
        else{
            System.exit(age);
        }
    }
    public void setGender(char gender){
        if (gender == 'M'){this.gender = 'M';}
        else if (gender == 'F'){this.gender = 'F';}
        else{System.exit(gender);}

    }

    // Contsructor
    /**
     * @param name
     * @param age
     * @param gender
     */
    public Person() {
        this.name = "No name yet";
        this.age = 0;
        this.gender = Math.random() < 0.5 ? 'M': 'F';

    }

    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    // Accessor Methods
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }

    // Method
    public void setPerson(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /*
     * 
     */
    @Override
    public String toString(){
        return "\nThis is a new person \n[Name: " + this.name 
        + "\nAge: " + this.age
        + "\nGender: " + this.gender
        + "]";
    }
    
    /*
    * 
    */
    @Override
    public boolean equals(Object obj){

        if(this == obj) return true;
        if( !(obj instanceof Person) ) return false;
        
        Person other = (Person) obj;

        if ((this.name.equals(other.name)) && (this.age == other.age)){
        return ((this.name.equals(other.name)) && (this.age == other.age));
        }
        if((this.name.equals(other.name))){
          return ((this.name.equals(other.name)));
        }
        return (this.age == other.age); 
    }

    // Compare ages
    public boolean isSameAge(Person person){
        if (this.age == person.age){
            return true;
        }
        return false;
    }
    public boolean isOlderThan(Person person){
        if (this.age > person.age){
            return true;// Is older is true
        }
        return false;// Is older than is false
    }
    public boolean isYoungerThan(Person person){
        if (this.age < person.age){
            return true;// Is Younger than is true
        }
        return false;// Is Younger than is false
    }
}