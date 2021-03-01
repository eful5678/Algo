import java.util.ArrayList;
import java.util.Scanner;

public class Baek1158_JosephusProblem {
    public static void main(String[] args) {
        // 사람의 수 N 과 순서 K 를 입력받기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] people = new int[N];
        int[] dpeople = new int[N];
        ArrayList p = new ArrayList();

        // 현재 존재하는 사람들 중 K번째 사람을 제거하고, K를 기록
        for(int i = 0; i < N; i++){
            // ArrayList에 1번부터 N번까지 N명의 사람을 저장
            p.add(i+1);
        }
        System.out.println(p.size());
        System.out.println((int)p.get(K));
        for(int i = 0; i < K; i++){
            people[i] = (int)p.get(K-1);
            p.remove(K-1);
        }

        System.out.println(p);

        for(int i = 0; i < N; i++){
            System.out.println(people[i]);
        }


    }
}
