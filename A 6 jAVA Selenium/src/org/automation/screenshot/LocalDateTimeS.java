package org.automation.screenshot;

import java.time.LocalDateTime;

public class LocalDateTimeS {
	public static void main(String[] args) {
	
		LocalDateTime ldt = LocalDateTime.now();
		String timeStamp = ldt.toString().replace(':', '-');
		System.out.println(timeStamp);
		
	}

}
