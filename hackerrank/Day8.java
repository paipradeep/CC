/*Given  names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. You will then be given an unknown number of names to query your phone book for. For each queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; if an entry for  is not found, print Not found instead.*/
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> dict = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            dict.put(name,(Integer)phone);
            
        }
        while(in.hasNext()){
            String s = in.next();
            if(dict.containsKey(s)){
                System.out.println(s + "=" + dict.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
