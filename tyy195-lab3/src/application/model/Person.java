/******************************************************************************
 * 	       	          	   	Chris Ayala                     			      *
 * 								Tyy195	    								  *
 * 								Lab 3										  *
 * 				Contains 2 versions. One of them is commented out.			  *
 * 	I left comments which lines would need to be changed to change versions.  *
 ******************************************************************************/
package application.model;

//person class will be used by Avenger class to hold the real name of each avenger
public abstract class Person {
	String realName = "";

	//Constructor for person class 
	public Person(String realName) {
		this.realName = realName;
	}

	//eclipse generated getter method for realName
	public String getRealName() {
		return realName;
	}

	//eclipse generated setter method used for realName
	public void setRealName(String realName) {
		this.realName = realName;
	}

	//eclipse generated toString method used to convert person class object to string representation
	@Override
	public String toString() {
		return "Person [realName=" + realName + "]";
	}
	
}
