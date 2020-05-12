package design.behavioural.mediator;

public class TestMediator {

	public static void main(String args[]) {
		 
		ChatMediator mediator=new ChatMediatorClass();
		
		User tom=new BasicUser("Tom");
		User robert=new PremiumUser("Robert");
		mediator.addUser(tom);
		mediator.addUser(robert);
		tom.sendMesage("Hey Robert");
		robert.sendMesage("Hey Tom");
		
	}
}
