
public class SquarePattern {

    public static void pattern(int arr[][]) {

        int right = arr.length - 1;
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;

            for(int i = left; i < arr.length; i++){
                System.out.print(arr[0][i] + " ");
            }

            for(int i = 1; i < arr.length; i++){
                System.out.print(arr[i][right] + " ");
            }

            for(int i = 1; i >= 0; i--){
                System.out.print(arr[bottom][i] + " ");
            }

            for(int i = 1; i >= 1; i--){
                System.out.print(arr[i][left] + " ");
            }
            for(int i = 1; i <= 1; i++){
                System.out.print(arr[i][right - 1] + " ");
            }

    }

    public static void main(String[] args) {
        
        int arr[][] = {
                    {1,2,3},
                    {8,9,4},
                    {7,6,5}
                  };

        SquarePattern.pattern(arr);
    }
}
