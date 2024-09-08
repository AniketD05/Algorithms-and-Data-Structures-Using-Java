
public class SquarePattern {

    public static void pattern(int arr[][]) {

        int right = arr[0].length - 1;
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;

            for(int i = 0; i < arr[0].length; i++){
                System.out.print(arr[top][i] + " ");
            }

            for(int i = 1; i < arr.length; i++){
                System.out.print(arr[i][right] + " ");
            }

            if (top != bottom) {
                for (int i = right - 1; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
            }
            
            if (left != right) {
                for (int i = bottom - 1; i > top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
            }

    }

    public static void main(String[] args) {
        
        int arr[][] = {
            {1, 2, 3, 11},
            {8, 9, 4, 12},
            {7, 6, 5, 13},
            {17, 16, 15, 14}
        };
        
        
        
        
        
        

        SquarePattern.pattern(arr);
    }
}
