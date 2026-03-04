public abstract class Employee {
    protected String name;
    protected int id;
    protected double base_salary;
    protected String EmployeeType;

    public Employee(String name,int id,double base_salary,String EmployeeType){
        this.name = name;
        this.id   = id;
        this.base_salary = base_salary;
        this.EmployeeType = EmployeeType;
    }

    public abstract double calculate_salary();

    public void generatePayslip(){
        System.out.println("----------Employee payslip-------");
        System.out.println("Name : " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employement Tye: " + EmployeeType);
        System.out.println("salary : " + calculate_salary());
        System.out.println("-----------------------------------");
    }

    public String getname(){
        return this.name;
    }

    public int getid(){
        return this.id;
    }
}
