public class SpiralPattern {

    public static void pattern(int[][] arr) {

        int top = 0;
        int right = arr[0].length - 1;
        int bottom = arr.length - 1;
        int left = 0;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
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

        SpiralPattern.pattern(arr);
    }
}
