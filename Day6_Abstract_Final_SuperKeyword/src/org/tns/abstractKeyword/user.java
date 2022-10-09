package org.tns.abstractKeyword;

public abstract class user {
	private String name;
	
	public user(String name) {
		super();
		this.name=name;
	}
	public abstract void isSubscription();
	
	@Override
	public String toString() {
		return "user[Username: "+name+" changed]";
	}
	public void changeName(String newName) {
		name=newName;
	}
	public String getName() {
		return name;
	}
	
}
