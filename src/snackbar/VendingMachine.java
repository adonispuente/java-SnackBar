package snackbar;

public class VendingMachine {

    private static int maxId = 0; // static shared across object
    private int id;
    private String name;

    public VendingMachine(String name) {
        maxId++;
        id = maxId;
        this.name = name;
    }

    // Getter Methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Setter Methods
    public void setFname(String name) {
        this.name = name;
    }
}