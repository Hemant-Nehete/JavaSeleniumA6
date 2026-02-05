package org.java.NumberProgram;

public class WorkingWithArmStrongNumber {
	public static int countDigits(int num)
	{
		int count=0;
		while (num!=0) {
			
		
		count ++;
		 num = num/10;}
		
		return count;
	}
   
	public static int power(int n , int m)
	{   
		int pow = 1;
	
		for(int i=1; i<=m;i++)
		{
			pow = pow*n;
		}
		return pow;
		
	}
	public static boolean armStongNumber(int num) {
		 int original = num;
	        int digits = countDigits(num);
	        int sum = 0;

	        while (num != 0) {
	            int digit = num % 10;
	            sum = sum + power(digit, digits);
	            num = num / 10;
	        }

	        return sum == original;
	    }

	    // Main method
	    public static void main(String[] args) {
	        int number = 153;

	        if (armStongNumber(number)) {
	            System.out.println(number + " is an Armstrong Number");
	        } else {
	            System.out.println(number + " is NOT an Armstrong Number");
	        }
	
		
	}
}
