package knightingale.practice.interfaces.firstdemo;

public class AlopathyMedicalCollege implements Doctor, Nurse {
	@Override
	public void doCure() {
		System.out.println("alopathy way of curing................");
	}

	@Override
	public void doCare() {
		System.out.println("nursing as per alopathy care..");
	}
}
