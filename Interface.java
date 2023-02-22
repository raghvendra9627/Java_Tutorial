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

class B implements A{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}

public class Interface {
    public static void main(String[] args) {
        A obj = new B();  //we cannot create the object of interface but we can create its reference.
        obj.show();
        obj.config();

    }
}
