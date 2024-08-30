import java.util.HashSet;

public class IntersectionArray {

    public static void findIntersection(int arr1[], int arr2[]){

        // for(int i = 0; i < arr1.length; i++){
        //     boolean flag = false;
        //     for(int j = 0; j < arr2.length; j++){
        //         if(arr1[i] == arr2[j]){
        //             flag = true;
        //             break;
        //         }
        //     }
        //     if (flag) {
        //         System.out.print(arr1[i] + " ");
        //     }
        // }

        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < arr2.length; i++){
            hs.add(arr2[i]);
        }

        for(int i = 0; i < arr1.length; i++){
            if (hs.contains(arr1[i])) {
                System.out.print(arr1[i] + " ");
            }
        }
    }
    

    public static void main(String[] args) {
        int[] arr1 = {10,20,30};
        int[] arr2 = {10,30};

        IntersectionArray.findIntersection(arr1,arr2);
    }
}
