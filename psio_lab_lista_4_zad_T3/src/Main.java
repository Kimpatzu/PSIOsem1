import objects.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę punktów: ");
        int n = scanner.nextInt();
        PointArray points = new PointArray(n);
        points.createRandomPointArray();
        System.out.println(points);
        System.out.println("\n");
        System.out.println(points.furthestFromOrigin()); //a)
        System.out.println("\n");
        System.out.println(points.getVerticesOfSmallestPossibleRectangleContainingAllPoints()); //b)
        System.out.println("\n");
        System.out.println(points.showAllDistances());
        System.out.println("\n");
        Point[] furthestPoints = points.getfurthestPoints(); //c)
        System.out.println(furthestPoints[0]);
        System.out.println(furthestPoints[1]);
        System.out.println("\n");
        Point[] verticesOfMaxSurfaceAreaTriangle = points.getVerticesOfMaxSurfaceAreaTriangle(); //e)
        System.out.println(verticesOfMaxSurfaceAreaTriangle[0]);
        System.out.println(verticesOfMaxSurfaceAreaTriangle[1]);
        System.out.println(verticesOfMaxSurfaceAreaTriangle[2]);
        System.out.println("\n");
        System.out.println(points.getPointsSortedByDistanceFromOrigin());
        System.out.println("\n");
        TwoPointsAndDistanceBetween[] distances = points.getAllDistancesSorted(); //g)
        for (int i=0; i<distances.length; i++){
            System.out.println("p1: "+distances[i].getP1()+" p2: "+distances[i].getP2()+" distance: "+distances[i].getDistance()+"\n");
        }
    }
}
