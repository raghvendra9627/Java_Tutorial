class A{
    public void show(){
        System.out.println("in A class");
    }
}
class B extends A{
    public void show1(){
        System.out.println("in B class");
    }
}

public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        A obj = new B();  //upcasting the object of B to reference  of A(but it will happen even if we don't write"(A)")
        obj.show();

        B obj1 = (B) obj;   //downcasting the reference of A to the reference of B.
        obj1.show1();
    }
}
