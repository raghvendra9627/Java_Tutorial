/*** ALWAYS REMEMBER ***
 * class - class --> extends
 * interface - class --> implements
 * interface - interface --> extends
*/

interface A{
    int age=44;   //by default variables in the interface are final and static(i.e. the can't be changed and don't need object to usee it.)
    void show();
    void config();
}
interface X{
    void run();
}
interface Y extends X{
    void show1();
}

class B implements A,Y{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("running...");
    }
    public void show1(){
        System.out.println("in show1");
    }
}


public class MultipleInheritance {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        Y obj1 = new B();
        obj1.run();
        obj1.show1();

    }
    
}
