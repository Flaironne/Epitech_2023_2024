package Decorator;

public abstract class Warrior {
	
	protected int hp;
	protected int dmg;
	
//	public Warrior(int hp,int dmg) {
//		this.hp=hp;
//		this.dmg=dmg;
// 	}
	
	public int getHp(){
		return this.hp;
	}
	
	public int getDmg(){
		return this.dmg;
	}
	
	
}
