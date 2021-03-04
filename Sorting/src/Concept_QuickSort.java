public class Concept_QuickSort {
    public static void main(String[] args) {
        int[] A = {4, 2, 5, 8, 6, 2, 3, 7, 10};
        System.out.println(quick(A));
    }

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

            for(int i = 0; i < array.length; i++){
                System.out.println("S");
                System.out.print(S[i] + " ");
                System.out.println("M");
                System.out.print(M[i] + " ");
                System.out.println("L");
                System.out.print(L[i] + " ");
            }
            //listedArray = quick(S) + quick(M) + quick(L);
            return M;

        }

    }
}
