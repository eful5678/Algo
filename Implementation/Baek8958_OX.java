import java.util.Scanner;

public class Baek8958_OX {
    public static void main(String[] args) {
        // 정답이 O, 오답이 X일 때, 정답이 연속적일 경우 가중치를 두어 총점을 구하는 문제

        // 반복횟수 n을 입력받자
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String problems = "";
        int cnt = 0;
        int score = 0;
        for(int i = 0; i < n; i++){
            problems = sc.next();
            for(int j = 0; j < problems.length(); j++){
                if(problems.charAt(j) == 'O') {
                    cnt++;
                }else{
                    cnt = 0;
                }
                score += cnt;
            }
            System.out.println(score);
            score = 0;
            cnt = 0;
        }
    }
}
