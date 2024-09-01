import java.util.HashSet;

public class ZeroSumSubArray {

    // public static boolean isZeroSum(int[] arr){  //naive

    //     for(int i = 0; i < arr.length; i++){
    //         int currSum = 0;

    //         for(int j = i; j < arr.length; j++){

    //             currSum = currSum + arr[j];
    //             if(currSum == 0){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    public static boolean isZeroSum(int[] arr){

        HashSet<Integer> h = new HashSet<>();

        int currSum = 0;

        for(int i = 0; i < arr.length; i++){

            currSum = currSum + arr[i];

            if(h.contains(currSum)){
                return true;
            }

            if(currSum == 0){
                return true;
            }
            h.add(currSum);
        }
        return false;
    }
    
    public static void main(String[] args){

        int[] arr  = {4,-3,2,1};

       boolean result = ZeroSumSubArray.isZeroSum(arr);
       System.out.println(result);
    }
}
