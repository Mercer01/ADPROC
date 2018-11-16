/*   Triangle.java (a superclass)   */
public class Triangle {
    protected double a, b, c;  // sides of a triangle
    public Triangle() {   /*  Creates a new instance of Triangle */

    }

    public Triangle(double side) { // for equilateral triangle
        a=b=c=side;
    }

    public Triangle(double side1, double side2) {// for right triangle
        a=side1;
        b=side2;
    }

    public Triangle(double side1, double side2, double side3) {// for a triangle
        a=side1;
        b=side2;
        c= side3;
    }
    protected double perimeter() { //calculates perimeter of a triangle
        return a+b+c;
    }
    protected double area(){ //calculates area of a triangle
        double p = this.perimeter()/2.0;  //half of perimeter
        double work = p*(p-a)*(p-b)*(p-c);
        return Math.sqrt(work);  //Heron's formula for area of triangle
    }
    public String displayName()  {
        return "Triangle (" +a+", "+b+", "+c+")";
    }
    // add access/modifier methods here
}