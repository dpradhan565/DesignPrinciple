package design.behavioural.mediator;

public interface User {

	public String getUserName();
	public void receiveMessage(User user,String msg);
	public void sendMesage(String msg);
	
}
