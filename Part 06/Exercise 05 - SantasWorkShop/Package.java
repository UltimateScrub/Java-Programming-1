import java.util.ArrayList;
/**
 *
 * @author user
 */
public class Package {
    private ArrayList<Gift> elements;
    
    public Package () {
        this.elements = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        elements.add(gift);
    }
    
    public int totalWeight() {
        
        if (elements.isEmpty()) {
            return -1;
        }
        
        int totalWeight = 0;
        
        for (Gift gift: elements) {
            totalWeight += gift.getWeight();
        }
        return totalWeight;
    }
}
