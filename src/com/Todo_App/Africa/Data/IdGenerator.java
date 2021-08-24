package com.Todo_App.Africa.Data;

public class IdGenerator {
    private static int id;
    private static int totalNumberOfUsers;
    private int idGenerator;

//    public Laptop(String laptopOwner){
//        int  laptopMake=++laptopNumber;
//        this.laptopOwner=laptopOwner;
//
//    }
    public IdGenerator(){
       this.idGenerator=++id;
       totalNumberOfUsers++;
    }

    public int getId() {
        return idGenerator;
    }

    public static int getTotalNumberOfUsers() {
        return totalNumberOfUsers;
    }
}
