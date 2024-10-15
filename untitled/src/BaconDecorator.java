// baconDecorator.java
public class BaconDecorator extends SandwichDecorator {
    public BaconDecorator(Sandwich decoratedSandwich) {
        super(decoratedSandwich);
    }

    @Override
    public String getDescription() {
        return decoratedSandwich.getDescription() + ", bacon";
    }

    @Override
    public double cost() {
        return decoratedSandwich.cost() + 2.0; // Cost of bacon topping
    }
}
