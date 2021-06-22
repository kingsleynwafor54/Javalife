package ChapterFifteen;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Formatter;
import java.util.Scanner;

public class StudentRecorder {
    public void saveRecords() {
        //create and open a file
        try (Formatter formatter = new Formatter("student_recorder.txt");
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter Students records and Enter+CTRL +D to stop");
            System.out.printf("%s %s %s %s %s", "FirstName", "LastName", "Level", "Year", "Age");
            while (scanner.hasNext()) {
                String firstName = scanner.next();
                String lastName = scanner.next();
                int level = scanner.nextInt();
                int year = scanner.nextInt();

                formatter.format("%s %s %d %d %dn", firstName, lastName, level, year, LocalDate.now().getYear() - year
                );
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StudentRecorder studentRecorder=new StudentRecorder();
        studentRecorder.saveRecords();
    }
}
