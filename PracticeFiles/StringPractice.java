import java.util.Arrays;
import java.util.Stack;

public class StringPractice{

    public static String longestDistinctSubString(String str){

        int result = 0;
        int finalStartIndex = 0;
        int start = 0;
        int maxEnd = 0;
        int[] prev = new int[256];
        Arrays.fill(prev, -1);  

        for(int end = 0; end < str.length(); end++){
            
            start = Math.max(start, prev[str.charAt(end)] + 1);

            maxEnd = end - start + 1;

            if(maxEnd > result){
                result = maxEnd;
                finalStartIndex = start;
            }

            prev[str.charAt(end)] = end;
            
        }
        return str.substring(finalStartIndex, finalStartIndex + result);
    }


    public static void main(String[] args) {
      
        String str = "abac";

        System.out.println(StringPractice.longestDistinctSubString(str));;
    }

}