public class Square implements Shape{
    private int length;

    protected Square(int n){
        this.length = n;
    }

    @Override
    public String getType(){
        return "Square";
    }
    @Override
    public double getArea() {
        return length*length;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }
}
