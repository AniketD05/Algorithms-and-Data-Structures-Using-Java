
public class ArrayREVERSING {

    public static void reverseArray(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;

        }
    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50 };

        System.out.println("Initial Array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        ArrayREVERSING.reverseArray(arr);

        System.out.println("Reversed Array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
