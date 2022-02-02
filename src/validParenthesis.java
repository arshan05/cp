import java.util.Stack;

public class validParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack=  new Stack<>();

        for(int i =0; i<s.length() ; i++){
            char bracket = s.charAt(i);
            if(bracket == '(' || bracket == '[' || bracket=='{')
                stack.push(bracket);
            else{
                if(stack.empty())
                    return false;
                if(bracket == ')' && stack.peek() == '(')
                    stack.pop();
                else if(bracket == ']' && stack.peek() == '[')
                    stack.pop();
                else if(bracket == '}' && stack.peek() == '{')
                    stack.pop();

                else
                    return false;

            }
        }
        if(stack.empty())
            return true;

        return false;
    }

    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }
}
