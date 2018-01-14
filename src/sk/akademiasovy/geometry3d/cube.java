package sk.akademiasovy.geometry3d;

public class cube implements  operation3d{
    private double a;

    public cube(double a) {
        this.a = a;
    }


    @Override
    public double getSurface() {
        return 6*(a*a);
    }

    @Override
    public double getVolume() {
        return (a*a*a);
    }

}
