package ChapterTen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayRollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee =
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee =
                new CommissionEmployee(
                        "Sue", "Jones", "333-33-3333", 10000, .06);
        BaseCommissionEmployee basePlusCommissionEmployee =
                new BaseCommissionEmployee(
                        "Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);

        System.out.println("Employees processed individually:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                basePlusCommissionEmployee,
                "earned", basePlusCommissionEmployee.earnings());
        //creating four-element Employee arrays
        Scanner scanner=new Scanner(System.in);
//        List<Employee> employeeList=new ArrayList<>();

        Employee [] employees=new Employee[4];
        employees[0]=salariedEmployee;
        employees[1]=hourlyEmployee;
        employees[2]=basePlusCommissionEmployee;
        employees[3]=commissionEmployee;
        for(int counter=0;counter<employees.length;counter++){

            System.out.println(employees[counter]);
            if (employees[counter] instanceof BaseCommissionEmployee){
                BaseCommissionEmployee employee=(BaseCommissionEmployee) employees[counter];
                employee.setBaseSalary(1.0*employee.getBaseSalary());
               System.out.printf("%,.2f%n",employee.getBaseSalary());
            }
            System.out.printf(":$%,.2f%n",employees[counter].earnings());
        }
    for (int counter =0;counter<employees.length;counter++){
        System.out.println(employees[counter].getClass().getName());
        }
    }
}