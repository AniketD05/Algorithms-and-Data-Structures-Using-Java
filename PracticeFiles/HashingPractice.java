import java.util.HashMap;
import java.util.Map;

public class HashingPractice {
    public static void countFrequency(int[] arr){

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i : arr){
            hashMap.put(i, hashMap.getOrDefault(i,0) + 1);
        }

        for(Map.Entry<Integer, Integer> e : hashMap.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

    public static void main(String[] args) {
        int[] arr = { 50, 50, 10, 40, 10 };

        HashingPractice.countFrequency(arr);

    }
}
