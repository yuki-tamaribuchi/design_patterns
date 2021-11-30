//https://www.geeksforgeeks.org/factory-method-design-pattern-in-java/

package factory_method.java;

interface Notification{
	void notifyUser();
}

class SMSNotification implements Notification{
	public void notifyUser(){
		System.out.println("Sending an SMS notification");
	}
}

class EmailNotification implements Notification{
	public void notifyUser(){
		System.out.println("Sending an e-mail notification");
	}
}

class PushNotification implements Notification{
	public void notifyUser(){
		System.out.println("Sending a push notification");
	}
}

class NotificationFactory{
	public static Notification createNotification(String channel){
		if(channel == null || channel.isEmpty()) return null;
		if("SMS".equals(channel)){
			return new SMSNotification();
		}else if("EMAIL".equals(channel)){
			return new EmailNotification();
		}else if("PUSH".equals(channel)){
			return new PushNotification();
		}
		return null;
	}
}