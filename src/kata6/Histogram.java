package kata6;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Histogram<T> {

    private final Map<T, Integer> map;

    public Histogram(Iterator<T> iterator) {
        this(iterableOf(iterator));
    }
    
    public Histogram(Iterable<T> iterable) {
        this.map = new HashMap();
        for (T item : iterable) add(item);
    }

    private void add(T item) {
        map.put(item, get(item)+1);
    }

    private int get(T item) {
        return map.containsKey(item) ? map.get(item) : 0;
    }
    
    private static <X> Iterable<X> iterableOf(Iterator<X>iterator){
        return () -> iterator;
    } 
}
