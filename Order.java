import java.util.ArrayList;

public class Order
{
    private ArrayList<FoodItem> orderedItems;
    private ArrayList<Integer> quantities;
    private double totalCost;

    public Order() {
        orderedItems = new ArrayList<>();
        quantities = new ArrayList<>();
        totalCost = 0;
    }

    public void addItem(FoodItem item, int quantity) {
        orderedItems.add(item);
        quantities.add(quantity);
        totalCost += item.getPrice() * quantity;
    }

    public void displayOrder(Customer customer) {
        System.out.println("******************************************************************");
        System.out.println("***                       Customer Orders                      ***");
        System.out.println("******************************************************************");
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Age: " + customer.getAge());
        System.out.println("\nOrdered Items:");
        for (int i = 0; i < orderedItems.size(); i++) {
            FoodItem item = orderedItems.get(i);
            int quantity = quantities.get(i);
            System.out.printf("%d x %s = PHP %.2f%n", quantity, item.getName(), item.getPrice() * quantity);
        }
        System.out.printf("\nTotal Cost: PHP %.2f%n", totalCost);
        System.out.println("Thank you for ordering!");
    }
}
