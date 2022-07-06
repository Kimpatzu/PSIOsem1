package objects;
import java.util.Random;

public class PointArray {
    private Point[] points;
    public PointArray(Point[] points){
        this.points=points;
    }
    public PointArray(int n){
        points = new Point[n];
    }

    public Point getPoint(int i){
        return points[i];
    }

    public Point[] getPoints() {
        return points;
    }

    public int getLenght(){
        return points.length;
    }

    public String toString(){
        String output="";
        for (int i=0; i<getLenght();i++){
            output+=getPoint(i).toString()+"\n";
        }
        return output;
    }
    public int getMaxX(){
        int max=-100;
        for (int i=0; i<getLenght(); i++){
            if (getPoint(i).getX()>max){
                max=getPoint(i).getX();
            }
        }
        return max;
    }
    public int getMinX(){
        int min=100;
        for (int i=0; i<getLenght(); i++){
            if (getPoint(i).getX()<min){
                min=getPoint(i).getX();
            }
        }
        return min;
    }
    public int getMaxY(){
        int max=-100;
        for (int i=0; i<getLenght(); i++){
            if (getPoint(i).getY()>max){
                max=getPoint(i).getY();
            }
        }
        return max;
    }
    public int getMinY(){
        int min=100;
        for (int i=0; i<getLenght(); i++){
            if (getPoint(i).getY()<min){
                min=getPoint(i).getY();
            }
        }
        return min;
    }

    public Point furthestFromOrigin(){
        int n=0;
        double maxDistance=getPoint(0).getDistance(0,0);
        for (int i=0; i<getLenght(); i++){
            if (getPoint(i).getDistance(0,0)>maxDistance){
                maxDistance = getPoint(i).getDistance(0,0);
                n=i;
            }
        }
        return getPoint(n);
    }

    public void setPoint(int i, Point p){
        points[i]=p;
    }

    public void setPoint(int i, int x, int y){
        points[i]=new Point(x,y);
    }

    public void createRandomPointArray(){
        Random random = new Random();
        for (int i=0; i<getLenght();i++){
            setPoint(i, random.nextInt(200)-100, random.nextInt(200)-100);
        }
    }
    public PointArray getVerticesOfSmallestPossibleRectangleContainingAllPoints(){
        Point[] vertices = new Point[4];
        vertices[0]= new Point(getMaxX(),getMaxY());
        vertices[1]= new Point(getMaxX(),getMinY());
        vertices[2]= new Point(getMinX(),getMinY());
        vertices[3]= new Point(getMinX(),getMaxY());
        return new PointArray(vertices);
    }
    public String showAllDistances(){
        String output="";
        double distance=0;
        for (int i=0; i<getLenght(); i++){
            for (int j=i+1; j<getLenght(); j++){
                distance=getPoint(i).getDistance(getPoint(j));
                output+="Distance between point "+(i+1)+" and point "+(j+1)+" : " + distance + "\n";
            }
        }
        return output;
    }
    public TwoPointsAndDistanceBetween[] getAllDistancesSorted(){
        TwoPointsAndDistanceBetween[] distances = new TwoPointsAndDistanceBetween[getNumberOfPossiblePointPairs()];
        for (int i=0; i<distances.length; i++){
            distances[i] = new TwoPointsAndDistanceBetween(new Point(0,0), new Point(0,0),0);
        }
        int k=0;
        TwoPointsAndDistanceBetween pom;
        for (int i=0; i<getLenght(); i++){
            for (int j=i+1; j<getLenght(); j++){
                distances[k] = new TwoPointsAndDistanceBetween(getPoint(i), getPoint(j), getPoint(i).getDistance(getPoint(j)));
                k++;
            }
        }
        for (int i=0; i<distances.length; i++){
            for (int j=1; j<distances.length; j++){
                if (distances[j].getDistance()>distances[j-1].getDistance()){
                    pom = distances[j];
                    distances[j]=distances[j-1];
                    distances[j-1]=pom;
                }
            }
        }
        return distances;
    }
    public Point[] getfurthestPoints(){
        if (getLenght()<2){
            return null;
        } else{
            double max=0;
            Point[] furhtestPoints = new Point[2];
            for (int i=0; i<getLenght(); i++){
                for (int j=i+1; j<getLenght(); j++){
                    if (getPoint(i).getDistance(getPoint(j)) > max){
                        max=getPoint(i).getDistance(getPoint(j));
                        furhtestPoints[0]=getPoint(i);
                        furhtestPoints[1]=getPoint(j);
                    }
                }
            }
            return furhtestPoints;
        }
    }
    public PointArray getPointsSortedByDistanceFromOrigin(){
        Point[] sortedByOrigin = getPoints();
        Point pom;
        for (int i=0; i<getLenght(); i++){
            for (int j=1; j<getLenght(); j++){
                if (sortedByOrigin[j].getDistance(0,0) > sortedByOrigin[j-1].getDistance(0,0)){
                    pom = sortedByOrigin[j];
                    sortedByOrigin[j] = sortedByOrigin[j-1];
                    sortedByOrigin[j-1] = pom;
                }
            }
        }
        return new PointArray(sortedByOrigin);
    }
    public Point[] getVerticesOfMaxSurfaceAreaTriangle(){
        if (getLenght()<3){
            return null;
        } else {
            double max=0;
            Point[] verticesOfMaxSurfaceAreaTriangle = new Point[3];
            for (int i=0; i<getLenght(); i++){
                for (int j=i+1; j<getLenght(); j++){
                    for (int k=j+1; k<getLenght(); k++){
                        if (getPoint(i).getTriangleSurfaceArea(getPoint(j),getPoint(k)) > max ){
                            max = getPoint(i).getTriangleSurfaceArea(getPoint(j),getPoint(k));
                            verticesOfMaxSurfaceAreaTriangle[0] = getPoint(i);
                            verticesOfMaxSurfaceAreaTriangle[1] = getPoint(j);
                            verticesOfMaxSurfaceAreaTriangle[2] = getPoint(k);
                        }
                    }
                }
            }
            return verticesOfMaxSurfaceAreaTriangle;
        }
    }
    private int getNumberOfPossiblePointPairs(){
        int numberofpais=0;
        switch (getLenght()){
            case 1:
                numberofpais = 0;
                break;
            case 2:
                numberofpais = 1;
                break;
            case 3:
                numberofpais = 3;
                break;
            case 4:
                numberofpais = 7;
                break;
            default:
                numberofpais = 10;
                for (int i=5; i<getLenght(); i++){
                    numberofpais+=i;
                }
                break;
        }
        return numberofpais;
    }

}
