import java.util.Scanner;

public abstract class WishlistSavings {
    private final String wishlistItem;
    private int savingsGoal;


    @Override
    public String toString() {
        return "WishlistSavings{" +
                "wishlistItem='" + wishlistItem + '\'' +
                ", savingsGoal=" + savingsGoal +
                '}';
    }

    public WishlistSavings(String wishlistItem) {
        this.wishlistItem = wishlistItem;
    }

    public int getWeeksToSave() {
        int weeksToSave = 0;
        return weeksToSave;
    }

    public int getSavingsGoal() {
        int savingsGoal = 0;
        return savingsGoal;
    }

    public String getWishlistItem() {
        return wishlistItem;
    }

    public Object setSavingsGoal(int savingsGoal) {
        this.savingsGoal = savingsGoal;
        Object amountToSave = new Object();
        Object totalSavings = new Object();
        return totalSavings;
    }

    public static void main (String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Total amount to save");
        System.out.println("Totals weeks to save");
        System.out.println("Amount to save weekly");
        String input = scan.next();


    }













}
