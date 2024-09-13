
public class LongestPalindromicSubString{

    public static String find(String str){

        int result = 0;
        int finalStartIndex = 0;

        for(int start = 0; start < str.length(); start++){
           
            for(int end = start; end < str.length(); end++){
                
                if(isPalindrome(str,start,end)){
                    if((end - start + 1) > result){
                        result = end - start + 1;
                        finalStartIndex = start;
                    }
                }
            }
        }
        return str.substring(finalStartIndex, finalStartIndex + result);

    }
    public static boolean isPalindrome(String str, int start, int end){

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

        String str = "ABAAB";
        
       System.out.println(LongestPalindromicSubString.find(str));
    }
}