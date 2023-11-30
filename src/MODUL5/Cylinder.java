package MODUL5;

public class Cylinder extends Shape{

    private Double radius;
    private Double height;

    public Cylinder(Double r,Double h) {
        super("Rectangle");
        radius = r;
        height = h;
    }

    public double area(){
        return Math.PI*(radius*radius)*height;
    }

    @Override
    public String toString() {
        return super.toString() +" of radius "+radius+" and height "+height;
    }
}
