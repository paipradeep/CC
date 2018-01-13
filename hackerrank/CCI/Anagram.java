//O(n) solution for anagram using hashmap
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
      Map<Character,Integer> freq = new HashMap<Character,Integer>();
      for(int i=0;i<first.length();i++){
          
          if(!freq.containsKey(first.charAt(i)))
              freq.put(first.charAt(i),1);
          else
              freq.put(first.charAt(i),freq.get(first.charAt(i)) + 1);
      }
      for(int i=0;i<second.length();i++){
          
          if(!freq.containsKey(second.charAt(i)))
              freq.put(second.charAt(i),-1);
          else
              freq.put(second.charAt(i),freq.get(second.charAt(i)) - 1);
      }
      int count = 0;
      for(Map.Entry m : freq.entrySet()){
        //System.out.println(m);
          count += Math.abs((int)m.getValue());
      }
      return count;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
