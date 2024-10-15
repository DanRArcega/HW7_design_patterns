public class User {
    private String name;
    private int age;
    private Shape shape;
    private ShapeFactory factory;

    public User(String name, int age){
        this.name = name;
        this.age = age;
        if(age % 2 == 0)
            this.factory = new SquareFactory();
        else
            this.factory = new CircleFactory();
    }

    public void makeShape(int n){
        this.shape = this.factory.makeShape(n);
    }
    public String shapeName(){
        return this.shape.getType();
    }
    public double getArea(){
        return this.shape.getArea();
    }
    public double getPerimeter(){
        return this.shape.getPerimeter();
    }
}
