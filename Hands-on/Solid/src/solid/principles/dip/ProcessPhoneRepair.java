package solid.principles.dip;

public class ProcessPhoneRepair {
	public void repairSteps(Phone phone) {
		System.out.println(phone.getPhonePart1()+" is phone");
		System.out.println(phone.getPart1Cost()+" is cost");
	}

}
