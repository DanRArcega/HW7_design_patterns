// TomatoDecorator.java
public class TomatoDecorator extends SandwichDecorator {
    public TomatoDecorator(Sandwich decoratedSandwich) {
        super(decoratedSandwich);
    }

    @Override
    public String getDescription() {
        return decoratedSandwich.getDescription() + ", tomato";
    }

    @Override
    public double cost() {
        return decoratedSandwich.cost() + 1.0; // Cost of tomato
    }
}
