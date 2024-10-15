public class Circle implements Shape{
    private int radius;

    protected Circle(int n){
        this.radius = n;
    }

    @Override
    public String getType(){
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.floor(radius * radius * Math.PI * 100) / 100;
    }

    @Override
    public double getPerimeter() {
        return Math.floor(2 * radius * Math.PI * 100) / 100;
    }
}
