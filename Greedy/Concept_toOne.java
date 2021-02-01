import java.util.Scanner;

public class Concept_toOne {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("N : ");
        int n = sc.nextInt();

        System.out.print("K : ");
        int k = sc.nextInt();

        int temp = 0;
        int cnt = 0;
        for(int i = 0; i < 5; i++){
            if(n%k == 0){
                temp = n/k;
                cnt++;
            }else{
                n--;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
