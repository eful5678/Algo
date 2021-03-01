import java.util.Scanner;

public class Baek11022_Sum01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a,b,c;
        for(int i = 0; i < T; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = a+b;
            System.out.println("Case #" + (i+1) + ": " + a + " + " + b + " = " + c);
        }

    }

}
