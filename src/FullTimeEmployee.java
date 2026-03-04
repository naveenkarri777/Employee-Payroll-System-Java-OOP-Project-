public class FullTimeEmployee extends Employee{
    private double bonus;

    public FullTimeEmployee(String name,int id,double salary,String EmployeeType,double bonus){
         super(name,id,salary,EmployeeType);
         this.bonus = bonus;
    }

    @Override
    public double calculate_salary(){
        return base_salary + bonus;
    }
}
