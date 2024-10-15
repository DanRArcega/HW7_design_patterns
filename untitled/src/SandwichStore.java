
public class SandwichStore {
    public static void main(String[] args) {
        Sandwich sandwich = new EmptySandwich();
        System.out.println(sandwich.getDescription() + " $" + sandwich.cost());

        sandwich = new BaconDecorator(sandwich);
        System.out.println(sandwich.getDescription() + " $" + sandwich.cost());

        sandwich = new LettuceDecorator(sandwich);
        System.out.println(sandwich.getDescription() + " $" + sandwich.cost());

        sandwich = new TomatoDecorator(sandwich);
        System.out.println(sandwich.getDescription() + " $" + sandwich.cost());


    }
}
