public class GreatWhite extends Shark{

	public GreatWhite(String name) {
		super(name);
	}
	
	@Override
	public boolean canEat(Animal animal) {
		if(animal instanceof Canary) {
			return false;
		}
		else{
			return super.canEat(animal);
		}
	}
	
	@Override
	public void eat(Animal animal) {
		if(canEat(animal)) {
			super.eat(animal);
			if(animal instanceof Shark){
				System.out.println(super.getName()+": The best meal one could wish for.");
			}
		}
		else{
			System.out.println(super.getName()+": Next time you try to give me that to eat, I'll eat you instead.");	
		}
	}
}
