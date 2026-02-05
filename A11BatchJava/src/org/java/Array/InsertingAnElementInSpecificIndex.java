package org.java.Array;

public class InsertingAnElementInSpecificIndex {
	public static void main(String[] args) {
		int[] arr =  {10,45,18,33};
		int element =25;
		int pos = 2;
		int[] arr1 = new int[arr.length+1];
		
		for (int i = 0 , j = 0; i < arr1.length; i++) {
			if(i==pos)
			{
				arr1[i]=element;
			}
			else
			{
				arr1[i]=arr[j];
				j++;
			}
		}
		 for (int num : arr1) {
	            System.out.print(num + " ");
	        }
		
   }
}