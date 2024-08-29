public class ArrayFrequenciesInSortedarr {

    public static void calculateFrequencies(int arr[], int size) {

        int i = 1;
        int frequency = 1;
        while (i < size) {

            while (i < size && arr[i] == arr[i - 1]) {
                frequency++;
                i++;
            }
            System.out.println("Number: " + arr[i - 1] + " " + "Frequency: " + frequency);
            i++;
            frequency = 1;  
        }

        if (size == 1 || arr[size - 2] != arr[size - 1]) {

            System.out.println("Number: " + arr[size - 1] + " " + "Frequency: " + frequency);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 40, 50, 50, 50 };
        int size = arr.length;

        ArrayFrequenciesInSortedarr.calculateFrequencies(arr, size);
    }
}
