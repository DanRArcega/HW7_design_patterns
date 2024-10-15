import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("Hello!");
        System.out.print("What is your name?\nEnter: ");
        String name = in.nextLine();
        System.out.print("How old are you?\nEnter: ");
        int age = in.nextInt();
        User you = new User(name, age);

        System.out.print("Enter a side/radius for your shape: ");
        int len = in.nextInt();
        you.makeShape(len);

        System.out.println("Congratulations! Your shape is a " + you.shapeName() + ".");
        System.out.println("It has an Area of: " + you.getArea());
        System.out.println("And an Perimeter of: " + you.getPerimeter());
    }
}
