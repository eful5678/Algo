import java.util.HashMap;
import java.util.Scanner;

public class Baek2920_Scale {
    public static void main(String[] args) {
        // 음계 8개의 숫자를 숫자를 입력 받고 character에 저장
        // c d e f g a b C
        Scanner sc = new Scanner(System.in);
        char[] chars = new char[8];
        // HashMap에 숫자에 따른 알파벳 저장
        HashMap Scale = new HashMap();
        Scale.put(1,'c');
        Scale.put(2,'d');
        Scale.put(3,'e');
        Scale.put(4,'f');
        Scale.put(5,'g');
        Scale.put(6,'a');
        Scale.put(7,'b');
        Scale.put(8,'C');
        for(int i = 0; i < 8; i++){
            int x = sc.nextInt();

            chars[i] = (char)Scale.get(x);
        }

        String scales = String.valueOf(chars);


        if(scales.equals("cdefgabC")){
            System.out.println("ascending");
        }else if(scales.equals("Cbagfedc")){
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }

    }
}
