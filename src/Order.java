import java.util.LinkedList;
import java.util.List;

public class Order {
    int numberOfTable;
    private List<Dish> order = new LinkedList<>();
    private double finalPrice;


    public Order(int numberOfTable, LinkedList<Dish> order, double finalPrice) {
        this.numberOfTable = numberOfTable;
        this.order = order;
        this.finalPrice = 0;
    }

    public int getNumberOfTable() {
        return numberOfTable;
    }

    public void changeNumberOfTable(int newNumber) {
        this.numberOfTable = newNumber;
    }

    public void addDishToOrder(Dish dish) {
        order.add(dish);

        this.finalPrice += dish.getPriceOfDish();
    }

    public void removeDishFromOrder(Dish dish) {
        order.remove(dish);
    }

    public double getFinalPrice() {
        return finalPrice;
    }
}
