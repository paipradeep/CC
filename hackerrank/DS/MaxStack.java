/* Perform push, pop and max retrieval in O(1) */ 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<Integer>();
        Stack<Integer> maxstk = new Stack<Integer>();
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        int n1,n2;
        while(Q!=0){
            Q--;
            n1 = in.nextInt();
            if(n1 == 1){
                n2 = in.nextInt();
                stk.push(n2);
                if(maxstk.isEmpty() || n2 > maxstk.peek())
                    maxstk.push(n2);
                else{
                    int temp = maxstk.peek();
                    maxstk.push(temp);
                }
                    
            }
            else if(n1 == 2){
                stk.pop();
                maxstk.pop();
            }
            else{
                System.out.println(maxstk.peek());
            }
        }
    }
}
