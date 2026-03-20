package in.exmple.utils;

import in.example.geometry.Circle;
import in.example.geometry.Rectangle;

public class Calculator {

    public static void main(String[] args) {
        Circle circle = new Circle(2.3);
        Rectangle rectangle = new Rectangle(5,10);

        //Calculation -:

        double cirArea = Math.PI * Math.pow(circle.radius, 2);
        double rectArea = rectangle.breadth * rectangle.length;
        System.out.println("Your Circle Area is:" + cirArea);
        System.out.println("Your Rectangle Area is: " + rectArea);
    }
}
