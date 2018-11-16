/*  EquilateralTriangle.java  (a subclass)   */
public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle() {   /** Creates a new instance of EqulateralTriangle */
    }
    public EquilateralTriangle(double side) {
        super(side);
    }
    protected double area(){
        double work = a*a*Math.sqrt(3.0)/4.0;  // area of equilateral triangle
        return work;
    }
    public String displayName()  {
        return "Equilateral Triangle (" + a + ")";
    }
}