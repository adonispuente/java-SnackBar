package snackbar;

public class Snack {

    private static int maxId = 0; // static shared across object

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId) {
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

    public int quantity() {
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
    public int addQuantity(int addedQuantity) {
        return quantity + addedQuantity;
    }

    public int buySnack(int boughtSnack) {
        return quantity - boughtSnack;
    }

    public String totalCost(int newQuantity) {
        return "Total Cost is " + newQuantity * cost;
    }
}