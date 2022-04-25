/**
 * **THIS CLASS IS IN CONJUNCTION WITH EXERCISE 11.2**
 * 
 * James Meekhoff 
 */

package programming_exercises;

// Create the Student class, a subclass of Person.java:

public class Student extends Person {
       

  public final int status = 0;
  public static final int FRESHMAN = 1;
  public static final  int SOPHOMORE = 2;
  public static final int JUNIOR = 3;
  public static final int SENIOR = 4;
  
  public Student(String name) {
    super(name);
    }
  
// Return a string that describes the class.

  public String toString() {
    
    System.out.println("Class name is " + this.getClass() + " " +
super.toString());
    return null;

    }

}
