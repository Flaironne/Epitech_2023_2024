public class Mage extends Character {

	public Mage(String name) {
		super(name, "Mage");
		super.life = 70;
		super.strength = 3;
		super.agility = 10;
		super.wit = 10;
		
		System.out.println(super.name+": May the gods be with me.");
	}
	
	@Override
	public void attack(String weapon) throws WeaponException {
		boolean condition = weapon.equals("magic") || weapon.equals("wand");
		if (weapon == "") {
			throw new WeaponException(super.name+": I refuse to fight with my bare hands.");
		}
		else if (!condition) {
            throw new WeaponException(super.name+": I don't need this stupid "+weapon+"! Don't misjudge my powers!");
        }
		else{
			super.attack(weapon);
			System.out.println(super.name+": Feel the power of my "+weapon+"!");
		}
	}
	
	@Override
	public void moveRight() {
		System.out.println(super.name+": moves right furtively.");
	}

	@Override
	public void moveLeft() {
		System.out.println(super.name+": moves left furtively.");
		
	}

	@Override
	public void moveForward() {
		System.out.println(super.name+": moves forward furtively.");
	}

	@Override
	public void moveBack() {
		System.out.println(super.name+": moves back furtively.");
	}
}