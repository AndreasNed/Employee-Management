package staff_management_project_2;

public class Accountant extends Employee {

    private static final double BONUS = 7000;
    private static final double DEFUALT_WAGE = 200;

    public Accountant(String firstName, String surName, String gender) {
        super(firstName, surName, gender, DEFUALT_WAGE);
    }

    @Override
    public String toString() {
        return super.toString() + ", Accountant";
    }

    @Override
    public double calculateBonus() {
        return BONUS;
    }
    

}
