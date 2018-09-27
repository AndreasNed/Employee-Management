
package staff_management_project_2;

public class Main {
    
    static boolean run = true;  // boolean to run the program (Main)
    public static void main(String[] args) {
        
        HumanResources.debugg();
        
        while(run){
            mainMenu(); // Main menu, runs while 'run' is true
        }
                
    }
    // MAIN MENU
    public static void mainMenu(){
        System.out.println("MAIN MENU");
        System.out.println("1) Add new Employee");
        System.out.println("2) Fire Employee");
        System.out.println("3) Update Employee");
        System.out.println("4) List menu");
        System.out.println("5) Statistics menu");
        System.out.println("0) Exit");
        
        switch(HumanResources.readNumber()){
            case 1:
                HumanResources.addEmployee();
                break;
            case 2:
                HumanResources.removeEmployee();
                break;
            case 3:
                HumanResources.updateEmployee();
                break;
            case 4:
                HumanResources.printMenu();
                break;
            case 5:
                HRStatistics.statsMenu();
                break;
            case 0:
                System.out.println("Exiting");
                run = false;
                break;
        }
        
    }
    
}
