import java.util.Scanner;

public class Baek10871_LessthanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] nums = new int[N];
        int[] snums = {};

        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i < nums.length; i++){
           if(nums[i] < X){
               System.out.print(nums[i]+" ");
           }
        }
    }
}