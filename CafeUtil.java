import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for(double val: prices) {
            sum = sum + val;
        }
        return sum;
    }
    public void displayMenu(ArrayList<String> menuItems) {
        for(int i = 0; i < menuItems.size(); i++) {
            System.out.printf(" %d %s \n\n", i, menuItems.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        System.out.printf("There are %d people in front of you \n", customers.size() );
        customers.add(userName);
        System.out.println(customers);
    }
    public void printPriceChart(String product, double price, int maxQuantity) {
            System.out.printf("%s \n", product);
            double discount = 0.00;
        for (int i = 1; i <= maxQuantity; i++) {
            switch(i) {
                case 1:
                    break;
                default:
                    discount = (i-1) * 0.50;
            }
            double charge = (price * i) - discount;
            System.out.printf("%d - $%.2f \n", i, charge);
        }
    }
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        }
        else {
            for (int i = 0; i < prices.size(); i++) {
                System.out.format("%d %s -- $%.2f \n", i, menuItems.get(i), prices.get(i));
            }
            return true;
        }
    }
    public ArrayList<String> addCustomers() {
        boolean i = true;
        ArrayList<String> customers = new ArrayList<String>();
        while (i) {
            System.out.println("Welcome to adding customer function! Please enter customer name:");
            String userName = System.console().readLine();
            System.out.println("Hello, " + userName);
            System.out.printf("There are %d people in front of you \n", customers.size() );
            customers.add(userName);
            System.out.println(customers);
            System.out.println("Would you like to add more customers? Type 'q' followed by enter to stop. Press enter to continue.");
            String answer = System.console().readLine();
            if (answer.equals("q")) {
                i = false;
            }
            
        }
        return customers;
    }
}