import java.util.Scanner;

public class Concept_toOne_Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int target;
        int result = 0;
        while(true){

            // N이 K로 나누어 떨어지는 수가 될 때까지 1씩 빼기
            target = (n / k) * k;
            result += (n - target);
            n = target;

            // N이 K보다 작을 때(더 이상 나눌 수 없을 때) 반복문 탈출
            if(n < k){
                break;
            }

            result += 1;
            n = n/k;


        }
        result += (n-1);

        System.out.println(result);
    }
}
