package obiektyTestowe;

import java.lang.Math;
import java.util.Comparator;

public class Triangle {
    private double x;
    private double y;
    private double z;

    public Triangle(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getSurfaceArea(){
        double p = (x+y+z)/2;
        return Math.sqrt(p*(p-x)*(p-y)*(p-z));
    }

    @Override
    public String toString(){
        return "x: " +x+ "  y: " +y+ "  z: " +z+ "  Surface Area: " + getSurfaceArea() + "\n";
    }

}
