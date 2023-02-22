class Calc{
    public int add(int a,int b){
        return a + b;
    }
    public int sub(int a,int b){
        return a - b;
    }
}
class AdvCalc extends Calc{
    public int add(int a,int b){
        System.out.println("in AdvanceCalc");
        return a + b;
    }
    public int sub(int a,int b){
        System.out.println("in advance calc");
        return a - b;
    }
}


public class methodOverridding {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1=obj.add(3,5);
        int r2=obj.sub(4,2);
        System.out.println(r1+" "+r2);
    }
}
