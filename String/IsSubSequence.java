
public class IsSubSequence {

    // public static boolean isSubSequence(String str1, String str2, int sizeStr1, int sizeStr2) {

    //     int j = 0;

    //     for(int i = 0; i < sizeStr1 && j < sizeStr2; ++i){

    //         if(str1.charAt(i) == str2.charAt(j)){
    //             j++;
    //         }
    //     }
    //     return (j == sizeStr2);
    // }

    public static boolean isSubSequence(String str1, String str2, int sizeStr1, int sizeStr2) {

       if(sizeStr2 == 0) return true;

       if(sizeStr1 == 0) return false;

        if(str1.charAt(sizeStr1 - 1) == str2.charAt(sizeStr2 - 1)){
            return isSubSequence(str1, str2, sizeStr1 - 1, sizeStr2 - 1);
        } else {
            return isSubSequence(str1, str2, sizeStr1 - 1, sizeStr2);
        }

    }


    public static void main(String[] args) {

        String str1 = "ABCDEF";
        String str2 = "AED";

        int sizeStr1 = str1.length();
        int sizeStr2 = str2.length();

        System.out.println(IsSubSequence.isSubSequence(str1, str2, sizeStr1, sizeStr2));
    }
}
