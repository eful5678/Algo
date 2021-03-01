import java.util.Scanner;

public class Baek11720_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String nums = sc.next();
        int[] num = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            num[i] = Character.getNumericValue(nums.charAt(i));

        }

        for(int i = 0; i < n; i++){
            sum += num[i];

        }

        System.out.println(sum);
    }
}
