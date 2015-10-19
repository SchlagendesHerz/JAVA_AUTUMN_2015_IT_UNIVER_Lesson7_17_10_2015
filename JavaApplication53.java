
package javaapplication53;

import java.util.HashMap;
import java.util.Set;
import java.util.WeakHashMap;

class A{
    private int value;
    public A(int value){
     this.value=value;
    }
    
    public boolean equals(Object o){
        A p=(A)o;
        return this.value==p.value;
    }
    
    public int hashCode(){
        return value;
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int value){
        this.value=value;
    }
}
public class JavaApplication53 {

    public static void main(String[] args) {
       WeakHashMap<A,Integer> hm=new WeakHashMap<>();
       
       A pa=new A(10);
       hm.put(pa,1001);
       pa=null;
        
       System.out.println(v);
       
    }
    
}
