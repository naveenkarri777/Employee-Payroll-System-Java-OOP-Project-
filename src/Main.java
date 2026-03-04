import java.util.*;

public class Main {
   public static void main(String[] args){
       
    ArrayList<Employee>employees = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    while(true){
        System.out.println("\n===== Employee Payroll System =====");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Add Contract Employee");
            System.out.println("4. Generate Payslips");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

             switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name1 = sc.nextLine();
                    System.out.print("Enter Base Salary: ");
                    double baseSalary = sc.nextDouble();
                    System.out.print("Enter Bonus: ");
                    double bonus = sc.nextDouble();
                    String EmployeeType = "FullTimeEmployee";

                    employees.add(new FullTimeEmployee(name1, id1,baseSalary,EmployeeType, bonus));
                    System.out.println("Full-Time Employee Added!");
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int id2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name2 = sc.nextLine();
                    System.out.print("Enter Hours Worked: ");
                    int hours = sc.nextInt();
                    System.out.print("Enter Hourly Rate: ");
                    double rate = sc.nextDouble();
                    String EmployeeType2 = "PartTimeEmployee";

                    employees.add(new PartTimeEmployee(id2, name2,EmployeeType2,hours,rate));
                    System.out.println("Part-Time Employee Added!");
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int id3 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name3 = sc.nextLine();
                    System.out.print("Enter Contract Amount: ");
                    double amount = sc.nextDouble();
                    String EmployeeType3 = "ContractEmployee";

                    employees.add(new ContractEmployee(id3, name3, amount,EmployeeType3));
                    System.out.println("Contract Employee Added!");
                    break;

                case 4:
                    System.out.println("\nGenerating Payslips...");
                    for (Employee emp : employees) {
                        emp.generatePayslip();
                    }
                    break;

                case 5:
                    System.out.println("Exiting System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}