public class ArrayFrequenciesInUnSortedarr {

    public static void calculateFrequencies(int[] arr, int size) {

        for (int i = 0; i < size; i++) {

            boolean flag = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                continue;
            }

            int frequency = 1;

            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    frequency++;
                }
            }
            System.out.println("Number: " + arr[i] + " " + "Frequency: " + frequency);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 30, 10 };

        int size = arr.length;

        ArrayFrequenciesInUnSortedarr.calculateFrequencies(arr, size);
    }
}
