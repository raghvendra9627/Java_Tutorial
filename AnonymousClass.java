class A{
    public void show(){
        System.out.println("in A class");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        A obj = new A(){                 //It is called annonymous class because it has no name.
            public void show(){
                System.out.println("in anonymous class");
            }
        };
        obj.show();
    }
}
