class A{
    public void add(int a, int b){
        System.out.println("in two parameter");
        System.out.println(a+b);
    }
    public void add(int a, int b,int c){
        System.out.println("in three parameter");
        System.out.println(a+b+c);
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        A obj = new A();
        obj.add(2,4,6);
        obj.add(3,5);
    }
}
