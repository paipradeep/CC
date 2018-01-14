/*
A kidnapper wrote a ransom note but is worried it will be traced back to him. He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use whole words available in the magazine, meaning he cannot use substrings or concatenation to create the words he needs.

Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.
*/
/*
The first line contains two space-separated integers describing the respective values of  (the number of words in the magazine) and  (the number of words in the ransom note). 
The second line contains  space-separated strings denoting the words present in the magazine. 
The third line contains  space-separated strings denoting the words present in the ransom note.
*/
import java.util.*;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Solution(String magazine, String note) {
        String magazineArray[] = magazine.split(" ");
        String noteArray[] = note.split(" ");
        magazineMap = new HashMap<String,Integer>();
        noteMap = new HashMap<String,Integer>();
        for(String temp: magazineArray){
            if(!magazineMap.containsKey(temp))
                magazineMap.put(temp,1);
            else
                magazineMap.put(temp,magazineMap.get(temp)+1);
        }
        for(String temp : noteArray){
            if(!noteMap.containsKey(temp))
                noteMap.put(temp,1);
            else
                noteMap.put(temp,noteMap.get(temp)+1);
        }
    }
    
    public boolean solve() {
        for(Map.Entry m : noteMap.entrySet()){
            String temp = (String)m.getKey();
            if(!magazineMap.containsKey(temp))
                return false;
            if(magazineMap.get(temp) < noteMap.get(temp))
                return false;
            
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
