class A{
    String name;
    static String msg;

    static{
        msg = "hello";
        System.out.println("inside static block");
    }

    public A(){
        name = "raghav";
        System.out.println("in constructor block");
    }
}

public class staticblock {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A();
        obj1.name = "raghav";
        obj2.name = "rishi";        //just for using local variable obj1 & obj2
    }
}
