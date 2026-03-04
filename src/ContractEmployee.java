    public class ContractEmployee extends Employee {
    private double contractAmount;

    public ContractEmployee(int id, String name, double contractAmount,String EmployeeType) {
        super(name, id, 0,EmployeeType);
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculate_salary() {
        return contractAmount;
    }
}
