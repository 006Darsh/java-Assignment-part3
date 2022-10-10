// package Practicle_file;


import java.util.*;

abstract class GeometricObject {
    abstract void getArea(); // to get area

    abstract void getPerimeter(); // to get perimeter abstract

    abstract void setElements(); // to set the elements abstract

    abstract void getElements(); // to get the elements
}

class Circle extends GeometricObject {
    int radius;
    Scanner s = new Scanner(System.in);

    @Override
    void setElements() {
        System.out.println("Enter the radius of the circle : ");
        radius = s.nextInt();
    }

    @Override
    void getElements() {
        System.out.println("Radius of the circle is " + radius);
    }

    @Override
    void getArea() {
        System.out.println("The area of the  circle is " +(3.14 * radius * radius));
    }

    @Override
    void getPerimeter() {
        System.out.println("The perimeter of the circle is " +(2 * 3.14 * radius));
    }
}

class Rectangle extends GeometricObject {
    int length, breadth;
    Scanner s = new Scanner(System.in);

    @Override
    void setElements() {
        System.out.println("Enter the length of the rectangle : ");
        length = s.nextInt();
        System.out.println("Enter the breadth of the rectangle : ");
        breadth = s.nextInt();
    }

    @Override
    void getElements() {
        System.out.println("Length of the Rectangle is " + length);
        System.out.println("Breadth of the Rectangle is " + breadth);
    }

    @Override
    void getArea() {
        System.out.println("The area of the rectangle is " +(length * breadth));
    }

    @Override
    void getPerimeter() {
        System.out.println("The perimeter of the rectangle is " + (2 * (length + breadth)));
    }
}

public class Darsh_3_1 {
    public static void main(String[] args) {

        // Circle
        Circle c1 = new Circle();
        c1.setElements();
        c1.getElements();
        c1.getArea();
        c1.getPerimeter();

        // Rectangle
        Rectangle r1 = new Rectangle();
        r1.setElements();
        r1.getElements();
        r1.getArea();
        r1.getPerimeter();
        System.out.println("This code is prepared by 21CE006 Aswani Darsh");
    }
}
