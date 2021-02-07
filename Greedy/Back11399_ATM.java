import java.util.Arrays;
import java.util.Scanner;

public class Back11399_ATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] time = new int[n];;
        int sum = 0;
        int temp = 0;
        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            int p = sc.nextInt();
            array[i] = p;
        }
        System.out.println(Arrays.toString(array));

        for(int l = 0; l < n; l++){

        }
        for(int j = 0; j < n; j++){
            for(int k = 0; k < j;  k++){
                temp += array[k];
                System.out.println(j + " : " + temp);
            }
            sum += temp;
            System.out.println("sum" + j + " : " + sum);
            temp = 0;



        }
        System.out.println(sum);


    }
}
