
public class ArrayRemoveDuplicateSortedArr {


    // public static void removeDuplicate(int arr[]){

    //     int temp[] = new int[arr.length];

    //     temp[0] = arr[0];

    //     int tempArrSize = 1;

    //     for(int i = 1; i < arr.length; ++i){

    //         if(temp[tempArrSize - 1] != arr[i]){
    //             temp[tempArrSize] = arr[i];
    //             tempArrSize++;
    //         }
    //     }
    //     System.out.println(tempArrSize);

    //    for(int i = 0; i < arr.length; i++){
    //     arr[i] = temp[i];
    //    }

    //     for (int element : arr) {
    //         System.out.print(element + " ");
    //     }   
    // }

    public static void removeDuplicate(int arr[]){

        int result = 1;

        for(int i = 1; i < arr.length; i++){

            if(arr[i] != arr[result - 1]){
                arr[result] = arr[i];
                result++;
            }
        }

        System.out.println(result);
    }
    
    public static void main(String[] args){

        int arr[] = {10,20,30,40,50,50,50,70,70,70};

        ArrayRemoveDuplicateSortedArr.removeDuplicate(arr);
    }
}
