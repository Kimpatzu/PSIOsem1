package klasaGeneryczna;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class MyList<T> {

    private ArrayList<T> list;
    private TreeSet<T> set;

    public MyList(Comparator comparator) {
        list = new ArrayList<T>();
        set = new TreeSet<T>(comparator);
    }



    public String toString(){
        String output="";
        set.forEach(i -> System.out.println(i));
        return output;
    }

    public void add(T object){
        this.list.add(object);
        this.set.add(object);
    }




}
