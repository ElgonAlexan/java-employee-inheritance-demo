

public class Manager extends Employee{

    private String department;
    private int numberOfSubordinates;

    Manager(String firstName, String lastName, int employeeID, String hireDate, String department, int numberOfSubordinates){
        super(firstName,lastName,employeeID,hireDate);
        this.department=department;
        this.numberOfSubordinates=numberOfSubordinates;
    }

    String getDepartment(){
        return department;
    }

    int getNumberOfSurbordinates(){
        return numberOfSubordinates;
    }

    public String toString(){
        return "The department is: "+department+" Number of Surbordinates are: "+numberOfSubordinates;
    }




}
