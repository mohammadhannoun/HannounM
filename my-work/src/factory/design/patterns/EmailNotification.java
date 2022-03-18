package factory.design.patterns;

public class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Email SENT SUCCESSFULLY");
	}
	
}
