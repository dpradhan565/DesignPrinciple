package practice.design.behavioural.mediator;

public class TestMediator {

	public static void main(String[] args) {
		
		User dhaneshwar=new User("Dhaneshwar");
		User ajay=new User("Ajay");
		dhaneshwar.sendMessage("Hi Ajay");
		ajay.sendMessage("Hi Dhaneshwar");
	}

}
