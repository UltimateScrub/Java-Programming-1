
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }

        String returnObject = this.elements.get(0);
        for (String prs : this.elements) {
            // compare each object on the list
            // to the returnObject -- we compare heights
            // since we're searching for the tallest,

            if (returnObject.length() < prs.length()) {
                // if we find a taller person in the comparison,
                // we assign it as the value of the returnObject
                returnObject = prs;
            }
        }
        return returnObject;
    }
}
