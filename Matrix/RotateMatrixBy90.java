public class RotateMatrixBy90 {

    public static void pattern(int[][] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

       

        for(int i = 0; i < arr.length; i++ ){

            int low = 0; int high = arr.length - 1;
            
            while (low < high) {
                int temp = arr[low][i];
                arr[low][i] = arr[high][i];
                arr[high][i] = temp;

                low++;
                high--;

            }
        }
    }

    public static void main(String[] args) {

        int arr[][] = {
                { 1, 2, 3},
                { 8, 9, 4},
                { 7, 6, 5},
        };

        RotateMatrixBy90.pattern(arr);

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
