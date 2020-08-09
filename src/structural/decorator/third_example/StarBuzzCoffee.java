package structural.decorator.third_example;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        //Кладём beverage в классы декораторы, но так как они сами являются beverage, то после их иснтанцирования мы
        //добавляем к getDescription всё новые и новые топпинги.
        Beverage beverage2 = new Mocha(new Mocha(new Whip(new DarkRoast())));
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new Whip(new Milk(new Soy(new DarkRoast())));
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
