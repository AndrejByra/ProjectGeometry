package sk.akademiasovy.geometria2d;

public class square implements operations,diagonal {
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
    @Override
    public double getArea(){
        return a*a;
    }
    @Override
    public double getPerimeter(){
        return 4*a;
    }
    public double getDiagonal(){
      return  Math.sqrt(a*a+a*a);

    }
}


