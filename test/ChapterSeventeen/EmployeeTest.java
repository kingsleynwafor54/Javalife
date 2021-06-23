package ChapterSeventeen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeTest {
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }
    @Test
    void displayingEmployeesNamesTest(){
   Employee[] employees= {new Employee("Kingsley", "Nwafor", 1000000.00, "Physics"),
           new Employee("John","Kenedy",200000.00,"computer science"),
           new Employee("Ogbonna","Kenedy",200000.00,"Agric science"),
           new Employee("Ogbonna","Peter",200000.00,"Radiological science"),
   };

        List<Employee>list= Arrays.asList(employees);
        System.out.println("complete employee list");
        list.stream().forEach(System.out::println);
        Predicate<Employee> fourToSixThousand =
                        e -> (e.getSalary() >= 100000&& e.getSalary() <= 400000);
        System.out.printf("%nEmployees earning $4000-$6000 per month sorted by salary:%n");
        list.stream()
                .filter(fourToSixThousand)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
                list.stream()
                    .filter(fourToSixThousand)
                    .findFirst()
                    .get());
        Predicate<Employee> fourToSixThousand1 =
                e -> (e.getDepartment() =="computer science" || e.getDepartment() =="Physics");
        System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
                list.stream()
                        .filter(fourToSixThousand1)
                        .findFirst()
                        .get());
    }

}
