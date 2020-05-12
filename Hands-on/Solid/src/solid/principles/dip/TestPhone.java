package solid.principles.dip;

public class TestPhone {

	public static void main(String[] args) {
		ProcessPhoneRepair ppr=new ProcessPhoneRepair();
		ppr.repairSteps(new SamsungNote());
	}

}
