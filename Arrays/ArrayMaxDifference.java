public class ArrayMaxDifference {
    
    // public static int maxDifference(int[] arr, int size){  //naive

    //     int result = arr[1] - arr[0];
        
    //     for(int i = 0; i < size; i++){
    //         for(int j = i + 1; j < size; j++){

    //             result = Math.max(result, arr[j] - arr[i]);
    //         }
    //     }
    //     return result;
    // }

    public static int maxDifference(int[] arr, int size){  //efficient

        int result = arr[1] - arr[0];
        int minValue = arr[0];
        
        for(int i = 1; i < size; i++){
            result = Math.max(result, arr[i] - minValue);
            minValue = Math.min(minValue, arr[i]);
        }
        return result;
    }

    public static void main(String[] args){

        //int[] arr = {2, 3, 10, 6, 4, 8, 1};
        int[] arr = {30,10,8,2};

        int size = arr.length;

        int maxDiff = ArrayMaxDifference.maxDifference(arr, size);
        System.out.println(maxDiff);
    }
}
