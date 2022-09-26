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
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maximumWeight;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    public int totalWeight() {
        int sumWeight = 0;
        for (Item calculate : items) {
            sumWeight += calculate.getWeight();
        }
        return sumWeight;
    }

    public void printItems() {
        for (Item calculate : items) {
            System.out.println(calculate.getName() + " (" + calculate.getWeight() + " kg)");
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item initialWeight = this.items.get(0);
        for (Item itm : items) {
            if (initialWeight.getWeight() <= itm.getWeight()) {
                initialWeight = itm;
            }
        }
        return  initialWeight;
    }
    
    
    public String listItems(){
        
        String listItems =  "";
        
        for(Item item : items){
            listItems += item.toString() + "\n";
        }
        
        return listItems;
    }
    
    public String toString() {
        if (items.size() == 1) {
            return this.items.size() + " item " + "(" + this.totalWeight() + " kg)";
        }

        if (items.size() == 0) {
            return "no items " + "(" + this.totalWeight() + " kg)";
        }

        return this.items.size() + " items " + "(" + this.totalWeight() + " kg)";
    }
}
