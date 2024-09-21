public class StringPractice {

    public static void solution(char[] strArr) {

            int start = 0;

            for (int end = start + 1; end < strArr.length; end++) {
                if (strArr[end] == ' ') {
                    reverse(strArr, start, end - 1);
                    start = end + 1;
                }
            }
        

        reverse(strArr, start, strArr.length - 1);
        reverse(strArr, 0, strArr.length - 1);

    }

    public static void reverse(char[] strArr, int start, int end) {

        while (start < end) {
            char temp = strArr[start];
            strArr[start] = strArr[end];
            strArr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        String str = "my name is aniket dhiwar";

        char[] strArr = str.toCharArray();

        StringPractice.solution(strArr);
        System.out.println(strArr);

    }
}