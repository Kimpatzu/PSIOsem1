package objects;

public class TwoPointsAndDistanceBetween {
    private Point p1;
    private Point p2;
    private double distance;
    public TwoPointsAndDistanceBetween(Point p1, Point p2, double distance){
        this.p1=p1;
        this.p2=p2;
        this.distance=distance;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
