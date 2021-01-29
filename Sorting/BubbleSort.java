public class BubbleSort {

    public static void main(String[] args){

        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int temp = 0;

        for(int i = array.length; i > 0; i--){
            for(int j = 0; j < array.length-1; j++){
                if(array[j] > array[j+1]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int k = 0; k < array.length; k++){
            System.out.println(array[k]);
        }
    }
}
