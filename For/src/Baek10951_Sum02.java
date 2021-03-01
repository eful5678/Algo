import java.util.Scanner;

public class Baek10951_Sum02 {
    public static void main(String[] args) {
        // 처리할 연산의 개수 n을 받아오는 기능
        Scanner sc = new Scanner(System.in);

        int A = 0;
        int B = 0;
        // 연산이 n 번만큼 실행되는 반복문 선언
        while(sc.hasNext()){
            // 두 수를 더하는 연산을 n번 만큼 반복
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.println(A+B);


        }
        sc.close();

    }
}
