class A{
    public void show(){
        System.out.println("in A class");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B class");
    }
}
class C extends A{
    public void show(){
        System.out.println("in C class");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        A obj = new A();   //We will create the object of superclass only not subclass
        obj.show();

        obj = new B();  //it is also called Dynamic Method Dispatch
        obj.show();

        obj = new C();
        obj.show();
    }
}
