import java.util.HashMap;
import java.util.Map;

public class CoupaQ1 {

    public static void solution1(String str){

        int maxCharFreq = 0;
        char maxChar = ' ';

        for(int i = 0; i < str.length(); i++){

            int currCharFreq = 0;
            char currChar = str.charAt(i);

            for(int j = 0; j < str.length(); j++){
                if (str.charAt(j) == currChar) {
                    currCharFreq++;    
                }

                if (currCharFreq > maxCharFreq) {
                    maxCharFreq = currCharFreq;
                    maxChar = currChar;
                }
            }
        }
        char[] strArr = str.toCharArray();
        int start = 0;
        int end = strArr.length - 1;
        

        while (start < end) {
            char temp = strArr[start];
            strArr[start] = strArr[end];
            strArr[end] = temp;
            start++;
            end--;
        }   

        String reversedStr = new String(strArr);

        System.out.println(reversedStr + maxCharFreq + maxChar);
         
    }

    public static void solution(String str){

        HashMap<Character, Integer> freqMap = new HashMap<>();
        
        for(char c : str.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c,0) + 1);
        }

        int maxCharFreq = 0;
        char maxChar = ' ';

        for(Map.Entry<Character, Integer> entry : freqMap.entrySet()){
            if (entry.getKey() > maxCharFreq) {
                maxCharFreq = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        System.out.println(sb.toString() + maxCharFreq + maxChar);
    }

    public static void main(String[] args) {
        
        String str = "aaabbcccc";

        CoupaQ1.solution(str);
    }
}
