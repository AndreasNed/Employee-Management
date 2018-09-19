package staff_management_project_2;

public class Technician extends Employee {

    private static final double BONUS = 2500;
    private static final double DEFUALT_WAGE = 150;

    public Technician(String firstName, String surName, String gender) {
        super(firstName, surName, gender, DEFUALT_WAGE);

    }

    @Override
    public String toString() {
        return super.toString() + ", Technician";
    }

    @Override
    public double calculateBonus() {
        return BONUS;
    }

}
