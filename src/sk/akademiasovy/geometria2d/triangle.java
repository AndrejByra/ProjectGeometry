package sk.akademiasovy.geometria2d;

public class triangle implements operations {
    private double a;
    private double b;
    private double c;

    public triangle() {
        a = 3;
        b = 4;
        c = 5;
    }

    public triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getPerimeter(){
        return a+b+c;
    }
    @Override
    public double getArea(){
        double s = getPerimeter()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public boolean isRectangular(){
        if (a*a+b*b == c*c){
            return true;
        }else if (b*b+c*c == a*a){
            return true;
        }else if (a*a+c*c == b*b){
            return true;
        }else
            return false;

    }
    public boolean existsTriangle(){
        if(c<(a+b)){
            return true;
        }
        else if(a<(a+c)){
            return true;
        }
        else if(b<(a+c)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isSreightsided(){
        if((a==b) && (b==c)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isIsosceles(){
        if((a==b) || (b==c) || (c==a)){
            return true;
        }
        else{
            return false;
        }
    }
}
