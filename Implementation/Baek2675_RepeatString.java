import java.util.Scanner;

public class Baek2675_RepeatString {
    public static void main(String[] args) {
        //문자열과 반복횟수를 입력 받고, 문자열의 각 문자를 반복횟수만큼 반복하여 출력

        // 테스트케이스를 몇 번 반복할지 입력 받는다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;
        String what="";

        // 테스트케이스의 숫자만큼 반복횟수와 문자열을 입력받는다.
        for(int i = 0; i < n; i++){
            x = sc.nextInt();
            what = sc.next();
            char[] letter = new char[what.length()];
            for(int j = 0; j < what.length(); j++){
                letter[j] = what.charAt(j);
                for(int k = 0; k < x; k++){
                    System.out.print(letter[j]);
                }
            }
            System.out.println();

        }

        // 문자열 출력


    }
}
