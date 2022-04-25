/**
 * **THIS CLASS IS IN CONJUNCTION WITH EXERCISE 11.2**
 * 
 * James Meekhoff 
 */

import java.util.Date;

package programming_exercises;

//Create the Employee class, a subclass of Person.java:

public class Employee extends Person {

  private int office;
  private double salary;
  private java.util.Calendar dateHired;
  
  public Employee(String name, String address, String phone, String email, int office2, double salary2) {
    Date dateCreated = new java.util.Date();

    }
  
  public Employee(String name) {
    super(name);
    Date dateCreated = new java.util.Date();

  }
  
  public String toString() {
    System.out.println("name" + getName() +" " + "Class name is Employee");

}

}
