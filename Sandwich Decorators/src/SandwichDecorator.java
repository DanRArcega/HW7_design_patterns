// SandwichDecorator.java
public abstract class SandwichDecorator implements Sandwich {
    protected Sandwich decoratedSandwich;

    public SandwichDecorator(Sandwich decoratedSandwich) {
        this.decoratedSandwich = decoratedSandwich;
    }

    @Override
    public String getDescription() {
        return decoratedSandwich.getDescription();
    }

    @Override
    public double cost() {
        return decoratedSandwich.cost();
    }
}
