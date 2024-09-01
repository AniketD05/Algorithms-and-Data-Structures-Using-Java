import java.util.Arrays;

public class LongestDistinctSubString {

    public static boolean areDistinct(String str, int start, int end) {

        boolean visited[] = new boolean[256];

        for (int k = start; k <= end; k++) {
            if (visited[str.charAt(k)] == true) {
                return false;
            } else {
                visited[str.charAt(k)] = true;
            }
        }
        return true;
    }

    public static int longestDistinctSubString1(String str) {

        int result = 0;

        for (int start = 0; start < str.length(); start++) {
            for (int end = 0; end < str.length(); end++) {

                if (areDistinct(str, start, end)) {
                    result = Math.max(result, end - start + 1);
                }
            }
        }
        return result;
    }

    public static int longestDistinctSubString2(String str) {

        int result = 0;
        int start = 0;
        int prev[] = new int[256];
        Arrays.fill(prev, -1);
        for(int end = 0; end < str.length(); end++){
            
            start = Math.max(start, prev[str.charAt(end)] + 1);
            int maxEnd = end - start + 1;
            result = Math.max(result, maxEnd);
            prev[str.charAt(end)] = end;
        }
        return result;
    }

    public static void main(String[] args) {

        String str = "abac";

        int len = longestDistinctSubString2(str);

        System.out.println(len);
    }
}
