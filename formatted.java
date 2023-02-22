import java.util.Scanner;

public class formatted {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String y =sc.nextLine();
        sc.close();
        System.out.printf("%-15s,%03d", y,x);
    }
}
