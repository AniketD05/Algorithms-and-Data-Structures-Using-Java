import java.util.Scanner;

public class ArrayInsertElement {

    public static int insertElement(int arr[], int num, int pos, int size, int totalCapacity) {
        if (size == totalCapacity) {
            return size;
        }

        int index = pos - 1;

        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

        arr[index] = num;

        return ++size;
    }

    public static void display(int arr[], int size) {
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number you wish to add:");
        int num = sc.nextInt();

        System.out.println("At what position do you wish to insert the number?");
        int pos = sc.nextInt();

        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 12;
        arr[2] = 6;

        int totalCapacity = 5;
        int size = 3;

        System.out.println("Array before insertion:");
        display(arr, size);

        System.out.println("\nArray after insertion:");
        int result = insertElement(arr, num, pos, size, totalCapacity);
        display(arr, result);

        sc.close();
    }
}
