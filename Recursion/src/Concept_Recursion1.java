public class Concept_Recursion1 {
    public static void main(String[] args) {

        System.out.println(sum(2));
        System.out.println(sum(10));
        System.out.println(sum(1));

    }
    static int sum(int n){
        if(n == 1){
            return 1;
        }else{
            return sum(n-1) + n;
        }
    }
}
