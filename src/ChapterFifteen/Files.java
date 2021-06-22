package ChapterFifteen;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Files {
    private static Scanner input;
        public static void main(String[] args)
         {
            openFile();
            readRecords();
             closeFile();
             }
        // open file clients.txt
         public static void openFile()
         {
            try
            {
                input = new Scanner(Paths.get("clients.txt"));
            }
            catch (IOException ioException)
             {
             System.err.println("Error opening file. Terminating.");
                 System.exit(1);
         }
         }
    // read record from file
 public static void readRecords()
{
        System.out.printf("%-10s%-12s%-12s%10s%n", "age",
                "First Name", "Last Name", "year");
    try
     {
     while (input.hasNext() ) {// while there is more to read
         // {
        // display record contents
         int year=input.nextInt();
         System.out.printf("%-10d%-12s%-12s%10.2f%n", 2021-year,
                 input.next(), input.next(), year);
        }
    }
    catch (NoSuchElementException elementException)
     {
     System.err.println("File improperly formed. Terminating.");
     }
    catch (IllegalStateException stateException)
    {
     System.err.println("Error reading from file. Terminating.");
     }
    } // end method readRecords
    public static void closeFile()


    {
        if (input != null)
            input.close();
    }


 }

