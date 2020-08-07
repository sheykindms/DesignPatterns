package decorator.third_example;

public class DarkRoast extends Beverage {
    float price = 1;

    public DarkRoast() {
        description = "Most Excellent Dark Roast";
    }

    public float cost() {
        return 2.49f;
    }
}
