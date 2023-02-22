class A{
    String name;
    int no;
    static String str;

    public static void show(A obj3){
        System.out.println(obj3.name + " : " +obj3.no + " : " + A.str);
    }
}

 public class statvar{
    public static void main(String[] args) {
        A obj = new A();
        obj.name = "raghvendra";
        obj.no = 12345;
        A.str = "hello";

        A obj1 = new A();
        obj1.name = "raghav";
        obj1.no = 12445;
        A.str = "bye";

        A.show(obj);


    }
}
