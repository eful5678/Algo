import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Baek1427_SortInside {
    public static void main(String[] args) {
        //배열 입력받기
        int a;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(br.readLine());
            int array[] = new int[n];

            for (int i = 0; i < n; i++) {
                String[] strs = br.readLine().split(" ");
                a = Integer.parseInt(strs[0]);
                array[i] = a;
            }

            Arrays.sort(array);

            for(int i = 0; i < n; i++){
                System.out.println(array[i]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
