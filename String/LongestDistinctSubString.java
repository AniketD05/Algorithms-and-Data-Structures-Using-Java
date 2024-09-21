import java.util.HashMap;

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

    public static void longestSubString(String str) {

        int finalStart = 0;
        int maxLength = 0;

        for (int start = 0; start < str.length(); start++) {
            for (int end = start; end < str.length(); end++) {

                if (areDistinct(str, start, end)) {
                    if ((end - start + 1) > maxLength) {
                        finalStart = start;
                        maxLength = end - start + 1;
                    }
                }
            }
        }

        System.out.print(str.substring(finalStart, finalStart + maxLength));

    }

    public static void longestSubString1(String str) {

        int finalStart = 0;
        int maxLength = 0;

        for (int start = 0; start < str.length(); start++) {

            boolean visited[] = new boolean[256];

            for (int end = start; end < str.length(); end++) {
                if (visited[str.charAt(end)] == true) {
                    break;
                } else {
                    visited[str.charAt(end)] = true;

                    if ((end - start + 1) > maxLength) {
                        finalStart = start;
                        maxLength = end - start + 1;
                    }
                }
            }
        }
        System.out.print(str.substring(finalStart, finalStart + maxLength));
    }

    public static void longestSubString2(String str) {

        int finalStart = 0;
        int maxLength = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        int start = 0;
        
        for(int end = 0; end < str.length(); end++){

            if(map.containsKey(str.charAt(end))){

                start = Math.max(start, map.getOrDefault(str.charAt(end),0) + 1);
            }

            map.put(str.charAt(end), end);

            if ((end - start + 1) > maxLength) {
                maxLength = end - start + 1;
                finalStart = start;
            }
        }

        System.out.print(str.substring(finalStart, finalStart + maxLength));
    }

    public static void main(String[] args) {

        String str = "abaccasdfghhh";

        LongestDistinctSubString.longestSubString(str);
    }
}