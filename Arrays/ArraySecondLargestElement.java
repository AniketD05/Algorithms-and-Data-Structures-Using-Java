

public class ArraySecondLargestElement {
    public static void secondLargest(int[] arr){

        int largestElement = arr[0];
        int secondLargest = arr[1];
        int temp;

        for(int i = 0; i < arr.length; ++i){

            if(arr[i] < arr[i + 1]){
                temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args){

        int arr[] = {10,5,8,20};

        int secondLargest = ArraySecondLargestElement.secondLargest(arr);
    }
}
