
public class ArrayMoveZerosToEnd {

    // public static void moveZeros(int[] arr) {

    // for (int i = 0; i < arr.length; i++) {

    // if (arr[i] == 0) {

    // for (int j = i + 1; j < arr.length; j++) {

    // if (arr[j] != 0) {
    // int temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;
    // }
    // }
    // }
    // }

    // for (int i : arr) {
    // System.out.print(i + " ");
    // }
    // }
    public static void moveZeros(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
               
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
            }
           
        }
    
        for(int i:arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = { 10, 5, 0, 0, 8, 0, 9, 0 };

        ArrayMoveZerosToEnd.moveZeros(arr);
    }
}
