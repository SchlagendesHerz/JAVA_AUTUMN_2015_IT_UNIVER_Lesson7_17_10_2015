package javaapplication47;
class MyException extends Exception{}

class MyNewException extends Exception{
 public MyNewException(Throwable exp){
      super("error value",exp);
  }

}
class A{
    public void f(int a)throws MyException{
        if(a==10)throw new MyException();
        System.out.println(a);
    } 
}

class B{
    public void g(int a) throws MyNewException{
        A pa=new A();
        try{
            pa.f(a);
        }catch(MyException e){
            throw new MyNewException(e);
        }
    }
}

public class JavaApplication47 {

    public static void main(String[] args) {
      B pb =new B();
      try{
          pb.g(10);
      }catch(MyNewException e){
          e.printStackTrace();
      }
    
    
    }
    
}
