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
public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> hold;

    public Hold(int maximumWeight) {
        this.maxWeight = maximumWeight;
        this.hold = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            this.hold.add(suitcase);
        }
    }

    public int totalWeight() {
        int sumOfWeights = 0;
        for (Suitcase suitcase : hold) {
            sumOfWeights += suitcase.totalWeight();
        }

        return sumOfWeights;
    }

    public void printItems() {
        for (Suitcase suitcase : hold) {
            System.out.println(suitcase.listItems());

        }
    }

    public String toString() {
        return this.hold.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
