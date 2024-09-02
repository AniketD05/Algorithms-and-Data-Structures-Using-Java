public class StringRotation {


    public static boolean areRotaion(String s1, String s2){

        if(s1.length() != s2.length()){
            return false;
        }

        String s3 = s1.concat(s2);

        return s3.indexOf(s2) >= 0;
    }
    
    public static void main(String[] args) {
        
        String s1 = "ABCD";
        String s2 = "CDAB";

        boolean result = StringRotation.areRotaion(s1,s2);
        System.out.println(result);
    }
}
