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

public class class_for_class {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("A");
    }
    
}
