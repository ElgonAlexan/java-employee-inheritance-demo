
import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String fistName = input.nextLine();

        System.out.println("Enter lastname: ");
        String lastName = input.nextLine();
        input.nextLine();

        System.out.println("Enter employeeID:\t ");
        int employeeID = input.nextInt();

        System.out.println("Enter hired date:\t ");
        String hireDate = input.nextLine();

        System.out.println("Department: \t");
        String department= input.nextLine();
        input.nextLine();

        System.out.println("Number of Subordinates:\t ");
        int sub = input.nextInt();

        System.out.println("Enter sales region:\t ");
        String salesRegion = input.nextLine();
        input.nextLine();

        //Employee object
        Employee E1 = new Employee(fistName,lastName,employeeID,hireDate);

        //Manager object
        Employee manager = new Manager(fistName,lastName,employeeID,hireDate,department,sub);

        //Sales object
        Employee S1 = new SalesPerson(fistName, lastName, employeeID, hireDate,salesRegion);

        input.close();

        System.out.println("============OUTPUT=============");
        System.out.println("First name  :"+E1.getFirstName());
        System.out.println("Last name   :"+E1.getLastName());
        System.out.println("EmployeeID  :"+E1.getEmployeeID());
        System.out.println("Department  :"+department);
        System.out.println("Subordinates: "+sub);
        System.out.println("Sales region:"+salesRegion);
        System.out.println("Date hired  :"+hireDate);
        System.out.println("==============END===============");
    }
}