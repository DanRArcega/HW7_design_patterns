public class CircleFactory extends ShapeFactory {
    protected CircleFactory(){};
    @Override
    Shape makeShape(int n) {
        return new Circle(n);
    }
}
