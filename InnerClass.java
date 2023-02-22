class A{
    int age;
    public void show(){
        System.out.println("in show");
    }

    class B{
        public void config(){
            System.out.println("in configure");
        }
    }
    static class C     //Static class be created only in Inner Class not the outer class.
    { 
        public void getSomething()
        {
            System.out.println("in C class");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();  //for creating the object of inner class we need the object of outer class.
        obj1.config();

        A.C obj2 = new A.C();  //for static class we don't need object of outer class , we just need the name of the outer class.
        obj2.getSomething();
    }
}
