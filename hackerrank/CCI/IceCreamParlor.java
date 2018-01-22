//Usage of hash map for 2 sum problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
   
    static void solve(int[] arr, int money) {
        Map<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
            hashmap.put(arr[i],i);
        
        for(int i=0;i<arr.length;i++){
            if(hashmap.containsKey(money-arr[i])){
                System.out.println((i+1) + " " + (hashmap.get(money-arr[i])+1));
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int money = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            solve(arr, money);
        }
        in.close();
    }
}
