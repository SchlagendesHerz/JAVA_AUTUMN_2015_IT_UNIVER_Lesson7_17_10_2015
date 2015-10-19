package javaapplication49;
class MyException1 extends Exception{}
class MyException2 extends MyException1{}
class A{
    public void f() throws MyException1{
        
    }
}

class B extends A{
  public void f() throws MyException2,MyException1,RuntimeException{}

}
public class JavaApplication49 {

    public static void main(String[] args) {
       A pa=new B();
       try{
         pa.f();
       }catch(MyException1 e){
       
       }
    }
    
}
