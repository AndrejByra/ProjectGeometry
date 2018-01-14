package sk.akademiasovy.geometry3d;

public class block implements operation3d {
    private double length;
    private double width;
    private double height;


    public block(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getSurface() {
        return (length*width*2 + length*height*2 + height*width*2);
    }

    @Override
    public double getVolume() {
        return length*width*height;
    }
}
