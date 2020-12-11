import java.util.*;

public class ArrayDictionary<E, T> {
    private ArrayList<E> key;
    private ArrayList<T> value;
    private int size;

    public ArrayDictionary() {

        key = new ArrayList<E>();
        value = new ArrayList<T>();
        size = 0;

    }

    void put(E key, T value) {

        this.key.add(key);
        this.value.add(value);
        size++;
    }

    T get(E key) {
        return value.get(this.key.indexOf(key));
    }

    T remove(E key) {

        T temp = value.get(this.key.indexOf(key));
        value.remove(this.key.indexOf(key));
        this.key.remove(key);

        size--;
        return temp;
    }

    boolean contains(E key) {
        return this.key.contains(key);
    }

    boolean isEmpty() {
        return size <= 0;
    }

    int size() {
        return size;
    }

    Collection<E> Keys() {
        Collection<E> temp = key;
        return temp;
    }

    Collection<T> Values() {
        Collection<T> temp = value;
        return temp;
    }
}
