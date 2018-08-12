package com.naughtycodes.solutions;

import java.util.HashMap;
import java.util.Map;

public class DistinctPairs {

	static int[] input  = {5,5,1};
	static int k 		= 10;
	public static int SumPairs(int[] input, int k){
	    Map<Integer, Integer> f = new HashMap<>();
	    int numpairs = 0;      

	    for(int i=0; i<input.length; i++){
	        int value = input[i];
	        int diff = k - input[i];

	        if(f.containsKey(diff)){                
	            int found = f.get(diff) - 1;
	            numpairs++;
	            
	            if(found == 0){
	                f.remove(diff);
	            }else{
	                f.put(diff, found);
	            }
	        }else{
	            if(f.containsKey(value)){         
	                f.put(value, f.get(value) + 1);             
	            }else{
	                f.put(value, 1);
	                System.out.println("pair => ("+value+",1)");
	            }
	        }
	    }
	    return numpairs;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("starting...!");
		System.out.println(DistinctPairs.SumPairs(input, k));
		System.out.println("ending...!");
		
	}

}
