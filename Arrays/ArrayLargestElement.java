

public class ArrayLargestElement {
 
    public static int largestElement(int[] arr, int size){

        int maxElement = arr[0];

        for(int i = 0; i < size; ++i){
            
            if(arr[i] > maxElement){
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
    public static void main(String[] args){

        int[] arr = {700,5,10,500,900};

        int size = arr.length;

        int maxElement = ArrayLargestElement.largestElement(arr,size);

        System.out.println("Largest element is " + maxElement);
    }
}



