package knightingale.practice;

@SuppressWarnings("unused")
public class LinksAndRelations {
	public static void main(String[] args) throws Exception {
		Object sherif = new Human1();
		Object shoiab = new Human1();

		Family sherifFamily = new Family();
//		MoleculeFramework.setInterface(Father.class);
//		sherif=MoleculeFramework.getObject(new Object[]{sherif,sherifFamily});//subjection

		if (sherif instanceof Father) {
			System.out.println("yes sheriff is father....");
		} else {
			System.out.println("not a father....");
		}

		Father father = (Father) sherif;
		father.doCare();

//		MoleculeFramework.setInterface(Child.class);
//		shoiab=MoleculeFramework.getObject(new Object[]{shoiab,sherifFamily});//subjection
		Child child = (Child) shoiab;
		child.doLove();
	}
}

class Human1 {

}

interface Father {
	public void doCare();
}

interface Child {
	public void doLove();
}

class Family implements Father, Child {
	@Override
	public void doCare() {
		System.out.println("family father care.............");
	}

	@Override
	public void doLove() {
		// TODO Auto-generated method stub
		System.out.println("family child love..............");
	}
}
