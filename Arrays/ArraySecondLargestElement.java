

// public class ArraySecondLargestElement {  //naive

//     public static int largestElement(int[] arr) {

//         int largestElement = arr[0];

//         for (int i = 0; i < arr.length; ++i) {
//             if (arr[i] > largestElement) {
//                 largestElement = arr[i];
//             }
//         }
//         return largestElement;
//     }

//     public static void secondLargest(int[] arr) {

//         int largestElement = ArraySecondLargestElement.largestElement(arr);
//         System.out.println(largestElement);

//         int result = -1;

//         int secondLargest = arr[0];

//         for (int i = 1; i < arr.length; ++i) {

//             if(arr[i] != largestElement){

//                 if(arr[i] > secondLargest){

//                     if (result == -1) {
//                         result = i;
//                     }
//                 }
//             }
//         }   
//         //System.out.println(result);
//         System.out.println(arr[result]);
//     }

//     public static void main(String[] args) {

//         int[] arr = { 12, 15, 2, 19, 5 };
//         //int[] arr = { 1,1,1 };

//         ArraySecondLargestElement.secondLargest(arr);
//     }
// }


// public class ArraySecondLargestElement { // optimized
//     public static void secondLargest(int[] arr) {

//         int secondLargest = -1; // 12

//         int largestElement = arr[0]; //15

//         for(int i = 1; i < arr.length; ++i){

//             if(arr[i] > largestElement){

//                 secondLargest = largestElement;
//                 largestElement = arr[i];

//             } else if (arr[i] != largestElement){

//                 if(secondLargest == -1 || arr[i] > secondLargest){
//                     secondLargest = arr[i];
//                 }
//             }
//         }   
//         System.out.println(largestElement);
//         System.out.println(secondLargest);
       
//     }

//     public static void main(String[] args) {

//         //int[] arr = { 12, 15, 2, 19, 5 };
//         int[] arr = { 1,1,1 };

//         ArraySecondLargestElement.secondLargest(arr);
//     }
// }