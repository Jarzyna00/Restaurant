public class Dish {
    private final String nameOfDish;
    private final double priceOfDish;


    public Dish(String nameOfDish, double priceOfDish) {
        this.nameOfDish = nameOfDish;
        this.priceOfDish = priceOfDish;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public double getPriceOfDish() {
        return priceOfDish;
    }
}
