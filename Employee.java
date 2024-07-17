public class Employee {
   //establish firstName, lastName, and socialSecurityNumber Protected Final String Variables
   protected final String firstName;                              
   protected final String lastName;                               
   protected final String socialSecurityNumber;    

   public Employee(String firstName, String lastName, 
      String socialSecurityNumber) {
        
      this.firstName = firstName;
      this.lastName = lastName;
      this.socialSecurityNumber = socialSecurityNumber;
   }

   // return last name
   public String getFirstName() {
      return this.firstName;
   }
  
   // return last name
   public String getLastName() {
      return this.lastName;
   }
  
   // return social security number
   public String getSocialSecurityNumber() {
      return this.socialSecurityNumber;
   }

   // return String representation of Employee object
   @Override 
   public String toString() {
      return String.format("%s %s", 
         getFirstName(), getLastName(), 
         "social security number", getSocialSecurityNumber()) 
         ;
   } 

}
