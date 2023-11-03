public class BlueShark extends Shark{

	
	public BlueShark(String name) {
		super(name);
	}
	
	@Override
	public boolean canEat(Animal animal) {
		if(animal.getType() == "fish" && animal != this) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
