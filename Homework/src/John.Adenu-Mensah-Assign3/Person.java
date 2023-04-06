
/**
 * A class to model a person, who has a name and an age.
 **/
public class Person {
  private String name;
  private int age;
  private String gender;
  private static int votingAge;
  private static int drivingAge;
  private static int marriageAge;

  private static final int infantMin = 0;
  private static final int infantMax = 2;
  private static final int toddlerMin = 1;
  private static final int toddlerMax = 3;
  private static final int childMin = 0;
  private static final int childMax = 15;
  private static final int teenMin = 13;
  private static final int teenMax = 19;
  private static final int youthMin = 15;
  private static final int youthMax = 24;

  // default constructor
  public Person() {
    this("No name yet", 0, "female");
    //setPerson("No name yet", 0);
  }

  // constructor that takes a name and an age
  public Person(String n, int a, String g) {
    setPerson(n, a);
    gender = g;
  }

  // accessor method for name
  public String getName() {
    return name;
  }

  // accessor method for age
  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public String getGenderAsString() {
    return this.gender;
  }

  // mutator method for name
  public void setName(String n) {
    name = n;
  }

  // mutator method for age
  public void setAge(int a) {
    if (a < 0) {
      System.out.println("Age cannot be negative.");
      System.exit(0);
    } else
      age = a;
  }

  
  public void setGender(String gender) {
    this.gender = gender;
  }

  // method to set both the name and the age
  public void setPerson(String n, int a) {
    setName(n);
    setAge(a);
  }

  // tests whether this person is equal to another
  public boolean equals(Person otherP) {
    return (name.equals(otherP.name) && age == otherP.age);
  }

  // tests whether this person has the same name as another
  public boolean hasSameNameAs(Person otherP) {
    return name.equals(otherP.name);
  }

  // tests whether this person has the same age as another
  public boolean hasSameAgeAs(Person otherP) {
    return age == otherP.age;
  }

  // tests whether this person is older than another
  public boolean isOlderThan(Person otherP) {
    return age > otherP.age;
  }

  // tests whether this person is younger than another
  public boolean isYoungerThan(Person otherP) {
    return age < otherP.age;
  }


  //!ASSIGNMENT 3 STARTS HERE!
  public static void setVotingAge(int age){
    votingAge = age;
  }

  public static int getVotingAge(){
    return votingAge;
  }

  public boolean canVote(int age){
    boolean variable = (age >= votingAge)?true:false;
    return variable;
  }

  public static void setDrivingAge(int age){
    drivingAge = age;
  }

  public static int getDrivingAge(){
    return drivingAge;
  }

  public boolean canDrive(int age){
    boolean anotherVar = age >= drivingAge ? true: false;
    return anotherVar;
  }

  public static void setMarriageAge(int age){
    marriageAge = age;
  }

  public static int getMarriageAge(){
    return marriageAge;
  }

  public boolean canMarry(int age){
    if (age >= marriageAge){
      return true;
    }
    return false;
  }

  public boolean isAdult(boolean canDrive, boolean canMarry, boolean canVote){
    if( canDrive && canMarry && canVote){return true;}
    return false;
  }

  public static Person createAdult(String name, String gender){
   
    int minAge = Math.max(Math.max(drivingAge,votingAge), marriageAge);

    return new Person(name, minAge, gender);
  }

  public boolean isInfant(int age){
    if(age >= infantMin && age < infantMax){return true;}
    return false;
  }

  public boolean isToddler(int age){
    if(age >= toddlerMin && age <= toddlerMax){return true;}
    return false;
  }

  public boolean isChild(int age){
    if(age >= childMin && age <= childMax){return true;}
    return false;
  }

  public boolean isTeenager(int age){
    if(age >= teenMin && age <= teenMax){return true;}
    return false;
  }

  public boolean isYouth(int age){
    if(age >= youthMin && age <= youthMax){return true;}
    return false;
  }
  
}