package solid.principles;

public class OrderPhoneImpl implements OrderPhone {

	@Override
	public void processOrder(String modelName) {
		System.out.println("Phone of model "+modelName+" placed");

	}

}
