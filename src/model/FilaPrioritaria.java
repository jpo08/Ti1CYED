package model;
import model.Node;

import java.util.ArrayList;

public class FilaPrioritaria<K,V> implements ColaDePrioridad<K>, Heap<K> {
    private ArrayList<Node<K,V>> PreorityQ;
    private int n;

    public FilaPrioritaria() {
        this.PreorityQ= new ArrayList<>();
        this.n= PreorityQ.size();
    }

    public void heapSort(){
        buildMaxHeap();
        for(int i=PreorityQ.size()-1; i>=0; i--){
            Node<K,V> swap= PreorityQ.get(0);

            PreorityQ.set(0,PreorityQ.get(i));
            PreorityQ.set(i,swap);
            n--;
            heapify(0);
        }
    }

    public void buildMaxHeap(){
        for(int i=((PreorityQ.size()/2)-1); i>=0; i--){
            heapify(i);
        }
    }

    public void heapify(int i)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;


        if (l < n && PreorityQ.get(l).getPriority() > PreorityQ.get(largest).getPriority())
            largest = l;


        if (r < n && PreorityQ.get(r).getPriority() > PreorityQ.get(largest).getPriority())
            largest = r;


        if (largest != i) {

            Node<K,V> swap= PreorityQ.get(i);
            PreorityQ.set(i,PreorityQ.get(largest));
            PreorityQ.set(largest,swap);
            heapify(largest);
        }
    }
    public K heapMaximum(){
        if(n<1){
            return null;
        }
        return PreorityQ.get(0).getValue();


    }
    public K heapExtractMax(){
        if(n<1){
            System.out.println("Cola vacia");
            return null;
        }
        K max=PreorityQ.get(0).getValue();

        PreorityQ.set(0,PreorityQ.get(n-1));
        if(n==0){

        }else{
            n--;
        }

        heapify(0);
        return max;
    }

    public void increaseKey(int i,int key){
        if(PreorityQ.get(i).getPriority()>key){
            return;
        }


        PreorityQ.get(i).setPriority(key);


        while(i>0 && PreorityQ.get(i/2).getPriority()<PreorityQ.get(i).getPriority()){
            Node<K,V> swap=PreorityQ.get(i);

            PreorityQ.set(i,PreorityQ.get(i/2));
            PreorityQ.set(i/2, swap);

            i=i/2;
        }
    }

    public void insert(K element, int key){
        n++;
        V nose=null;

        Node<K,V> node= new Node<>(element,nose,Integer.MIN_VALUE);
        PreorityQ.add(node);
        increaseKey(n-1,key);
    }

}

