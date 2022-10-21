package model;

public interface Stack<T> {
    public void push(T object);
    public int pop ();

    public boolean isEmpty();

    public boolean isFull();

    public int peek();

    public int size();
}
