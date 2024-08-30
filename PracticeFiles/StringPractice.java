class StringPractice {

    public static void reverseWords(char[] arr, String str){

        int start = 0;

        for(int end = 0; end < str.length(); end++ ){

            if(arr[end] == '.'){
                reverse(arr, start, end-1);
                start = end + 1;
            }
        }
        reverse(arr, start, str.length() - 1);
        reverse(arr, 0, str.length() - 1);
    }

    public static void reverse(char[] arr, int start,int end) {

        while (start < end) {

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }

    public static void main(String[] args) {

        String str = "My.Name.Is.Aniket.Dhiwar";

        char[] arr = str.toCharArray();

        StringPractice.reverseWords(arr, str);
        System.out.println(arr);

    }
}
