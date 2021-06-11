package lists;

public interface Listable<T> {
    void add(T data);

    void addFirst(T data);

    void addLast(T data);

    void insert(int index);

    void remove(int index);

    void clear();

    T get(int index);

    int size();

    boolean isEmpty();

    void set(int index, T data);

    void printAll();

}
