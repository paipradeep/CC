//Implementation of queues using 2 stacks
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void enQ(Stack stk,int ele){
        stk.push(ele);
    }
    public static void deQ(Stack stk1,Stack stk2){
        if(stk2.isEmpty()){
            while(!stk1.isEmpty()){
                stk2.push(stk1.pop());
            }
            stk2.pop();
        }
        else
            stk2.pop();
    }
    public static int front(Stack stk1,Stack stk2){
        if(stk2.isEmpty()){
            while(!stk1.isEmpty()){
                stk2.push(stk1.pop());
            }
            return (int)stk2.peek();
        }
        else
            return (int)stk2.peek();
    }
    //public static int top(Stack *stk)
    public static void main(String[] args) {
        Stack<Integer> stk1 = new Stack<Integer>();
        Stack<Integer> stk2 = new Stack<Integer>();
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        int p,q;
        while(Q!=0){
            Q--;
            p = in.nextInt();
            if(p == 1){
                q = in.nextInt();
                enQ(stk1,q);
            }
            else if(p == 2){
                deQ(stk1,stk2);
            }
            else{
                System.out.println(front(stk1,stk2));
            }
        }
    }
}
