import java.util.Scanner;

public class Baek2529_Max {
    public static void main(String[] args) {
        // 최대값을 구하기 위해 수를 입력 받아 배열에 저장
        Scanner sc = new Scanner(System.in);
        int n = 9;
        int[] nums = new int[9];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int max = nums[0];
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }
        index = index+1;
        System.out.println(max + " " + index);
    }
}
