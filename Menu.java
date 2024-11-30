import java.util.ArrayList;

public class Menu
{
    private ArrayList<FoodItem> foodItems;
    private int x;

    public Menu() {
        foodItems = new ArrayList<>();
        foodItems.add(new FoodItem("Buko Juice", 15.00));
        foodItems.add(new FoodItem("Fish-balls", 20.00));
        foodItems.add(new FoodItem("Lumpia", 30.00));
        foodItems.add(new FoodItem("Kikiam", 25.30));
    }

    public void displayMenu() {
        System.out.println("******************************************************************");
        System.out.println("***                              Menu                          ***");
        System.out.println("******************************************************************");
        for (int i = 0; i < foodItems.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, foodItems.get(i));
        }
    }

    public FoodItem getFoodItem(int index) {
        if (index >= 0 && index < foodItems.size()) {
            return foodItems.get(index);
        }
        return null;
    }
}
