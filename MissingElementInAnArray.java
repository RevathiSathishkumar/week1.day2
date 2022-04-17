package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	public static void main(String[] args) {
		
		int[] number= {6,1,7,5,4,9,2};
		Arrays.sort(number);
		
		int length =number.length;
		System.out.println(length);
	
		for (int i=0;i<length;i++)
		
		System.out.println(number[i]);		
		
		
	    
}

}