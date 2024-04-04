public class LowerToUpper {

    public static String convertToLowerToUpper(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                ch = (char) (ch - 'a' + 'A');
            }
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Aniket";
        String converted = convertToLowerToUpper(input);
        System.out.println("After Conversion from Lower to Upper case --> " + converted);
    }
}
