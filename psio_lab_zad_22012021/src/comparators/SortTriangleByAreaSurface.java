package comparators;

import obiektyTestowe.Triangle;

import java.util.Comparator;

public class SortTriangleByAreaSurface implements Comparator<Triangle> {
    @Override
    public int compare(Triangle o1, Triangle o2) {
        if (o1.getSurfaceArea()-o2.getSurfaceArea()==0){
            return 0;
        } else if (o1.getSurfaceArea()- o2.getSurfaceArea()<0){
            return -1;
        } else {
            return 1;
        }
    }
}
