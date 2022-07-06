package objects;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString(){
        return "("+getX()+","+getY()+")";
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getDistance(Point p2){
        return Math.sqrt((double)(getX()- p2.getX())*(getX()- p2.getX())+(getY()- p2.getY())*(getY()- p2.getY()));
    }
    public double getDistance(int x, int y){
        Point p2= new Point(x,y);
        return Math.sqrt((double)(getX()- p2.getX())*(getX()- p2.getX())+(getY()- p2.getY())*(getY()- p2.getY()));
    }
    public double getTriangleSurfaceArea(Point p2, Point p3){
        double triangleSurfaceArea = 0.5*((p2.getX()-getX())*(p3.getY()-getY())-(p2.getY()-getY())*(p3.getX()-getX()));
        return triangleSurfaceArea;
    }
}
