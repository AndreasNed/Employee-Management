
package staff_management_project_2;

public abstract class Employee {
        
    private String firstName;
    private String surName;
    private int ID;
    private String gender;
    private static int nEmployee;
    private double salaryPerHour;
    private final static double WORKING_HOURS_PER_MONTH = 40;
    private double hoursWorked;
    
    
    public Employee(String firstName, String surName, String gender){
        this.firstName = firstName;
        this.surName = surName;
        this.ID = nEmployee;
        this.gender = gender;        
        nEmployee++;
        
    }
    
    
    
    
    
}
