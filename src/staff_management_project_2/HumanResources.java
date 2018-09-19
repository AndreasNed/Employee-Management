package staff_management_project_2;

import com.sun.prism.impl.PrismSettings;
import java.util.ArrayList;
import java.util.Scanner;

public class HumanResources {

    static Scanner sc = new Scanner(System.in);
    public static ArrayList<Employee> empolyeeList = new ArrayList<>();

    public static void printMenu() {
        String listSelect = "";
        while (!listSelect.equals("0")) {
            System.out.println("LIST MENU:");
            System.out.println("1) List all Managers");
            System.out.println("2) List all Technicians");
            System.out.println("3) List all Accountant");
            System.out.println("4) List All");
            System.out.println("5) List employee by ID");
            System.out.println("0) Cancel");
            listSelect = sc.nextLine();
            switch (listSelect) {
                case "1":
                    printManagers();
                    break;
                case "2":
                    printTechnicians();
                    break;
                case "3":
                    printAccountant();
                    break;
                case "4":
                    printAll();
                    break;
                case "5":
                    printSingle();
                    break;
                case "0":
                    break;
            }

        }
    }

    public static void addEmployee() {
        System.out.print("First name of employee: ");
        String firstName = sc.nextLine();
        System.out.print("Last name of employee: ");
        String surName = sc.nextLine();
        System.out.println("Gender:");
        System.out.print("Male, Female, Other: ");
        String gender = sc.nextLine();

        System.out.println("What type of employee is " + firstName + "?");
        System.out.println("1) Manager\n2) Technician\n3) Accountant");

        String typeOfEmployee = sc.nextLine();

        switch (typeOfEmployee) {
            case "1":
                empolyeeList.add(new Manager(firstName, surName, gender));
                System.out.println(firstName + " added to list");
                break;

            case "2":
                empolyeeList.add(new Technician(firstName, surName, gender));
                System.out.println(firstName + " added to list");
                break;

            case "3":
                empolyeeList.add(new Accountant(firstName, surName, gender));
                System.out.println(firstName + " added to list");
                break;

        }

    }

    public static void removeEmployee() {
        System.out.println("Enter ID of employee you would like to remove");
        int remove = readNumber();

        System.out.println("Are you sure you would like remove - " + getEmployeeByID(remove));
        System.out.print("Yes or No: ");

        String removeChecker = sc.nextLine();
        if (removeChecker.equalsIgnoreCase("yes")) {
            empolyeeList.remove(getEmployeeByID(remove));
            System.out.println("Employee removed");
        } else if (removeChecker.equalsIgnoreCase("no")) {
            System.out.println("Canceling");
        }

    }

    public static void updateEmployee() {
        System.out.print("ID of person to update: ");
        int getId = readNumber();
        Employee e = getEmployeeByID(getId);
        if (e == null) {
            return;
        } else {
            System.out.println(e);
            System.out.print("Update first name (Leave blank to skip): ");
            String updateVar = sc.nextLine();
            if (!updateVar.equals("")) {
                e.setFirstName(updateVar);
            }
            System.out.print("Update last name (Leave blank to skip): ");
            updateVar = sc.nextLine();
            if (!updateVar.equals("")) {
                e.setSurName(updateVar);
            }
            System.out.print("Update gender (Leave blank to skip): ");
            updateVar = sc.nextLine();
            if (!updateVar.equals("")) {
                e.setGender(updateVar);
            }
            System.out.println("Hourly wage (Leave blank to skip): ");
            int updateInt = readNumber();
            if (updateInt != -1) {
                e.setHourlyWage(updateInt);
            }
        }
    }

    private static Employee getEmployeeByID(int id) {
        for (Employee employee : empolyeeList) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        System.out.println("no employee found with ID: " + id);
        return null;

    }

    public static int readNumber() {

        String strNum;
        int num;
        try {
            strNum = sc.nextLine();
            num = Integer.parseInt(strNum);
        } catch (Exception e) {
            num = -1;
        }
        return num;
    }

    public static void debugg() {
        empolyeeList.add(new Manager("Andreas", "Nedbal", "Male"));
        empolyeeList.add(new Technician("Pontus", "Paulsson", "Other"));
        empolyeeList.add(new Accountant("Emma", "Nilsson", "Female"));
        empolyeeList.add(new Manager("Jakob", "Lundin", "Male"));
        empolyeeList.add(new Technician("John", "Doe", "Other"));
        empolyeeList.add(new Technician("Nisse", "Hult", "Male"));
        empolyeeList.add(new Accountant("Stina", "Johansson", "Female"));
    }

    private static void printManagers() {
        for (Employee employee : empolyeeList) {
            if (employee instanceof Manager) {
                System.out.println(employee);
            }

        }
    }

    private static void printTechnicians() {
        for (Employee employee : empolyeeList) {
            if (employee instanceof Technician) {
                System.out.println(employee);
            }
        }
    }

    private static void printAccountant() {
        for (Employee employee : empolyeeList) {
            if (employee instanceof Accountant) {
                System.out.println(employee);
            }
        }
    }

    private static void printAll() {
        for (Employee employee : empolyeeList) {
            System.out.println(employee);
        }
    }

    public static void printSingle() {
        System.out.println("Enter ID of employee");
        int id = readNumber();
        System.out.println(getEmployeeByID(id));
    }
}
