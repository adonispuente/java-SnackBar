package snackbar;

public class Customer {

    private static int maxId = 0; // static shared across object

    private int id;
    private String fname;
    private String lname;
    private double cash;

    public Customer(String fname, String lname, double cash) {
        maxId++;
        id = maxId;
        this.fname = fname;
        this.lname = lname;
        this.cash = cash;
    }

    // Getter Methods, returns info
    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public double getCash() {
        return cash;
    }

    // setter Methods
    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void getCash(int cash) {
        this.cash = cash;
    }

    // other methods
    public String getName() {
        return fname + " " + lname;
    }

    public double addCash(int addedMoney) {
        return cash = cash + addedMoney;
    }

    public double buySnacks(double totalCost) {
        return cash = cash - totalCost;
    }

}