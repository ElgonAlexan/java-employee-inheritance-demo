

public class Employee {
    private String firstName;
    private String lastName;
   private int  employeeID;
   private String hireDate;

   Employee(String firstName, String lastName, int employeeID, String hireDate){
       this.firstName=firstName;
       this.lastName=lastName;
       this.employeeID=employeeID;
       this.hireDate=hireDate;

   }

   String getFirstName(){
       return firstName;
   }

    String getLastName(){
        return lastName;
    }

    int getEmployeeID(){
        return employeeID;
    }

    public String getHireDate(){
        return hireDate;
    }
}
