// LettuceDecorator.java
public class LettuceDecorator extends SandwichDecorator {
    public LettuceDecorator(Sandwich decoratedSandwich) {
        super(decoratedSandwich);
    }

    @Override
    public String getDescription() {
        return decoratedSandwich.getDescription() + ", lettuce";
    }

    @Override
    public double cost() {
        return decoratedSandwich.cost() + 1.0; // Cost of lettuce
    }
}
