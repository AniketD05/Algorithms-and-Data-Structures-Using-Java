import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {

    public static void countFrequency1(int[] arr) {

        HashMap<Integer, Integer> hp = new HashMap<>();

        for(int x:arr){
            hp.put(x, hp.getOrDefault(x,0) + 1);
        }

        
        for(Map.Entry<Integer, Integer> e : hp.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }

    public static void countFrequency2(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            boolean flag = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }

            if (flag == true) {
                continue;
            }

            int frequency = 1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    frequency++;
                }
            }

            System.out.println(arr[i] + " " + frequency);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 10, 20, 20, 30, 10, 30 };
        //Integer[] arr = { 10, 20, 20, 30, 10, 30 };

        FrequencyOfElements.countFrequency1(arr);
    }
}
