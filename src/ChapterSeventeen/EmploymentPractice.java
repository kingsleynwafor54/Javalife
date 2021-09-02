package ChapterSeventeen;

import java.io.ObjectStreamClass;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class EmploymentPractice {

    public static void main(String[] args) {

        Employee[] employees = new Employee[7];
        employees[0] = new Employee("Kingsley", "Nwafor", 4000, "computer-science");
        employees[2] = new Employee("John", "Richard", 6000, "physics");
        employees[3] = new Employee("Peter", "Okafor", 1000, "Agric-science");
        employees[4] = new Employee("Peter", "Okonkwo", 1000, "computer-science");
        employees[5] = new Employee("Franklin", "Israel", 1000, "computer-science");
        employees[6] = new Employee("Joseph", "Peter", 3000, "biological-sciences");
        employees[1] = new Employee("Raphel", "Mende", 4200, "computer-science");

        List<Employee> list = Arrays.asList(employees);
//            System.out.println(list);
//        list.forEach(System.out::println);
        Predicate<Employee> fourToSixThousand= e->(e.getSalary()>=4000 && e.getSalary()<=6000);
        System.out.printf("People that are being paid salary greater than $4000 and not less than $6000 %n");
    list.stream()
     .filter(fourToSixThousand)
            .sorted(Comparator.comparing(Employee::getFirstName))
             .forEach(System.out::println);

 Employee stream=       list.stream()
                .filter(fourToSixThousand)
                .sorted(Comparator.comparing(Employee::getFirstName))
                .findFirst()
                .get();

        System.out.println("I found this guy first -> "+stream);


        Function<Employee,String> byFirstName=Employee::getFirstName;
        Function<Employee,String> byLastName=Employee::getLastName;
        Comparator<Employee> lastThenFirst= Comparator.comparing(byLastName).thenComparing(byFirstName);


            list.stream()
                .filter(fourToSixThousand)
                .sorted(lastThenFirst)
                    .forEach(System.out::println);




    }
}

