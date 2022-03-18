package factory.design.patterns;

public class SMSNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("SMS SENT SUCCESSFULLY");
	}

}
