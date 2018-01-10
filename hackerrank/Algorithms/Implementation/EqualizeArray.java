// https://www.hackerrank.com/challenges/equality-in-a-array/problem
//Find minimum number of deletions on array such that array contais same elements
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int equalizeArray(int[] arr) {
        Map<Integer,Integer> dict = new HashMap<Integer,Integer>();
        int max = 1,temp;
        for(int i : arr){
            if(!dict.containsKey(i)){
                dict.put(i,1);
            }
            else{
                temp = dict.get(i);
                dict.put(i,temp+1);
                if(temp+1>max)
                    max = temp+1;
            }
        }
        return arr.length - max; 
    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = equalizeArray(arr);
        System.out.println(result);
        in.close();
    }
}
