package com.codegym;

public class ShapeTest {

    public static void main(String[] args) {
        Shape testShape = new Shape();
        System.out.println(testShape);
        testShape = new Shape("red",false);
        System.out.println(testShape);
        Circle testCircle = new Circle();
        System.out.println(testCircle);
        testCircle = new Circle(3.5);
        System.out.println(testCircle);
        testCircle = new Circle("red",false,5.0);
        System.out.println(testCircle);
        Rectangle testRectangle = new Rectangle();
        System.out.println(testRectangle);
        testRectangle = new Rectangle(2.5,3.8);
        System.out.println(testRectangle);
        testRectangle = new Rectangle("Brown",false,9.0,10.3);
        System.out.println(testRectangle);
        Square testSquare = new Square();
        System.out.println(testSquare);
        testSquare = new Square(2.3);
        System.out.println(testSquare);
        testSquare = new Square("pink",false,10.5);
        System.out.println(testSquare);
    }
}
