public class code {

    public static void solution(int[] arr) {

        int result = arr[0];
        int maxEnd = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // maxEnd = Math.max(maxEnd + arr[i], arr[i]);
            // result = Math.max(maxEnd, result);

            if ((maxEnd + arr[i]) > arr[i]) {
                maxEnd = maxEnd + arr[i];
            } else {
                maxEnd = arr[i];
            }

            if (maxEnd > result) {
                   result = maxEnd; 
            } else {
                result = result;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {

        // int[] arr = {10,4,2,15,13,20};
        int arr[] = { 2, 3, -8, 7, -1, 2, 3 };

        code.solution(arr);
    }
}
