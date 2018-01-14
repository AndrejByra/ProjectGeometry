package sk.akademiasovy.geometry3d;

public class sphere implements operation3d {
    private double r;

    public sphere(double r) {
        this.r = r;
    }

    @Override
    public double getSurface() {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(r, 3)) / 3;

    }
}
