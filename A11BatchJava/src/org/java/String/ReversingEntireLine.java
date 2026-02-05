package org.java.String;

public class ReversingEntireLine {
	public static void main(String[] args) {
		String s = "Hemant is Good Boy";
		String[] words=s.split(" ");
		String rev = "";
		
		for (int i = words.length-1;i >=0; i--) {
		       rev = rev+words[i]+" ";
		    }
		System.out.println(rev.trim());
	}

}
