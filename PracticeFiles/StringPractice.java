import java.util.Stack;

public class StringPractice{

    public static void reverseSentence(String sentence){

        String[] words = sentence.split("\\.");

        Stack<String> st = new Stack<>();

        for(String word : words ){
            st.push(word);
        }

        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());

            if(!st.isEmpty()){
                sb.append(" ");
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        
        String sentence  = "My.Name.Is.Aniket";

        StringPractice.reverseSentence(sentence);
    }

}