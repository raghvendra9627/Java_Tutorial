abstract class A{
    public abstract void show();
}

public class AbstractAndAnonymous {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}
