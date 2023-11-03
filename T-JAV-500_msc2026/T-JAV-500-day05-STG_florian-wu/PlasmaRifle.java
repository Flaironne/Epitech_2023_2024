public class PlasmaRifle extends Weapon{
	
	private String output = "PIOU";
	
	protected PlasmaRifle() {
		super("Plasma Rifle", 5, 21, false);
	}

	@Override
	public void attack() {
		System.out.println(output);			
	}
}