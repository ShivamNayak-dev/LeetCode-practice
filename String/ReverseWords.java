import java.util.Stack;

public class ReverseWords {
    static String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder word = new StringBuilder();

        
        for (int i = 0; i < s.length(); i++) {

            
            if (s.charAt(i) != '.') {
                word.append(s.charAt(i));
            }

            
            else if (word.length() > 0) {
                stack.push(word.toString());
                word.setLength(0);  
            }
        }

        
        if (word.length() > 0) {
            stack.push(word.toString());
        }

       
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
            if (!stack.isEmpty()) {
                result.append(".");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "..geeks..for.geeks.";
        System.out.println(reverseWords(s));
    }
}
