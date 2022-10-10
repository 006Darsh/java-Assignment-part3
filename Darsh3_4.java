

class a {
    public void hello() {
        System.out.println("Hello! this is original function");
    }
}

class b extends a {
    @Override
    public void hello() {
        System.out.println("Hello! this is overriden function");
    }
}

public class Darsh3_4 {
    public static void main(String[] args){      
    b obj = new b();      
    obj.hello(); 
    a obj2 = new a();     
    obj2.hello(); 
    System.out.println("This code is prepared by 21CE006 Aswani Darsh");
  }
}
