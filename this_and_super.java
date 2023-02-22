class A{
    public A(){
        System.out.println("in class A");
    }
    public A(int a){
        System.out.println("in class A int");
    }
}

class B extends A{
    public B(){
        super(4);
        System.out.println("in class B");
    }
    public B(int a){
        this(); 
        System.out.println("in class B int");
    }
}

public class this_and_super {
    public static void main(String[] args) {
        B obj = new B();
        B obj1 = new B(3);  
        System.out.println(obj);
        System.out.println(obj1);
    }
}
