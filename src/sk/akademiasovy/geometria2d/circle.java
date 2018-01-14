package sk.akademiasovy.geometria2d;

public class circle implements operations {
    private double r;

    public circle(double r) {
        this.r = r;
    }


    @Override
    public double getArea() {
        return Math.PI*r*r;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*r;
    }
}
