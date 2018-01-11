package sk.akademiasovy.geometria;

public class square {
    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    public square(double value){
        a = value;
    }
    public square(){
        a = 0;
    }
    public double getArea(){
        return a*a;
    }
    public double getPerimeter(){
        return 4*a;
    }
    public double getDiagonal(){
      return  Math.sqrt(a*a+a*a);

    }
}


