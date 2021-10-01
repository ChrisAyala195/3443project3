package application;

public abstract class Person {
	String realName = "";

	public Person(String realName) {
		this.realName = realName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	@Override
	public String toString() {
		return "Person [realName=" + realName + "]";
	}
	
}
