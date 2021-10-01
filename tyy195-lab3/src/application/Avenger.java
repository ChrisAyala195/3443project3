package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Avenger extends Person{

		String aliasName = "";
		String currentLoc = "";
		ArrayList<Avenger>avengerList = new ArrayList<Avenger>();
		
		public Avenger(String realName) {
			super(realName);
		}
		
		public Avenger(String realName, String aliasName, String currentLoc) {
			super(realName);
			this.aliasName = aliasName;
			this.currentLoc = currentLoc;
		}

		public String getAliasName() {
			return aliasName;
		}

		public void setAliasName(String aliasName) {
			this.aliasName = aliasName;
		}

		public String getCurrentLoc() {
			return currentLoc;
		}

		public void setCurrentLoc(String currentLoc) {
			this.currentLoc = currentLoc;
		}

		@Override
		public String toString() {
			return "Alias: " + aliasName + "\nCurrent Location: " + currentLoc + "\nReal name: " + realName;
		}

		public void addAvenger(Avenger a) {
			avengerList.add(a);
		}
		
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

				Avenger a = new Avenger(wordSplit[0], wordSplit[1], wordSplit[7]);
				
				//the new avenger object is then added to an array list
				addAvenger(a);
				}
			
				readBuffer.close();
				
				//this returns a list of Avenger objects. The list is then used to choose which avenger is output.
				return this.avengerList;
			//}
		}	
}
