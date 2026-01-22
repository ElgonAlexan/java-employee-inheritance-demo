import java.sql.Date;

public class SalesPerson extends Employee{
    private String salesRegion;

    SalesPerson(String firstName, String lastName, int employeeID, String hireDate,String salesRegion){
        super(firstName,lastName,employeeID,hireDate);
        this.salesRegion=salesRegion;
    }

    public String getSalesRegion() {
        return salesRegion;
    }

    public String toString(){
        return "Sales region "+salesRegion;
    }
}
