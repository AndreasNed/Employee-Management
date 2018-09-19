package staff_management_project_2;

public abstract class Employee {

    private String firstName;
    private String surName;
    private int id;
    private String gender;
    private static int nEmployee;
    private double hourlyWage;
    private static final double HOURS_PER_MONTH = 165;

    public Employee(String firstName, String surName, String gender, double hourlyWage) {
        this.firstName = firstName;
        this.surName = surName;
        this.id = nEmployee;
        this.gender = gender;
        this.hourlyWage = hourlyWage;
        nEmployee++;
    }

    public double calculateSalary() {
        return hourlyWage * HOURS_PER_MONTH;
    }

    public abstract double calculateBonus();

    @Override
    public String toString() {
        return ("[" + id + "]" + firstName + " " + surName + " (" + gender + ") " + calculateSalary());
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public String getGender() {
        return gender;
    }

}
