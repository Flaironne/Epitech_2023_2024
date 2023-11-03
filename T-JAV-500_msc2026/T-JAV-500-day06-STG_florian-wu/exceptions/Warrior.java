public class Warrior extends Character {

	public Warrior(String name) {
		super(name, "Warrior");
		super.life = 100;
		super.strength = 10;
		super.agility = 8;
		super.wit = 3;
		System.out.println(super.name+": My name will go down in history!");
	}

	@Override
	public void attack(String weapon) throws WeaponException{
		boolean condition = weapon.equals("hammer") || weapon.equals("sword");
		if (weapon == "") {
			throw new WeaponException(super.name+": I refuse to fight with my bare hands.");
		}
		else if (!condition) {
            throw new WeaponException(super.name+": A "+weapon+"?? What should I do with this?!");
        }
		else{
			super.attack(weapon);
			System.out.println(super.name+": I'll crush you with my "+weapon+"!");
		}
	}

	@Override
	public void moveRight() {
		System.out.println(super.name+": moves right like a bad boy.");
	}

	@Override
	public void moveLeft() {
		System.out.println(super.name+": moves left like a bad boy.");
		
	}

	@Override
	public void moveForward() {
		System.out.println(super.name+": moves forward like a bad boy.");
	}

	@Override
	public void moveBack() {
		System.out.println(super.name+": moves back like a bad boy.");
	}
}

