package javaapplication48;

class A{
    static A pa;
    public A() throws Exception{
        pa=this;
        if(true) throw new Exception();
    }
}
public class JavaApplication48 {

    
    public static void main(String[] args) {
        A p=null;
        try{
            p=new A();
        }catch(Exception e){
            
        }
        
        System.out.println(p);
        System.out.println(A.pa);
    }
    
}
