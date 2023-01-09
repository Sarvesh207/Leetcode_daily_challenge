import java.util.Stack;

/*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

    Example 1:

    Input: s = "()"
    Output: true
    Example 2:

    Input: s = "()[]{}"
    Output: true
    Example 3:

    Input: s = "(]"
    Output: false

 */
class isValid {
    public static boolean isValidParenthesis(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // chaeck for opening parenthesis
            if ((ch == '(') || (ch == '[' )|| (ch == '{')) {

                stack.push(ch);

            } else {

                if (stack.isEmpty()) {

                    return false;

                } else {

                    if ((stack.peek() == '(' && ch == ')')
                    || (stack.peek() == '[' && ch == ']')
                    || (stack.peek() == '{' && ch == '}')) 
                    {
                        stack.pop();
                    } else {
                        return false;
                    }

                }

            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "()[]{}";

        System.out.println(isValidParenthesis(s));
    }
}