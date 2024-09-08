public class TransposeMatrix {

    public static void pattern(int[][] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 11 },
                { 8, 9, 4, 12 },
                { 7, 6, 5, 13 },
                { 17, 16, 15, 14 }
        };

        TransposeMatrix.pattern(arr);

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
