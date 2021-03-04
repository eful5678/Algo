import java.util.Scanner;

public class Baek2751_SortNumber {
    public static void main(String[] args) {
        // 수개의 개수를 입력받기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // N개의 숫자 입력 받기
        int[] nums = new int[N];
        int a;
        for(int i = 0; i < N; i++){
            nums[i] = sc.nextInt();
        }

        // 숫자들으라 오름차순으로 정렬하기
        int temp = 0;
        for(int i = 0; i < N; i++){

            for(int j = 0; j < N-1; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;



                }
            }

        }
        for(int k = 0; k < N; k++){
            System.out.print(nums[k]+" ");
        }




    }
    // 정렬을 위한 함수
    static int[] quick(int[] array){
        int p;
        int[] listedArray = new int[array.length];
        if(array.length <= 1){
            return array;
        }else{
            p = array[0];
            int[] S = {};
            int[] M = {};
            int[] L = {};

            for(int i = 0; i < array.length; i++){
                if(array[i] < p){
                    S[i] = array[i];
                }else if(array[i] > p){
                    L[i] = array[i];
                }else{
                    M[i] = array[i];
                }
            }
            //listedArray = quick(S) + quick(M) + quick(L);
            return listedArray;

        }

    }
}
