
public class TestPerson {

  public static void main(String[] args){
    
    // Test the constructors and the accessor methods
    Person p1 = new Person();
    Person p2 = new Person("Kofi", 19, "male");
    Person p3 = new Person("Mansah", 4, "female");
    Person p4 = new Person("Bob", 4, "male");
    
    System.out.println("p1 is " + p1.getName() + " who is " +
                       p1.getAge() + " years old.");
    System.out.println("p1's gender is " + p1.getGender());
    String genderString = p1.getGenderAsString();
    System.out.println("p1's gender as a string is " + genderString);

    
    System.out.println("p2 is " + p2.getName() + " who is " +
                       p2.getAge() + " years old.");
    System.out.println("p3 is " + p3.getName() + " who is " +
                       p3.getAge() + " years old.");
    System.out.println("p4 is " + p4.getName() + " who is " +
                       p4.getAge() + " years old.");
    System.out.println();
    
    // Test the set methods
    p1.setName("Mansah");
    p1.setAge(4);
    p2.setPerson("Bob", 34);
    
    // uncomment the following line to test an invalid age
    //p1.setAge(-3);
    
    System.out.println("p1 is now " + p1.getName() + " who is " +
                       p1.getAge() + " years old.");
    System.out.println("p2 is now " + p2.getName() + " who is " +
                       p2.getAge() + " years old.");
    System.out.println();

    // Test the equals() method
    if (p1.equals(p3))
      System.out.println("p1 and p3 are equal.");
    else
      System.out.println("p1 and p3 are not equal.");
    
    if (p2.equals(p4))
      System.out.println("p2 and p4 are equal.");
    else
      System.out.println("p2 and p4 are not equal.");

    System.out.println();

    // Test the hasSameNameAs() method
    if (p1.hasSameNameAs(p4))
      System.out.println("p1 and p4 have the same name.");
    else
      System.out.println("p1 and p4 do not have the same name.");
    
    if (p2.hasSameNameAs(p4))
      System.out.println("p2 and p4 have the same name.");
    else
      System.out.println("p2 and p4 do not have the same name.");

    System.out.println();

    // Test the hasSameAgeAs() method
    if (p1.hasSameAgeAs(p2))
      System.out.println("p1 and p2 have the same age.");
    else
      System.out.println("p1 and p2 do not have the same age.");

    if (p1.hasSameAgeAs(p4))
      System.out.println("p1 and p4 have the same age.");
    else
      System.out.println("p1 and p4 do not have the same age.");
    
    System.out.println();

    // Test the isOlderThan() method
    if (p1.isOlderThan(p2))
      System.out.println("p1 is older than p2.");
    else
      System.out.println("p1 is not older than p2.");

    if (p2.isOlderThan(p1))
      System.out.println("p2 is older than p1.");
    else
      System.out.println("p2 is not older than p1.");
    
    System.out.println();

    // Test the isYoungerThan() method
    if (p1.isYoungerThan(p2))
      System.out.println("p1 is younger than p2.");
    else
      System.out.println("p1 is not younger than p2.");

    if (p2.isYoungerThan(p1))
      System.out.println("p2 is younger than p1.");
    else
      System.out.println("p2 is not younger than p1.");
    
    System.out.println();
    
  }
}