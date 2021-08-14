package knightingale.practice;

@SuppressWarnings("unused")
public class LinksAndRelations3 {
	public static void main(String[] args) {
		Object button = new Switch();
		Object edison = new Bulb();
		Object ac = new Ac();
		// Switch acSwitch=new Switch();

//			MoleculeFramework.setInterface(OnOff.class);
//			button = MoleculeFramework.getObject(new Object[] { button, ac });// subjection

		OnOff onoff = (OnOff) button;
		onoff.on();
		onoff.off();

	}
}

class Switch {

}

interface OnOff {
	public void on();

	public void off();
}

class Bulb implements OnOff {
	@Override
	public void off() {
		System.out.println("the bulb is off...");
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("the bulb is switched on...");
	}
}

class Ac implements OnOff {
	@Override
	public void off() {
		System.out.println("ac is switched off...");
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("ac is switched on...");
	}
}
