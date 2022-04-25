/**
 * **THIS CLASS IS IN CONJUNCTION WITH EXERCISE 11.2**
 * 
 * James Meekhoff 
 */
package programming_exercises;

// Create the staff class, a subclass of employee:

public class Staff extends Employee {

  private String title;

  public Staff(String name) {
      super(name, address);
      this.title = title;

  }

  public String getTitle() {
      return title;
  }

  public void setTitle(String title) {
      this.title = title;
  }

  // Return a string Statement that describes the class. 
  public String toString() {
      
      System.out.println("name" + this.getName() + " " + "Class name is " + this.getClass());
  }
}
