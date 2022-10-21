package model;

public interface Hash <N,T,K>{
    public void insert(K key, T value);

    public void addLast(N input, int i);

    public T search(K key);

    public boolean delete(K key);

    public int size();
}
