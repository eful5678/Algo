import java.util.Arrays;
import java.util.Scanner;

public class Beck1978_PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        // 숫자 입력 횟수
        int input = sc.nextInt();
        
        int temp = 0;
        int cnt = 0;

        for(int i = 0; i < input; i++){
            int p = sc.nextInt();
            for(int j = 1; j < 1001; j++){
                if(p % j == 0){
                    temp++;
                }
            }
            if(temp == 2){
                cnt++;
            }
            temp = 0;
        }
        System.out.println(cnt);
    }
}
