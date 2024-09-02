public class PatternSearch {

    public static void search(String str, String pat) {

        for (int i = 0; i <= (str.length() - pat.length());) {
            int j;
            for (j = 0; j < pat.length(); j++) {

                if (pat.charAt(j) != str.charAt(i + j)) {
                    break;
                }
            }
            if (j == pat.length()) {
                System.out.print(i + " ");
                //return;   //if only first occurence   
            }

            if (j == 0) {
                i++;
            } else {
                i = (i + j);
            }
        }
        
    }

    public static void main(String[] args) {
        String str = "ABCEABEFABCD";
        String pat = "ABC";

        PatternSearch.search(str, pat);
    }
}
