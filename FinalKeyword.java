//Final --> can be used with variable, methods, class
final class Calc{              //Now this class cannot be extended i.e. Calc class cannot be Inherited
    public void add(int a, int b){
        System.out.println(a+b);
    }

}
class AdvCalc{
    public final void show(){     //Now show() method in AdvCalc cannot be overridden.
        System.out.println("in AdvCalc show");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}

class VeryAdvCalc extends AdvCalc{
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
public class FinalKeyword {
    public static void main(String[] args){
        final int num = 2;  //Now the value of variable 'num' will never change in the program
        System.out.println(num);
        VeryAdvCalc obj = new VeryAdvCalc();
        obj.add(3,5);    
    }
}
