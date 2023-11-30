package MODUL5;

public class Rectangle extends Shape{

    private Double length;
    private Double width;

    public Rectangle(Double w,Double l) {
        super("Rectangle");
        width = w;
        length = l;
    }

    public double area(){
        return length * width;
    }

    @Override
    public String toString() {
        return super.toString() +" of width "+width+" and length "+length;
    }
}
