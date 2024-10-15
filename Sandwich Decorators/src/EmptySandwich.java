// EmptySandwich.java
public class EmptySandwich implements Sandwich {
    @Override
    public String getDescription() {
        return "Sandwich bread";
    }

    @Override
    public double cost() {
        return 3.0; // Base price of the pizza
    }
}
