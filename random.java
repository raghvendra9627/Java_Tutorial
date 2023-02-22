public class random {
    
    public static int rolldice(){
        double randomnumber = Math.random();
        //System.out.println(randomnumber);
        randomnumber = randomnumber*6;
        int randomint = (int)randomnumber;
        return randomint;
    }
    public static void main(String[] args){
        int pass1 = rolldice();
        int pass2 = rolldice();
        int count = 1;
        //System.out.println(pass1);
        //System.out.println(pass2);
        while(!(pass1==pass2)){
            pass1 = rolldice();
            pass2 = rolldice();
            count = count +1;
        }
        System.out.println("total : "+ count);
    }
}
