package factory.design.patterns;

public class PushNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Notification is Pushed");
	}

}
