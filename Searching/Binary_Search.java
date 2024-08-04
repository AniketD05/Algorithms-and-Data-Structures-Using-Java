
public class Binary_Search {

    public static void bSearch(int arr[], int arrSize, int key){

        int low = 0;

        int high = arrSize - 1;

        while (low <= high) {
            
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index " + mid);
                return;
            } else if(arr[mid] > key){
                high = mid - 1;
            } else {
                low = low + 1;
            }
        }
        System.out.println("Element is not present");
    }

    public static void main(String args[]) {

        int[] arr = { 10, 12, 15, 17, 25, 18 };
        int arrSize = arr.length;

        int key = 1;

        Binary_Search.bSearch(arr, arrSize, key);
    }

}
