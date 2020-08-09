package structural.decorator.second_example;

public class ThreeCheesePizza implements Pizza {
    private String description = "Mozzarella, Fontina, Parmesan Cheese Pizza";
    private double cost = 10.50;

    public String getDescription() {
        return description;
    }

    public void setCost(double newCost) {
        cost = newCost;
    }

    public double getCost() {
        return cost;
    }
}
