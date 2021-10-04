/******************************************************************************
 * 	       	          	   	Chris Ayala                     			      *
 * 								Tyy195	    								  *
 * 								Lab 3										  *
 * 				Contains 2 versions. One of them is commented out.			  *
 * 	I left comments which lines would need to be changed to change versions.  *
 ******************************************************************************/
package application.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Avenger extends Person{

		private String aliasName = "";
		private String currentLoc = "";
		private ArrayList<Avenger>avengerList = new ArrayList<Avenger>();
		
		//constructor method that takes just a name from the person class
		//used when instantiating an object in the MainController
		public Avenger(String realName) {
			super(realName);
		}
		
		//constructor method used to make each avenger object
		public Avenger(String realName, String aliasName, String currentLoc) {
			super(realName);
			this.aliasName = aliasName;
			this.currentLoc = currentLoc;
		}

		//eclipse generated getter method for aliasName
		public String getAliasName() {
			return aliasName;
		}

		//eclipse generated setter method for aliasName
		public void setAliasName(String aliasName) {
			this.aliasName = aliasName;
		}

		//eclipse generated getter method for currentLoc
		public String getCurrentLoc() {
			return currentLoc;
		}

		//eclipse generated setter method for currentLoc
		public void setCurrentLoc(String currentLoc) {
			this.currentLoc = currentLoc;
		}

		//toString method used to output avenger information
		@Override
		public String toString() {
			return realName + "\n" + aliasName + "\nCurrently in " + currentLoc;
		}

		//method used to add avengers to an array list
		public void addAvenger(Avenger a) {
			avengerList.add(a);
		}
		
		//loadAvengers loads in avenger data from a .csv file and returns an ArrayList full of avengers
		public ArrayList<Avenger> loadAvengers(String fileName) throws IOException {
			
			//the file is loaded in from the data directory that it is stored in
			//a buffered reader is then used to hold each line of the csv file
			File f = new File("data\\"+fileName);
			FileReader reader = new FileReader(f);
			BufferedReader readBuffer = new BufferedReader(reader);

			String rowString;
			
			//while loop continues to iterate while there's still data to be pulled from the file
			//each iteration of the while loop, rowString holds a new line of data from the file
			while ((rowString = readBuffer.readLine()) != null ) {

				//a string array is then used to hold each field of information and remove the commas separating the values
				String [] wordSplit = rowString.split(",");
				
				//an avenger object is instantiated with the proper data
				Avenger a = new Avenger(wordSplit[0], wordSplit[1], wordSplit[7]);
				
				//the new avenger object is then added to an array list
				addAvenger(a);
				}
			
				readBuffer.close();
				
				//this returns a list of Avenger objects. The list is then used to choose which avenger is output.
				return this.avengerList;
		}	
		
		
		//REMOVE MULTI-LINE COMMENT FROM LINES 97-125 AND COMMENT OUT loadAvenger METHOD ABOVE TO SWITCH TO ALTERNATE VERSION
		
		//loadAvengers loads avenger data from a .csv file but uses the avengerName parameter 
		//to search the file to return the specific avenger
		/*public Avenger loadAvengers(String fileName, String avengerName) throws IOException {
			
			//the file is loaded in from the data directory that it is stored in
			//a buffered reader is then used to hold each line of the csv file
			File f = new File("data\\"+fileName);
			FileReader reader = new FileReader(f);
			BufferedReader readBuffer = new BufferedReader(reader);

			String rowString;
			
			//while loop continues to iterate while there's still data to be pulled from the file
			//each iteration of the while loop, rowString holds a new line of data from the file
			while ((rowString = readBuffer.readLine()) != null ) {

				//a string array is then used to hold each field of information and remove the commas separating the values
				String [] wordSplit = rowString.split(",");
				
				//if the name from the .csv file matches the name passed in the parameters
				//then instantiate an avenger object with that csv info and return it
				if (wordSplit[1].equalsIgnoreCase(avengerName)) {
					Avenger a = new Avenger(wordSplit[0], wordSplit[1], wordSplit[7]);
					readBuffer.close();
					return a;
				}
			}
			readBuffer.close();
			return null;
		}
		*/	
}
