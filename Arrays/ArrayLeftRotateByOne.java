public class ArrayLeftRotateByOne {

    public static void leftRotate(int[] arr) {

        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {

            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        // int[] arr = { 30, 60,70 };

        int noOfTimesToRotate = 2;

        for (int i = 0; i < noOfTimesToRotate; i++) {
            ArrayLeftRotateByOne.leftRotate(arr);
        }

        for (int i : arr) {
            System.out.print( i + " ");
        }
        
    }
}
