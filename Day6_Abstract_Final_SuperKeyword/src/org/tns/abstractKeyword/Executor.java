package org.tns.abstractKeyword;

public class Executor {

	public static void main(String[] args) {
		user user1=new subscription("Ruins", 22);
		user user2=new subscription("Rado", 0);
		
		user1.isSubscription();
		user2.isSubscription();
		user1.changeName("Royal");
		System.out.println(user1.toString());
		user1.isSubscription();

	}

}
