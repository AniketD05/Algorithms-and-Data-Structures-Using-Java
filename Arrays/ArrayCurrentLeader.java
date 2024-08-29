public class ArrayCurrentLeader {

    public static void isCurrentLeader(int[] arr) {

        int cur_leader = arr[arr.length - 1];

        System.out.print(cur_leader + " ");

        for (int i = arr.length - 1; i >= 0; i--) {

            if (cur_leader < arr[i]) {
                cur_leader = arr[i];
                System.out.print(cur_leader + " ");
            }
        }
    }
    
    public static void main(String[] args) {

        int[] arr = { 7, 10, 4, 10, 6, 5, 2 };

        ArrayCurrentLeader.isCurrentLeader(arr);
    }
}
