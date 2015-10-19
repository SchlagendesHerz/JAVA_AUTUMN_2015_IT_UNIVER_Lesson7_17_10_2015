package javaapplication50;

import java.io.Closeable;

class A implements Closeable{
    public void f()throws Exception{}
    public void close(){}
}
public class JavaApplication50 {

  
    public static void main(String[] args) {
     
       try(A pa=new A()){
         pa.f();
       }catch(Exception e){
           e.printStackTrace();
       }
    }
    
}
