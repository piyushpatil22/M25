package org.tns.abstractKeyword;

public class subscription extends user{
	private int sub_id;
	
	public subscription(String name, int sub_ID) {
		super(name);
		sub_id=sub_ID;
	}
	@Override
	public void isSubscription() {
		if(sub_id==0) {
			System.out.println("Subscription of user "+getName()+ " is Expired");
		}
		else {
			System.out.println("Subscription of user "+getName()+" is Active");
		}
	}
}
