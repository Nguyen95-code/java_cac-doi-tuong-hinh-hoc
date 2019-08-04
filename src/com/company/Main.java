package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //shape
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);


        //circle
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle("indipg", true, 3.5);
        System.out.println(circle);


        //Rectangle
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle("orange", true, 2.3, 5.8);
        System.out.println(rectangle);


        //Square
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square("yelow", true, 2.3);
        System.out.println(square);
    }
}
