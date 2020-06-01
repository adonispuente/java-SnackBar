package snackbar;

public class Main {
    private static void workwithData() {
        System.out.println("Welcome to Lambda School's Java!!!");
        // People
        Customer ppl1 = new Customer("Jane", "Smith", 45.25);
        Customer ppl2 = new Customer("Bob", "Boop", 33.14);
        // Vending Machines
        VendingMachine Food = new VendingMachine("Food");
        VendingMachine Drink = new VendingMachine("Drink");
        VendingMachine Office = new VendingMachine("Office");
        // Snacks
        // Printing Snack inside Food Vending Machine

        Snack chips = new Snack("Chips", 36, 1.75, Food.getId());
        Snack chocolate = new Snack("Chocolate", 36, 1.00, Food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, Food.getId());
        // Snacks in Drink Machine
        Snack soda = new Snack("Soda", 24, 2.50, Drink.getId());
        Snack water = new Snack("Water", 20, 2.75, Drink.getId());

        // Customer 1 (Jane) buys 3 of snack 4 (Soda).
        // Print Customer 1 (Jane) Cash on hand.
        System.out.println(ppl1.getFname() + " cash on hand is " + ppl1.buySnacks(soda.getCost() * 3));
        // Quantity of soda
        System.out.println("Quantity of soda is " + soda.buySnack(3));

        // Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
        System.out.println(ppl1.getFname() + " cash on hand is " + ppl1.buySnacks(pretzel.getCost()));
        // quantity of pretzels
        System.out.println("Quantity of pretzel is " + pretzel.buySnack(1));

        // Customer 2 (Bob) buys 2 of snack 4 (Soda).
        // Print Customer 2 (Bob) Cash on Hand.
        System.out.println(ppl2.getFname() + "cash on hand is" + ppl2.buySnacks(soda.getCost() * 2));
        // Print quantity of snack 4 (Soda).
        System.out.println("Quantity of soda is " + pretzel.buySnack(2));

        // Customer 1 (Jane) finds $10.
        // Print Customer 1 (Jane) Cash on Hand.
        System.out.println(ppl1.getFname() + "cash on hand is now" + ppl1.addCash(10));

        // Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
        // Print Customer 1 (Jane) Cash on Hand.
        System.out.println(ppl1.getFname() + "cash on hand is" + ppl1.buySnacks(chocolate.getCost()));
        // Print quantity of snack 2 (Chocolate Bar).
        System.out.println("Quantity of chocolate is " + chocolate.buySnack(2));

        // Add 12 more items to snack 3 (Pretzel).
        // Print quantity of snack 3 (Pretzel).
        System.out.println("quantity of pretzels is now" + pretzel.addQuantity(12));

        // Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
        // Print Customer 2 (Bob) Cash on hand.
        System.out.println(ppl2.getFname() + " cash on hand is " + ppl2.buySnacks(pretzel.getCost() * 3));
        // Print quantity of snack 3 (Pretzel).
        System.out.println("Quantity of soda is " + pretzel.buySnack(3));

    }

    public static void main(String[] args) {
        workwithData();
    }
}