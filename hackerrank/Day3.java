Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of 2 to 5, print Not Weird
If  is even and in the inclusive range of  6 to 20 , print Weird
If  is even and greater than 20, print Not Weird

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      
      if(n%2==1 || n>=6 && n<=20){
         ans = "Weird";
      }
      else{
          ans = "Not Weird";
      }
      System.out.println(ans);
   }
}

