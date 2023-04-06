
/**
 * A class to model a person, who has a name and an age.
 **/
public class Person {
  private String name;
  private int age;
  private String gender;


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
}