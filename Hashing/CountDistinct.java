import java.util.Arrays;
import java.util.HashSet;

public class CountDistinct {

    // public static void isDistinct(int[] arr){

    // int count = 0;

    // for(int i = 0; i < arr.length; i++){

    // boolean flag = false;

    // for(int j = 0; j < i; j++ ){

    // if(arr[i] == arr[j] ){
    // flag = true;
    // }
    // }

    // if (flag == false) {
    // count++;
    // }

    // }

    // System.out.println(count);

    // }

    // public static void isDistinct(Integer[] arr){

    // HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));

    // System.out.println(set.size());
    // }

    public static void isDistinct(int[] arr) {

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println(set.size());
    }

    public static void main(String[] args) {

        int[] arr = { 10, 20, 20, 10, 30, 10 };
        // Integer[] arr = { 10, 20, 20, 10, 30, 10 };

        CountDistinct.isDistinct(arr);
    }
}
