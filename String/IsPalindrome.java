
public class IsPalindrome {
    
    // public static void isPalindrome(String str){

    //     StringBuilder revStr = new StringBuilder(str);

    //     StringBuilder result  = revStr.reverse();

    //     System.out.println(str);
    //     System.out.println(result);
        
    //     System.out.println(str.equals(result.toString()));
    // }

    public static boolean isPalindrome(String str){ //optimized

        int start = 0;
        int end = str.length() - 1;

        while(start < end){

            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    public static void main(String[] args){

        // IsPalindrome.isPalindrome("sstssa");
        System.out.println(IsPalindrome.isPalindrome("sstssa"));
    }
}
