package com.harbour.lecture2;

public class Circle {

    public static int count_id = 1;

    private int id;

    public Circle() {
        count_id++;
        this.id = count_id;
    }
    // A class field
    public static final double PI = 3.14159;     // A useful constant

    // A class method: just compute a value based on the arguments
    public static double radiansToDegrees(double radians) {
        return radians * 180 / PI;
    }

    // An instance field
    public double r;                  // The radius of the circle

    // Two instance methods: they operate on the instance fields of an object

    // Compute the area of the circle
    public double area() {
        return PI * r * r;
    }

    // Compute the circumference of the circle
    public double circumference() {
        return 2 * PI * r;
    }
}

