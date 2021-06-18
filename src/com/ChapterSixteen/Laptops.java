package com.ChapterSixteen;

public class Laptops {

        private String laptopOwner;
        private static int LaptopModel;
        private int laptopModel;


        public Laptops(String name) {
            this.laptopModel=++LaptopModel;
            this.laptopOwner =name;
        }
        public Laptops(){

        }

        public String getName() {
            return laptopOwner;
        }

        public void setName(String name) {
            this.laptopOwner = name;
        }

        @Override
        public String toString() {
            return
                   String.format("Owners-Name: %s%nModel-Number: %04d%n ",laptopOwner,laptopModel);
        }
    }


