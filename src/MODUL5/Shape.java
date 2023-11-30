package MODUL5;

public abstract class Shape {
    private String shapeName;

    public Shape(String S) {
        this.shapeName = S;
    }

    public double area(){

        return 0;
    }

    @Override
    public String toString() {
        return shapeName;
    }
}
