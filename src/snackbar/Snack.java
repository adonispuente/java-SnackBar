package snackbar;

public class Snack {

    private static int maxId = 0; // static shared across object

    private int id;
    private String name;
    private double quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, double quantity, double cost, int vendingMachineId) {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    // Getter Methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getVendingMachingId() {
        return vendingMachineId;
    }

    public double quantity() {
        return quantity;
    }

    // setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setVendingMachingId(int vendingID) {
        this.vendingMachineId = vendingID;
    }

    // other methods
    public int addQuantity(double addedQuantity) {
        return (int) (quantity = quantity + addedQuantity);
    }

    public int buySnack(double boughtSnack) {
        return (int) (quantity = quantity - boughtSnack);
    }

    public String totalCost(double newQuantity) {
        return "Total Cost is " + newQuantity * cost;
    }
}