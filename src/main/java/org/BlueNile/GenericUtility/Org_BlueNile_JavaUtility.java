package org.BlueNile.GenericUtility;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

public class Org_BlueNile_JavaUtility {

	public String toGetCurrentDateAndTime() {
		//Generates current date and time and stores it in string variable
		String time = LocalDateTime.now().toString();
		//replaces ':' with '_' because windows cannot directly take ':' in files
          String result = time.replace(":" , "_");
        //returns date and time
          return result;
	}
	/**
	 * This method is used to generate random data from the method
	 * @return
	 */
	public String toGetRamdomData() {
		 String random = UUID.randomUUID().toString();
		 String result = random.replaceAll("[^a-zA-Z]","");
		 return result ;
		 
	}
	/**
	 * This method is used to generate number in integer format
	 * @return
	 */
	public int  toGetRandomNumber(int n) {
		//Create object for random
		Random random = new Random();
		//Here we specify the arguments to give the range within what number to generate
		int number = random.nextInt(n);
		return number;

	}
	    
	}

