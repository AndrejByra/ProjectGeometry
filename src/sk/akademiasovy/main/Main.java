package sk.akademiasovy.main;

import sk.akademiasovy.geometria2d.square;
import sk.akademiasovy.geometria2d.rectangle;
import sk.akademiasovy.geometria2d.triangle;
import sk.akademiasovy.geometria2d.circle;

public class Main {
    public static void main(String[] args) {
    square square1 = new square(7.5);
    square square2 = new square();

    System.out.println("Areas of Square1 is: " + square1.getArea());
    System.out.println("Perimeter of Square1 is: " + square1.getPerimeter());
    System.out.println("Diagonal of Square1 is: " + square1.getDiagonal());

    rectangle rectangle1 = new rectangle(8.5,6.9);
    rectangle rectangle2 = new rectangle();

    System.out.println("Area of rectangle1 is : " + rectangle1.getArea());
    System.out.println("Perimeter of rectangle1 is : " + rectangle1.getPerimeter());
    System.out.println("Diagonal of rectangle1 is : " + rectangle1.getDiagonal());

    triangle triangle1 = new triangle(5,4,3);
    triangle triangle2 = new triangle();
    System.out.println("Perimeter of tiangle is: " + triangle1.getPerimeter());
    System.out.println("Area of triangel is: " + triangle1.getArea());
    System.out.println("Rectangle of triangel is: " + triangle1.isRectangular());
    System.out.println("Exists of triangel: " + triangle1.existsTriangle());
    System.out.println("Is Sreightsided? " + triangle1.isSreightsided());
    System.out.println("Is Isosceles? " + triangle1.isIsosceles());

    circle circle1 = new circle(5);
    circle circle2 = new circle();
    System.out.println("Area of circle is: " + circle1.getArea());
    System.out.println("Perimeter of the circle is: " + circle1.getPerimeter());
    }

}
