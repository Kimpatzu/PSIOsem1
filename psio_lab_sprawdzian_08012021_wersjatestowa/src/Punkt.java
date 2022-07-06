public class Punkt {
    private double x;
    private double y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString(){
        return "x: "+x+" y: "+y;
    }
    public int ktoraPolPlaszczyzna(){
        if (x>0){
            return 1;
        } if (x<0) {
            return 2;
        } else return 0;
    }
}
