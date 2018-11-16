
public class RightTriangle extends Triangle {

    public RightTriangle() {  /*  Creates a new instance of RightTriangle */
    }

    public RightTriangle(double side1,double side2) {
        super(side1, side2);
    }
    protected double area(){
        double work = a*b/2.0;  // area of right triangle
        return work;
    }
    protected double perimeter(){
        double third = Math.sqrt(a*a + b*b);         //third side
        double perim = super.a + super.b + third;  // perimeter of a right triangle
        return perim;
    }
    public String displayName()  {
        return "Right Triangle (" +a+", "+b+")";
    }
}
