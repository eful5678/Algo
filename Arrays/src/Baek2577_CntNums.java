import java.util.Scanner;

public class Baek2577_CntNums {
    public static void main(String[] args) {
        // 3개의 숫자를 입력 받은 뒤 곱해준다.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int num = A * B * C;
        System.out.println(num);

        // 각 자리수(0~9)를 상징하는 배열을 만든다.
        int[] digits = new int[10];

        // 3개의 수를 곱한 수에서 각자릿수에 수를 나누기 몫을 통하여 구한뒤 배열에 저장한다.
        int dnum = num;
        for(int i = 9; i >= 0; i--){
            dnum = num % 10;
            digits[i] = dnum;
            num = num / 10;
        }

        // 각 자릿수에 쓰인 숫자의 횟수를 찾는다.
        for(int i = 0; i < 10; i++){
            if(digits[i] == 0){

            }
        }
        for(int i = 0; i < 10; i++){
            System.out.println(digits[i]);
        }


    }
}
