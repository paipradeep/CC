//Quick Sort
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int n;
    public static int[] arr;
    public static void swap(int i,int j){
        int t  = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    
    public static int partition(int start,int end){
        int pivot = arr[end];
        int i = start-1;
        for(int j=start;j<end;j++){
            if(arr[j]<=pivot){
                i++;
                swap(i,j);
            }
        }
        i++;
        swap(i,end);
        return i;
    }
    static void quicksort(int start,int end) {
        if(start>end)
            return;
        int p = partition(start,end);
        quicksort(start,p-1);
        quicksort(p+1,end);
  
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        quicksort(0,n-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i != arr.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
