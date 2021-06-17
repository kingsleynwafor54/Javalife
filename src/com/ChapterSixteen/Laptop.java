package com.ChapterSixteen;

import java.util.ArrayList;
import java.util.List;

public class Laptop {
    private String laptopOwner;

    private static int laptopNumber;
    private int laptopMake;




    public Laptop(String laptopOwner){
        laptopMake=++laptopNumber;
        this.laptopOwner=laptopOwner;

    }



    public String getLaptopOwner() {
        return laptopOwner;
    }

    public void setLaptopOwner(String laptopOwner) {
        this.laptopOwner = laptopOwner;
    }

    public  int getLaptopNumber() {
        return laptopNumber;
    }

//    public  void setLaptopNumber(int laptopNumber) {
//        Laptop.laptopNumber = laptopNumber;
//    }

    @Override
    public String toString() {
        return String.format("LaptopOwner is : %s%n LaptopMake is  %s%n",laptopOwner,laptopNumber);
    }

    public static void main(String[] args) {
        Laptop laptop=new Laptop("Kingsley");
        Laptop laptops1=new Laptop("Ezekiel");
        Laptop laptops2=new Laptop("Gbemi");
        Laptop laptops3=new Laptop("John");
        Laptop laptops4=new Laptop("Peter");
        Laptop laptops5=new Laptop("Kings");
        Laptop laptops6=new Laptop("David");
        Laptop laptops7=new Laptop("Henry");
        List<Laptop> laptops=new ArrayList<>();
        laptops.add(laptop);
        laptops.add(laptops1);
        laptops.add(laptops2);
        laptops.add(laptops3);
        laptops.add(laptops4);
        for (int count = 0; count <laptops.size() ; count++) {
            System.out.printf("%s%n ", laptops.get(count));
        }


    }

}
