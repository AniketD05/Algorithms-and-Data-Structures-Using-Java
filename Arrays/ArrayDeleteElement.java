import java.util.Scanner;

public class ArrayDeleteElement {

    public static void deleteElement(int num, int size, int[] arr, int cap) {

        int i,j;

        for (i = 0; i < size; ++i) {

            if (arr[i] == num) {
                // arr[i] = 0;
                size = size - 1;
                break;
            }
        }

        if (i == (cap - 1)) {
            System.out.println("Element not found");
        }

        System.out.println("\nsize of an Array after deleting " + num + " is " + size);

        for (j = i; j < cap - 1; ++j) {
            arr[j] = arr[j + 1];
        }
    
        System.out.println("Array After Deletion");
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = { 12, 5, 4, 6, 9 };

        int size = arr.length;
        int cap = arr.length;

        System.out.println("Enter number you wish to delete : ");
        int num = sc.nextInt();

        System.out.println("size of an Array before deleting " + num + " is " + size);
        System.out.println("Array Before Deletion");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        ArrayDeleteElement.deleteElement(num, size, arr, cap);
        

    }
}
