import java.io.*;
import java.nio.Buffer;


public class Baek15552_fastFor {

    public static void main(String[] args) {
        int a, b;

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int T = Integer.parseInt(br.readLine());
            int[] array = {};


            for(int i = 0; i < T; i++){
                String[] strs = br.readLine().split(" ");
                a = Integer.parseInt(strs[0]);
                b = Integer.parseInt(strs[1]);

                bw.write(String.valueOf(a+b));
                bw.newLine();
            }
            br.close();
            bw.flush();
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}

