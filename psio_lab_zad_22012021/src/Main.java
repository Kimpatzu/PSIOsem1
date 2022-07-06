import klasaGeneryczna.MyList;
import comparators.*;
import obiektyTestowe.*;


public class Main {
    public static void main(String[] args) {
        SortTriangleByAreaSurface sortTriangleByAreaSurface = new SortTriangleByAreaSurface();
        MyList<Triangle> triangles = new MyList<Triangle>(sortTriangleByAreaSurface);

        triangles.add(new Triangle(1,2,2.5));
        triangles.add(new Triangle(7,8,9));
        triangles.add(new Triangle(4,5,6));
        triangles.add(new Triangle(4,5,6));

        triangles.toString();

        SortProductByName sortProductByName = new SortProductByName();
        MyList<Product> products = new MyList<Product>(sortProductByName);

        products.add(new Product("spoon", 100, 0.49));
        products.add(new Product("fork",101, 0.59));
        products.add(new Product("knife", 102, 2.99));
        products.add(new Product("fork", 101,0.59));

        products.toString();
    }
}
