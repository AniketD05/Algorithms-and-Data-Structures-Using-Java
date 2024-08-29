import java.util.Arrays;

public class StringPractice {

    public static final int CHAR = 256;

    public static boolean isAnagram(String str1, String str2) {

        if(str1.length() != str2.length()){
            return false;
        }

        int[] count = new int[CHAR];

        for(int i = 0; i < str1.length(); i++){
            
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        for(int i = 0; i < CHAR; i++){
            if(count[i] != 0){
                return false;
            } 
        }
        return true;
    }

    public static void main(String[] args) {

        String str1 = "abaaaac";
        String str2 = "aaacba";

        boolean result = StringPractice.isAnagram(str1, str2);
        if (result) {
            System.out.println("is Anagram!!");
        } else {
            System.out.println("is not a Anagram!!");
        }
       
    }
}