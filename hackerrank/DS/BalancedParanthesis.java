//To check whether a given expression as balanced paranthesis or not
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isBalanced(String s) {
        Stack<Character> stk = new Stack<Character>();
        boolean balanced = false;
        /*if(stk.isEmpty())
            balanced = true;*/
        char op[] = s.toCharArray();
        for(char c : op){
            //System.out.println(c);
            if(c == '(' || c == '[' || c == '{')
                stk.push(c);
            else if(!stk.isEmpty() &&( c == ')'&&stk.peek()=='(' || c == '}'&&stk.peek()=='{' || c == ']'&&stk.peek()=='['))
                stk.pop();
            else{
                return "NO";
            }
        }
        if(stk.isEmpty())
            balanced = true;
        if(balanced)
            return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
