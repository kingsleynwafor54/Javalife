package ChapterTen;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionSales;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionSales) {
        super(firstName, lastName, socialSecurityNumber);
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("grossSales cant be less than 0.0");
        }
        if (commissionSales < 0.0) {
            throw new IllegalArgumentException("commission cant be less than 0.0;");
        }
        this.commissionSales=commissionSales;
        this.grossSales=grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("grossSales cant be less than 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionSales() {
        return commissionSales;
    }

    public void setCommissionSales(double commissionSales) {
        if (commissionSales < 0.0) {
            throw new IllegalArgumentException("commission cant be less than 0.0;");
        }
        this.commissionSales = commissionSales;
    }

    @Override
    public double earnings() {
        return getCommissionSales() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionSales());
    }
}