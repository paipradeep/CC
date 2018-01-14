// Using Stack collection
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBalanced(String expression) {
        Stack<Character> stk = new Stack<Character>();
        char arr[] = expression.toCharArray();
        for(Character c : arr){
            if(c == '(' || c == '{' || c == '[')
                stk.push(c);
            if(stk.isEmpty())
                return false;
            else if(!stk.isEmpty() && (c == ')' && stk.peek() == '(' || c == '}' && stk.peek() == '{' || c == ']' && stk.peek() == '['))
                stk.pop();
        }
        if(stk.isEmpty())
            return true;
        return false;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
