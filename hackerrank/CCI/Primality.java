// O(root(n)) solution for primality testing
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void primality(int n){
        boolean flag=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println("Prime");
        else
            System.out.println("Not prime");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            if(n==1)
                System.out.println("Not prime");
            else
                primality(n);
        }
    }
}
