import java.util.Scanner;

public class Main
{
    private static final String STORE_NAME = "Snack Corner";
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("******************************************************************");
        System.out.println("***                                                            ***");
        System.out.println("***                                                            ***");
        System.out.println("***                         " + STORE_NAME + "                       ***");
        System.out.println("***                                                            ***");
        System.out.println("***                                                            ***");
        System.out.println("******************************************************************");
        System.out.println("***                     Customer Information                   ***");
        System.out.println("******************************************************************");
        System.out.print("\nCustomer Name: ");
        String name = scan.nextLine();

        System.out.print("Customer Age: ");
        int age = scan.nextInt();
        
        Customer customer = new Customer(name, age);

        Menu menu = new Menu();
        Order order = new Order();
        
        boolean ordering = true;
        while (ordering) {
            menu.displayMenu();
            System.out.print("\nEnter the item number (or 0 to finish): ");
            int itemNumber = scan.nextInt();

            if (itemNumber == 0) {
                ordering = false;
            } else if (itemNumber > 0 && itemNumber <= menu.getFoodItem(itemNumber - 1).getPrice()) {
                System.out.print("Enter quantity: ");
                int quantity = scan.nextInt();

                FoodItem selectedItem = menu.getFoodItem(itemNumber - 1);
                order.addItem(selectedItem, quantity);

                System.out.printf("%d x %s added to your order.%n", quantity, selectedItem.getName());
            } else {
                System.out.println("Invalid item number. Please try again.");
            }
        }
        
        order.displayOrder(customer);
        scan.close();
    }
}
