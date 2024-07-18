// Name: Laith Wajeeh
// Class: CS 145
// Assignment: Lab_3: Employee Hierarchy
// Sources: w3schools.com and stackexchange.com.
// Purpose: Demonstrates the use of polymorphism and inheritance to manage employee wages.

//tests BasePlusCommissionEmployee class and, by extent, its inharited classes.
public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        //establishes BasePlusCommissionEmployee object emp
        BasePlusCommissionEmployee emp = new BasePlusCommissionEmployee(
            "Laith",
            "Wajeeh",
            "2024",
            500000, 
            .10, 
            100000);

        //writes out some demonstration info.
        System.out.println("Tests/Demos:\n\nFirst Name:" + emp.getFirstName());
        System.out.println("Last Name:" + emp.getLastName());
        System.out.println("Social Security Number:" + emp.getSocialSecurityNumber());
        System.out.println("Gross Sales:" + emp.getGrossSales());
        System.out.println("Commission Rate:" + emp.getCommissionRate());
        System.out.println("Base Salary:" + emp.getBaseSalary() + "\n");
        System.out.println("Earnings:" + emp.earnings());
        System.err.println("\n------------------------------------\n\ntoString output:\n\n" + emp.toString());

        System.err.println("\n------------------------------------\n\nChange some values:\n");
        emp.setGrossSales(400000);
        System.out.println("Gross Sales:" + emp.getGrossSales());
        emp.setCommissionRate(0.20);
        System.out.println("Commission Rate:" + emp.getCommissionRate());
        emp.setBaseSalary(150000);
        System.out.println("Base Salary:" + emp.getBaseSalary() + "\n");
        System.out.println("Earnings:" + emp.earnings());
        System.err.println("\n------------------------------------\n\ntoString output:\n\n" + emp.toString() + "\n");


        
    }
}
