public class Archive {

    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }
    
     @Override
    public boolean equals(Object comparison) {

        // if the variables share the same address, they are equal
        if (this == comparison) {
            return true;
        }

        // if the compared object is not of type Book, the objects are not equal
        if (!(comparison instanceof Archive)) {
            return false;
        }

        // cast the Object type comparison object
        // into a Book type comparisonBook object
        Archive comparisonBook = (Archive) comparison;

        return this.identifier.equals(comparisonBook.identifier);

    }
}public class Archive {

    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }
    
     @Override
    public boolean equals(Object comparison) {

        // if the variables share the same address, they are equal
        if (this == comparison) {
            return true;
        }

        // if the compared object is not of type Book, the objects are not equal
        if (!(comparison instanceof Archive)) {
            return false;
        }

        // cast the Object type comparison object
        // into a Book type comparisonBook object
        Archive comparisonBook = (Archive) comparison;

        return this.identifier.equals(comparisonBook.identifier);

    }
}
