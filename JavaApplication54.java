
package javaapplication54;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

class A{}
public class JavaApplication54 {

  
    public static void main(String[] args) {
       A pa=new A();
       Reference<A> rf=new WeakReference<>(pa);
       pa=null;
       
       A p=rf.get();
       if(p==null){
           p=new A();
       }
    }
    
}
