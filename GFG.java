//Priority queue with defined comparotor and anonymous class
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Comparator<Integer> cmp = new Comparator<Integer>(){
		    public int compare(Integer i1,Integer i2){
		        return i2-i1;
		    }
		};
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(cmp);
		Scanner in = new Scanner(System.in);
		int t,n,k,arr[];
		t = in.nextInt();
		while(t--!=0){
		    n = in.nextInt();
		    k = in.nextInt();
		    arr = new int[n];
		    for(int i=0;i<n;i++)
		        pq.add(in.nextInt());
		    for(int i=0;i<k;i++){
		        System.out.print(pq.peek() + " ");
		        pq.remove();
		        
		    }
		    System.out.println();
		    pq.clear();
		    
		}
		
	}
}
