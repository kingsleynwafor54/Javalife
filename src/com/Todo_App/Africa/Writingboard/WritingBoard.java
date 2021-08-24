package com.Todo_App.Africa.Writingboard;

import java.util.ArrayList;

public class WritingBoard {
    private ArrayList<String> todoList=new ArrayList<>();

    public ArrayList<String> getTodoList() {
        return todoList;
    }
    public void displayTodoList(){
        for(int counter=0;counter<todoList.size();counter++){
            System.out.println(counter+1+" "+todoList.get(counter));
        }
    }
}
