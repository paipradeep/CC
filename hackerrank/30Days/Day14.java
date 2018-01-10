import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    Difference(int a[]){
        this.elements = a;
        this.maximumDifference = -100;
    }
    void computeDifference(){
        int len = this.elements.length,diff;
        for(int i=0;i<len-1;i++)
            for(int j=i;j<len;j++){
                diff = java.lang.Math.abs(this.elements[i]- this.elements[j]);
                if(diff > this.maximumDifference)
                    this.maximumDifference = diff;
            }
            
    }
    } // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
