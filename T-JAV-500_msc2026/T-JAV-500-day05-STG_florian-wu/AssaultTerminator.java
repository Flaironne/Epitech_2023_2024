public class AssaultTerminator extends SpaceMarine{
	
protected PowerFist atWeapon = new PowerFist();
	
	protected AssaultTerminator(String name) {
		super(name, 150, 30);	
		System.out.println(name+" has teleported from space.");
		this.equip(atWeapon);
	}
	
	@Override
	public void receiveDamage(int nb) {
		if(nb <=3) {
			super.receiveDamage(1);
		}
		else {
			super.receiveDamage(nb-3);
		}
		
	}
}
