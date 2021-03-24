import java.util.Scanner;

public class Baek2752_3NumSorting {
    public static void main(String[] args) {
        // 세 개의 숫자 오름차순 정렬

        Scanner sc = new Scanner(System.in);

        // 세 개의 수를 입력 받는 배열 생성
        int[] nums = new int[3];
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();

        }
        int temp = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length-1; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }


    }
}
