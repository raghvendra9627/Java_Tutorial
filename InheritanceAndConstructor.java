class Ab{
    public int a;
    public Ab(int x)
    {
        a = x;
    }
    public void show(){
        System.out.println(a);
    }
}
class B extends Ab{
    int a;
    public B(int x, int y){
        super(x);
        a = y;
    }
    public void show(){
        super.show();
        System.out.println(a);
    }
}
class C extends B{
    int a;
    public C(int x, int y, int z){
        super(x,y);
        a = z;
    }
    public void show(){
        super.show();
        System.out.println(a);
    }
}

public class InheritanceAndConstructor {
    public static void main(String[] args) {
        C obj = new C(4,6,7);
        obj.show();
    }
}
