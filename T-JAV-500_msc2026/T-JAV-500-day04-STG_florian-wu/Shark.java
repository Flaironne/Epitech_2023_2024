public class Shark extends Animal{
	
	private boolean frenzy=false;
	
	public Shark(String name){
		super(name,0,Type.FISH);
		System.out.println("A KILLER IS BORN!");
	}
	
	public void smellBlood(boolean frenzy) {
		this.frenzy = frenzy;
	}
	
	public void status() {
		if(frenzy) {
			System.out.println(super.getName()+" is smelling blood and wants to kill.");
		}
		else {
			System.out.println(super.getName()+" is swimming peacefully.");
		}
	}
	
	public boolean canEat(Animal animal) {
		return animal!=this;
	}
	
	public void eat(Animal animal) {
		if(canEat(animal)) {
			System.out.println(super.getName()+" ate a "+animal.getType()+" named "+ animal.getName()+".");
			this.frenzy = !this.frenzy;
		}
		else{
			System.out.println(super.getName()+": It's not worth my time.");
		}
	}
}