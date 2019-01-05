package com.zoylo.admin.doctorcreation;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class DoctorCreateUtils {

	public int year;
	public int count;
	public String mobile;
	
	public int randomNumber(int start, int end) {
		
		count = ThreadLocalRandom.current().nextInt(start, end + 1);
		return count;
	}
	
	public String getRandomMobileNumber()
	{
		Random rand = new Random();
		
		 String number_1 = "9";
		 String four_number = String.format("%04d",rand.nextInt(10000));
		 String five_number = String.format("%05d", rand.nextInt(1000000));
		 mobile = number_1 + four_number + five_number;
		 return mobile;
	}
	
	public String getRandomString(int length)
	{
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(length);
	    
	    for (int i = 0; i < length; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	   
	    return buffer.toString();
		
	}
	
	public String getRandomMail()
	{
		return getRandomString(5) + "@" + getRandomString(4) + ".com";
	}
}
