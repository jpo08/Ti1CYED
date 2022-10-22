package model;

public interface ColaDePrioridad<T>{

    public T heapMaximum();

    public T heapExtractMax();

    public void increaseKey(int i, int key);

    public void insert(T element, int key);


}