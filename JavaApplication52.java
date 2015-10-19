
package javaapplication52;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class A{
    int value;
    
   
}

class AComparator implements Comparator<A>{
    public int compare(A p1,A p2){
        return p1.value-p2.value;
    }
}
public class JavaApplication52 {

  
    public static void main(String[] args) {
        AComparator c=new AComparator();
        Queue<A> q=new PriorityQueue<>(13,c);
        A pa=new A();
        q.add(pa);
        A pa1=new A();
        q.add(pa1);
    }
    
}
