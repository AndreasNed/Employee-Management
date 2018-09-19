package staff_management_project_2;

public class Manager extends Employee {

    private static final double BONUS = 5000;
    private static final double DEFUALT_WAGE = 500;

    public Manager(String firstName, String surName, String gender) {
        super(firstName, surName, gender, DEFUALT_WAGE);
    }

    @Override
    public String toString() {
        return super.toString() + ", Manager";
    }

    @Override
    public double calculateBonus() {
        return BONUS;
    }

}
