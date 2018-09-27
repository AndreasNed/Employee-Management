package staff_management_project_2;

public class HRStatistics {

    public static boolean run = true;
    //STATS MENU
    public static void statsMenu() {

        while (run) {
            System.out.println("STATISTICS MENU:");
            System.out.println("1) Average salary");
            System.out.println("2) Gender distribution");
            System.out.println("3) Show bonus overall and per role");
            System.out.println("4) List highest and lowest salary");
            System.out.println("0) Back");

            int choice = HumanResources.readNumber();

            switch (choice) {
                case 1:
                    calculateAverageSalary();
                    break;
                case 2:
                    showGenderDistribution();
                    break;
                case 3:
                    showBonusPayment();
                    break;
                case 4:
                    showHigestAndLowestSalary();
                    break;
                case 0:
                    run = false;
                    break;
            }

        }
    }
    //METHOD TO CALCULATE AVERAGE SALARY BETWEEN ALL EMPLOYEES IN employeeList
    public static void calculateAverageSalary() {
        double averageSalary = 0;
        for (Employee employee : HumanResources.empolyeeList) {
            averageSalary = employee.calculateSalary() + averageSalary;
        }
        System.out.println("Average salary: " + averageSalary / (double) HumanResources.empolyeeList.size());
    }
    //METHOD TO SHOW GENDER DISTIRUBTION IN DIFFERENT DEPARTMENTS AND FROM ALL EMPLOYEES
    public static void showGenderDistribution() {

        //GENDER DISTRIBUTION IN MANAGER
        int maleManagerCount = 0;
        int femaleManagerCount = 0;
        int otherManagerCount = 0;
        for (Employee employee : HumanResources.empolyeeList) {
            if (employee instanceof Manager) {
                if (employee.getGender().equalsIgnoreCase("male")) {
                    maleManagerCount++;
                } else if (employee.getGender().equalsIgnoreCase("female")) {
                    femaleManagerCount++;
                } else {
                    otherManagerCount++;
                }
            }

        }
        int maleManagerPercentage = 0;
        int femaleManagerPercentage = 0;
        int otherManagerPercentage = 0;

        if (maleManagerCount > 0) {
            maleManagerPercentage = (int) ((maleManagerCount / (double) (maleManagerCount + femaleManagerCount + otherManagerCount)) * 100);
        }
        if (femaleManagerCount > 0) {
            femaleManagerPercentage = (int) ((maleManagerCount / (double) (maleManagerCount + femaleManagerCount + otherManagerCount)) * 100);
        }

        if (otherManagerCount > 0) {
            otherManagerPercentage = (int) ((maleManagerCount / (double) (maleManagerCount + femaleManagerCount + otherManagerCount)) * 100);
        }
        //GENDER DISTRIBUTION IN TECHNICIAN
        int maleTechnichanCount = 0;
        int femaleTechnicianCount = 0;
        int otherTechnichianCount = 0;

        for (Employee employee : HumanResources.empolyeeList) {
            if (employee instanceof Technician) {
                if (employee.getGender().equalsIgnoreCase("male")) {
                    maleTechnichanCount++;
                } else if (employee.getGender().equalsIgnoreCase("female")) {
                    femaleTechnicianCount++;
                } else {
                    otherTechnichianCount++;
                }
            }
        }
        int maleTechnicianPercentage = 0;
        int femaleTechnicianPercentage = 0;
        int otherTechnicianPercentage = 0;

        if (maleTechnichanCount > 0) {
            maleTechnicianPercentage = (int) ((maleTechnichanCount / (double) (maleTechnichanCount + femaleTechnicianCount + otherTechnichianCount)) * 100);
        }
        if (femaleTechnicianCount > 0) {
            femaleTechnicianPercentage = (int) ((femaleTechnicianCount / (double) (maleTechnichanCount + femaleTechnicianCount + otherTechnichianCount)) * 100);
        }

        if (otherTechnichianCount > 0) {
            otherTechnicianPercentage = (int) ((otherTechnichianCount / (double) (maleTechnichanCount + femaleTechnicianCount + otherTechnichianCount)) * 100);
        }
        //GENDER DISTRIBUTION IN ACCOUNTANT
        int maleAccountantCount = 0;
        int femaleAccountantCount = 0;
        int otherAccountantCount = 0;

        for (Employee employee : HumanResources.empolyeeList) {
            if (employee instanceof Accountant) {
                if (employee.getGender().equalsIgnoreCase("male")) {
                    maleAccountantCount++;
                } else if (employee.getGender().equalsIgnoreCase("female")) {
                    femaleAccountantCount++;
                } else {
                    otherAccountantCount++;
                }
            }
        }
        int maleAccountantPercentage = 0;
        int femaleAccountantPercentage = 0;
        int otherAccountnatPercentage = 0;

        if (maleAccountantCount > 0) {
            maleAccountantPercentage = (int) ((maleAccountantCount / (double) (maleAccountantCount + femaleAccountantCount + otherAccountantCount)) * 100);
        }
        if (femaleAccountantCount > 0) {
            femaleAccountantPercentage = (int) ((femaleAccountantCount / (double) (maleAccountantCount + femaleAccountantCount + otherAccountantCount)) * 100);
        }

        if (otherAccountantCount > 0) {
            otherAccountnatPercentage = (int) ((otherAccountantCount / (double) (maleAccountantCount + femaleAccountantCount + otherAccountantCount)) * 100);
        }
        //GENDER DISTRIBUTION OVERALL
        int maleCount = 0;
        int femaleCount = 0;
        int otherCount = 0;
        for (Employee employee : HumanResources.empolyeeList) {
            if (employee.getGender().equalsIgnoreCase("male")) {
                maleCount++;
            } else if (employee.getGender().equalsIgnoreCase("female")) {
                femaleCount++;
            } else {
                otherCount++;
            }
        }
        int malePercentage = 0;
        int femalePercentage = 0;
        int otherPercentage = 0;

        if (maleCount > 0) {
            malePercentage = (int) ((maleCount / (double) HumanResources.empolyeeList.size()) * 100);
        }

        if (femaleCount > 0) {
            femalePercentage = (int) ((femaleCount / (double) HumanResources.empolyeeList.size()) * 100);
        }

        if (otherCount > 0) {
            otherPercentage = (int) ((otherCount / (double) HumanResources.empolyeeList.size()) * 100);
        }
        System.out.println("Total gender distribution:");
        System.out.println("Male employees: " + maleCount + ", " + malePercentage + "%");
        System.out.println("Female employees: " + femaleCount + ", " + femalePercentage + "%");
        System.out.println("Other employees: " + otherCount + ", " + otherPercentage + "%\n");
        System.out.println("Gender distribution among Managers: ");
        System.out.println("Male managers: " + maleManagerCount + ", " + maleManagerPercentage + "%");
        System.out.println("Female managers: " + femaleManagerCount + ", " + femaleManagerPercentage + "%");
        System.out.println("Other managers: " + otherManagerCount + ", " + otherManagerPercentage + "%\n");
        System.out.println("Gender distribution among Technicians: ");
        System.out.println("Male technicians: " + maleTechnichanCount + ", " + maleTechnicianPercentage + "%");
        System.out.println("Female technicians: " + femaleTechnicianCount + ", " + femaleTechnicianPercentage + "%");
        System.out.println("Other technicians: " + otherTechnichianCount + ", " + otherTechnicianPercentage + "%\n");
        System.out.println("Gender distribution among Accountants: ");
        System.out.println("Male accountant: " + maleAccountantCount + ", " + maleAccountantPercentage + "%");
        System.out.println("Female accountant: " + femaleAccountantCount + ", " + femaleAccountantPercentage + "%");
        System.out.println("Other accountant: " + otherAccountantCount + ", " + otherAccountnatPercentage + "%");

    }
    //METHOD TO SHOW HOW MUCH BONUS IN DISTRIBUTED BETWEEN DEPARTMENTS
    public static void showBonusPayment() {
        double bonusManager = 0;
        double bonusTechnician = 0;
        double bonusAccountant = 0;
        for (Employee employee : HumanResources.empolyeeList) {
            if (employee instanceof Manager) {
                bonusManager += employee.calculateBonus();
            } else if (employee instanceof Technician) {
                bonusTechnician += employee.calculateBonus();
            } else if (employee instanceof Accountant) {
                bonusAccountant += employee.calculateBonus();
            }

        }
        System.out.println("Bonus distibuted to Managers = " + bonusManager);
        System.out.println("Bonus distibuted to Technicians = " + bonusTechnician);
        System.out.println("Bonus distibuted to Accountats = " + bonusAccountant);
        System.out.println("Bonus payment overall = " + (bonusManager + bonusTechnician + bonusAccountant));

    }
    //METHOD TO SHOW HIGHEST AND LOWEST SALARY BETWEEN EMPLOYEES
    private static void showHigestAndLowestSalary() {
        Employee hi = HumanResources.empolyeeList.get(0);
        Employee lo = HumanResources.empolyeeList.get(0);

        for (Employee employee : HumanResources.empolyeeList) {
            if (employee.calculateSalary() > hi.calculateSalary()) {
                hi = employee;
            } else {
                lo = employee;
            }
        }
        System.out.println("Higest salary:" + hi.calculateSalary());
        System.out.println("Lowest salary:" + lo.calculateSalary());
    }
}
