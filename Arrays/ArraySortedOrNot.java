
public class ArraySortedOrNot {

    // public static void isSorted(int[] arr){  --->>>Naiveee

    //     for(int i = 0; i < arr.length; ++i){
    //         for(int j = i + 1; j < arr.length; ++j){
    //             if(arr[j] < arr[i]){
    //                 System.out.println("Array is not sorted!!");
    //                 return;
    //             }
    //         }
    //     }
    //     System.out.println("Array is Sorted!!");

    // }


    public static void isSorted(int[] arr){

        for(int i = 1; i < arr.length; ++i){

            if (arr[i] < arr[i - 1] ) {
                System.out.println("Array is Not Sorted!!");
                return;
            }
        }
        System.out.println("Array is Sorted!!");

    }

    public static void main(String...args){

        int arr[] = {10,12,13,18,22,25};

        for(int element: arr){
            System.out.print(element + " ");
        }
        System.out.println();

        ArraySortedOrNot.isSorted(arr);
    }
}
