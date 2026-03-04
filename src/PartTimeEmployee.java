public class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name,String EmployeeType ,int hoursWorked, double hourlyRate) {
        super(name, id,0,EmployeeType);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculate_salary() {
        return hoursWorked * hourlyRate;
    }

}
