package ChapterTen;

public class BaseCommissionEmployee extends CommissionEmployee{
    private double baseSalary;



    public BaseCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionSale){
        super(firstName,lastName,socialSecurityNumber,grossSale,commissionSale);
        if(baseSalary<0.0){
            throw new IllegalArgumentException("baseSalary can not be zero or negative");
        }

    }
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary<0.0){
            throw new IllegalArgumentException("baseSalary can not be zero or negative");
        }
        this.baseSalary = baseSalary;
    }
    @Override
    public double earnings(){
        return getBaseSalary()+super.earnings();
    }
    @Override
    public String toString()
    {
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }
}
