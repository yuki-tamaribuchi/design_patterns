package factory_method.java;

public class MainDriver {

	public static void main(String[] args){
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = notificationFactory.createNotification("SMS");
		notification.notifyUser();
	}
	
}
