/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

/**
 *
 * @author prash
 */
public class StaircaseProblem {

	
	public static void main(String args[]) {
		
		int n=1;
		int ans=0;
		int ans1= stairCase(n);
		System.out.println("Answer "+ans1);
		
	}

	private static int stairCase(int n) {
		
		if(n<0) {
			
			return 0; 
			
		}
		if(n==0) {
			
			return 1;
		}
		
		return stairCase(n-1)+stairCase(n-2);
		
	}
	
}
