package javaapplication51;

import java.util.PriorityQueue;
import java.util.Queue;

class A implements Comparable<A>{
    int value;
    
    public int compareTo(A other){
        return this.value-other.value;
    }
}
public class JavaApplication51 {

   
    public static void main(String[] args) {
        Queue<A> q=new PriorityQueue<>();
        A pa=new A();
        q.add(pa);
        A pa1=new A();
        q.add(pa1);
    }
    
}
