public class SquareFactory extends ShapeFactory {
    protected SquareFactory(){};
    @Override
    Shape makeShape(int n) {
        return new Square(n);
    }
}
