import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Zbior<T> {
    private TreeSet<T> set;

    public Zbior(){
        set = new TreeSet<T>();
    }

    public TreeSet<T> getSet() {
        return this.set;
    }

    public void setSet(TreeSet<T> set) {
        this.set = set;
    }

    public String toString(){
        set.forEach(i -> System.out.println(i));
        return null;
    }

    public void add(T object){
        this.set.add(object);
    }

    public Zbior<T> getUnion(Zbior<T> setInput){
        Zbior<T> setOutput = new Zbior<T>();
        Iterator<T> iterator = setInput.getSet().iterator();
        while(iterator.hasNext()){
            T object = iterator.next();
            if(!setOutput.getSet().contains(object)){
                setOutput.add(object);
            }
        }
        return setOutput;
    }

    public Zbior<T> getIntersection(Zbior<T> setInput){
        Zbior<T> setOutput = new Zbior<T>();
        Iterator<T> iterator = setInput.getSet().iterator();
        while(iterator.hasNext()){
            T object = iterator.next();
            if(this.getSet().contains(object)){
                setOutput.add(object);
            }
        }
        return setOutput;
    }
}
