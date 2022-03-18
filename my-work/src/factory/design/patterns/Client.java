package factory.design.patterns;


public class Client {
	public static void main(String[] args) {
		NotificationFactory nF = new NotificationFactory();
		Notification n = nF.createNotification("Email");
		n.notifyUser();
		
	}
}
