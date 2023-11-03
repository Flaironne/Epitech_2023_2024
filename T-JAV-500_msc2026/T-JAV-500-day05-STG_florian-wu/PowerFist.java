public class PowerFist extends Weapon{

	private String output = "SBAM";
	
	protected PowerFist() {
		super("Power Fist", 8, 50, true);
	}

	@Override
	public void attack() {
		System.out.println(output);		
	}
}
