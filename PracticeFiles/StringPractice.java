
public class StringPractice {

    public static boolean isPalindrome(String str, int start, int end){


        while (start < end) {
           
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;

            //abba
        }
        return true;

    }

    public static void longestSubString(String str) {
        int finalStart = 0;
        int maxLength = 0;

        for (int start = 0; start < str.length(); start++) {
            for (int end = start; end < str.length(); end++) {

                if (isPalindrome(str, start, end)) {

                    if ((end - start + 1) > maxLength || ((end - start + 1) == maxLength && start > finalStart)) {
                        finalStart = start;
                        maxLength = end - start + 1;
                    }
                }
            }
        }
        System.out.println(str.substring(finalStart, finalStart + maxLength));
    }

    public static void main(String[] args) {

        String str = "aabbccaa";

        StringPractice.longestSubString(str);
    }
}