package ChapterSeventeen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class InvoiceTest {
    Invoice invoice;

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void methodOne() {
        Invoice[] invoice = {new Invoice(83, "Electric sander", 13, 83 * 13)
                , new Invoice(73, "Power saw      ", 53, 53)
                , new Invoice(63, "Sledge Hammer  ", 12, 21)
                , new Invoice(53, "Lawn mower     ", 78, 73)
                , new Invoice(43, "ScrewDriver    ", 83, 83)
                , new Invoice(33, "JigSaw         ", 90, 90)
                , new Invoice(23, "Wrench         ", 41, 41)};
        List<Invoice> invoiceList = Arrays.asList(invoice);
        System.out.printf("%-8s %-8s %8s %-8s%n", "PartNumber ", "PartDesciption ", "Quantify ", "Price ");

        invoiceList.stream().forEach(System.out::println);

    }

    @Test
    void methodTwo() {
        Invoice[] invoice = {new Invoice(83, "Electric sander", 13, 83 * 13)
                , new Invoice(73, "Power saw      ", 53, 53)
                , new Invoice(63, "Sledge Hammer  ", 12, 21)
                , new Invoice(53, "Lawn mower     ", 78, 73)
                , new Invoice(43, "ScrewDriver    ", 83, 83)
                , new Invoice(33, "JigSaw         ", 90, 90)
                , new Invoice(23, "Wrench         ", 41, 41)};
        List<Invoice> invoiceList = Arrays.asList(invoice);
        System.out.printf("%-8s %-8s %8s %-8s%n", "PartNumber ", "PartDesciption ", "Quantify ", "Price ");
        invoiceList.stream()
                .sorted((Comparator.comparing(Invoice::getPartDescription)))
                .forEach(System.out::println);
    }

    @Test
    void methodThree() {
        Invoice[] invoice = {new Invoice(83, "Electric sander", 13, 83 * 13)
                , new Invoice(73, "Power saw      ", 53, 53)
                , new Invoice(63, "Sledge Hammer  ", 12, 21)
                , new Invoice(53, "Lawn mower     ", 78, 73)
                , new Invoice(43, "ScrewDriver    ", 83, 83)
                , new Invoice(33, "JigSaw         ", 90, 90)
                , new Invoice(23, "Wrench         ", 41, 41)};

        List<Invoice> invoiceList = Arrays.asList(invoice);
        System.out.printf("%-8s %-8s %8s %-8s%n", "PartNumber ", "PartDescription ", "Quantity ", "Price ");
        invoiceList.stream()
                .sorted((Comparator.comparing(Invoice::getPartDescription)))
                .forEach(System.out::println);


    }

    @Test
    void methodFour() {
        Invoice[] invoice = {new Invoice(83, "Electric sander", 13, 83 * 13)
                , new Invoice(73, "Power saw      ", 53, 53)
                , new Invoice(63, "Sledge Hammer  ", 12, 21)
                , new Invoice(53, "Lawn mower     ", 78, 73)
                , new Invoice(43, "ScrewDriver    ", 83, 83)
                , new Invoice(33, "JigSaw         ", 90, 90)
                , new Invoice(23, "Wrench         ", 41, 41)};

        List<Invoice> invoiceList = Arrays.asList(invoice);
        System.out.printf("%-8s %-8s %8s %-8s%n", "PartNumber ", "PartDesciption ", "Quantify ", "Price ");
        Function<Invoice, String> byDepartment = Invoice::getPartDescription;
        Function<Invoice, Double> Price = Invoice::getPrice;
        Comparator<Invoice> lastThenFirst =
                Comparator.comparing(Price);
        System.out.printf(
                "%nInvoice in ascending order by getDescription then first:%n");
        invoiceList.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);

    }

    @Test
    void methodFive() {
        Invoice[] invoice = {new Invoice(83, "Electric sander", 13, 83 * 13)
                , new Invoice(73, "Power saw      ", 53, 53)
                , new Invoice(63, "Sledge Hammer  ", 12, 21)
                , new Invoice(53, "Lawn mower     ", 78, 73)
                , new Invoice(43, "ScrewDriver    ", 83, 83)
                , new Invoice(33, "JigSaw         ", 90, 90)
                , new Invoice(23, "Wrench         ", 41, 41)};
        List<Invoice> invoiceList = Arrays.asList(invoice);
        Function<Invoice, String> byDepartment = Invoice::getPartDescription;
        Function<Invoice, Integer> quantity = Invoice::getQuantity;
        Comparator<Invoice> lastThenFirst =Comparator.comparing(quantity);
        System.out.printf(
                 "%nDescription                  Price%n");
        invoiceList.stream()
                    .sorted(lastThenFirst)
                    .map(Invoice->(String.format("%-30s%-8s",Invoice.getPartDescription(),Invoice.getPrice())))
                    .forEach(System.out::println);
    }
    @Test
    void methodSix() {
        Invoice[] invoice = {new Invoice(83, "Electric sander", 13, 83 * 13)
                , new Invoice(73, "Power saw      ", 53, 53)
                , new Invoice(63, "Sledge Hammer  ", 12, 21)
                , new Invoice(53, "Lawn mower     ", 78, 73)
                , new Invoice(43, "ScrewDriver    ", 83, 83)
                , new Invoice(33, "JigSaw         ", 90, 90)
                , new Invoice(23, "Wrench         ", 41, 41)};
        List<Invoice> invoiceList = Arrays.asList(invoice);
        Function<Invoice, String> byDepartment = Invoice::getPartDescription;
        Function<Invoice, Integer> quantity = Invoice::getQuantity;
        Comparator<Invoice> lastThenFirst =Comparator.comparing(quantity);
        System.out.printf(
                "%nDescription                  Price%n");
        invoiceList.stream()
                .sorted(lastThenFirst)
                .map(Invoice->(String.format("%-30s%-8s",Invoice.getPartDescription(),Invoice.invoice())))
                .forEach(System.out::println);
    }
    @Test
    void methodSeven() {
        Invoice[] invoice = {new Invoice(83, "Electric sander", 13, 83 * 13)
                , new Invoice(73, "Power saw      ", 53, 53)
                , new Invoice(63, "Sledge Hammer  ", 12, 21)
                , new Invoice(53, "Lawn mower     ", 78, 73)
                , new Invoice(43, "ScrewDriver    ", 83, 83)
                , new Invoice(33, "JigSaw         ", 90, 90)
                , new Invoice(23, "Wrench         ", 41, 41)};
        List<Invoice> invoiceList = Arrays.asList(invoice);
        //Function<Invoice, String> byDepartment = Invoice::getPartDescription;
        Function<Invoice, Double> invoices = Invoice::invoice;
        Comparator<Invoice> lastThenFirst =Comparator.comparing(invoices);
        Predicate<Invoice> twoHundredTo =
                e -> (e.invoice() >= 100&& e.invoice() <= 2000);
        System.out.printf("%-8s %-8s %8s %-8s%n", "PartNumber ", "PartDesciption ", "Quantify ", "Price ");

        invoiceList.stream()
                .filter(twoHundredTo)
                .sorted(lastThenFirst)
                .forEach(System.out::println);
    }



}