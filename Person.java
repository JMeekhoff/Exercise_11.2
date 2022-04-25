/**COSC211 Programming Exercise 11.2
 * 
 * James Meekhoff
 * 
 * This program is the program that corresponds to the UML Diagram assignment. 
 * This program acts as a data base for sorting different kinds of people, using
 * classes, subclasses and statuses. Each different class in this file is a
 * subclass that stores different information about different types of people, that all 
 * stack on top of each other in a way, with each different type of person getting 
 * more complex and specific. 
 */

package programming_exercises;

public class Person {
        
  private String name;
  protected static String address;
  private String phoneNumber;
  private String emailAddress;
  
// Construct a default person. 
  
  public Person() {
    
  }

// Construct a Person with a specific name, address, phone, and email. 
  
  public Person(String name) {
    this.name = name;
    }
// Return that specified name. 
  
  public String getName() {
    return name;
  }
// Return a string statement that describes the class.   
  
  public String toString() {
    
    return "Class name is " + this.getClass() + " " + 
    "name: " + this.getName();

}

}
