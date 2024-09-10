import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashingPractice{

    public static void countFrequencies(int[] arr){
        
       for(int i = 0; i < arr.length; i++){
        int count = 1;
        boolean flag = false;

            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    flag = true;
                }
            }

            if(flag == true){
                continue;
            }

            for(int j = i + 1 ; j < arr.length; j++){
       
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

           if (!flag) {
            System.out.println(arr[i] + " " + count);
           }
       }

       
    }

    public static void main(String[] args) {
        
          int[] arr = {15,12,13,12,13,13,18};
        //int[] arr = {1,2,3};
        //int[] arr = {};

        HashingPractice.countFrequencies(arr);
    }
}