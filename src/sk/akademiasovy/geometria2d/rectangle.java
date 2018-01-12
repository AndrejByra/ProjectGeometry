package sk.akademiasovy.geometria2d;

public class rectangle implements operations,diagonal {

    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public rectangle(double value){
        this.a=value;
        this.b=value;
    }

    public rectangle(){
        a=0;
        b=0;
    }

    @Override
    public double getArea(){
        return a*b;
    }
    @Override
    public double getPerimeter(){
        return 2*(a+b);
    }

    public double getDiagonal(){
        double diagonal=Math.sqrt(a*a+b*b);
        return diagonal;
    }

    public void transpose(){
        double temp;
        temp=a;
        a=b;
        b=temp;
    }
}