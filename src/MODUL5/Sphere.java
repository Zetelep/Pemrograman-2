package MODUL5;

public class Sphere extends Shape{

    private Double radius;

    public Sphere(Double r) {
        super("Sphere");
        radius = r;
    }

    public double area(){
        return 4*Math.PI*(radius*radius);
    }

    @Override
    public String toString() {
        return super.toString() +" of radius"+radius;
    }
}
