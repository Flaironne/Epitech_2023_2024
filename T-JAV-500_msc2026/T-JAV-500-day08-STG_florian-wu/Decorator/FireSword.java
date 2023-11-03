package Decorator;

public class FireSword extends StuffDecorator {
	
	
	public FireSword(Warrior w) {
		
		this.holder = w;
//		System.out.println("first "+holder.dmg);
//		holder.dmg += 3;
//		System.out.println("then "+holder.dmg);
		System.out.println("I can slice and burn like the wind and the flames.");
	}
	
	@Override
	public int getDmg() {
		return this.holder.getDmg()+3;
	}
}
