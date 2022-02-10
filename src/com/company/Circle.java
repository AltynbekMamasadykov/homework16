package com.company;

import java.util.Scanner;

public class Circle {
    final  static double pi = 3.14;

    static void area(){
        System.out.println("To calculate the area if circle we need radius of circle");
        System.out.println("Please enter the radius");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area = (radius*radius)*pi;
        System.out.println("The area of circle is: "+"("+radius+"*"+radius+")"+"*"+pi+" = "+area);

    }

    static  void circumference(){
        System.out.println("To calculate the circumference we need radius of circle");
        System.out.println("Please enter the radius");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double circumference = pi*2*radius;
        System.out.println("Circumference: "+pi+"*"+"2"+"*" +radius+" = "+circumference);

    }

}
