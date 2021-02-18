import java.util.Scanner;

public class Back10818_MaxMin {
    public static void main(String[] args) {
        //n개의 정수를 입력 받기 위한 스캐너
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n개의 정수 입력받은 뒤, 배열에 저장
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            nums[i] = num;
        }

        // 최대값 및 최소값을 구하기 위해, 초기값을 입력받은 배열의 첫번째 원소로 지정하고 입력받은 배열의 각 원소와 비교
        int max = nums[0];
        int min = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
            if(min > nums[i]){
                min = nums[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
