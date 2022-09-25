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
    private int totalweight;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maximumWeight;
        this.totalweight = 0;
    }

    public void addItem(Item item) {
        if (totalweight + item.getWeight() <= maxWeight) {
            this.items.add(item);
        }
    }

     public int totalWeight() {
        for (Item entry : items) {
            totalweight += entry.getWeight();
        }

         System.out.println(totalweight);
         return totalweight;
    }
     
    @Override
    public String toString() {
        
        String itemString = "";
        
        if(items.size() == 0){
            itemString = "no items" + " (" + this.totalWeight() + " kg)";
        }
        else if(items.size() == 1){
            itemString = this.items + " item (" + this.totalWeight() + " kg)";
        } else {
            itemString = this.items + " items (" + this.totalWeight() + " kg)";
        }
        
        return itemString;
    }
}
