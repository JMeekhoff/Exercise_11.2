/**
 * **THIS CLASS IS IN CONJUNCTION WITH EXERCISE 11.2**
 * 
 * James Meekhoff 
 */

package programming_exercises;

// Create the faculty class, a subclass of Employee:

public class Faculty extends Employee {
        
  private String officeHours;
  private String rank;

  public Faculty(String name, String address, String phone, String email, int office, double salary,
          String officeHours, String rank) {
      super(name, address, phone, email, office, salary);

      this.officeHours = officeHours;
      this.rank = rank;
  }
  
  public String getOfficeHours() {
    return officeHours;
}

public void setOfficeHours(String officeHours) {
    this.officeHours = officeHours;
}

public String getRank() {
    return rank;
}

public void setRank(String rank) {
    this.rank = rank;
}

public String toString() {
    System.out.println("Class name is " + this.getClass() + "name " + this.getName());
    return officeHours;
    
    }

}
