public class Demo {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(3,5);
        int r2 = obj.sub(5,3);
        int r3 = obj.mul(5,3);
        int r4= obj.div(6,3);
        System.out.println(r1 + " " +r2 + " " + r3 + " " + r4);
    }
}
