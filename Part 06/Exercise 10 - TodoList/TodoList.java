/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class TodoList {
    private ArrayList<String> todoList;
    
    public TodoList() {
        this.todoList = new ArrayList<>();
    }
    
    public void add(String task){
       todoList.add(task);
    }
    
    public void print() {
        for (String output: todoList) {
            System.out.println((todoList.indexOf(output) + 1)  + ": " + output);
        }
    }
    
    public void remove(int number){
        todoList.remove(number-1);
    }

}
