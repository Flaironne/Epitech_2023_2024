public class Mage extends Character {
	
	public Mage(String name) {
		super(name, "Mage");
		super.life = 70;
		super.strength = 3;
		super.agility = 10;
		super.wit = 10;
		
		System.out.println(super.name+": May the gods be with me.");
	}
	
	public Mage(String name, int magnetism) {
		super(name, "Mage",magnetism);
		super.life = 70;
		super.strength = 3;
		super.agility = 10;
		super.wit = 10;
		super.capacity = magnetism;
		
		System.out.println(super.name+": May the gods be with me.");
	}
	

	@Override
	public void attack(String weapon) {
		if(weapon.equals("magic") || weapon.equals("wand")) {
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
