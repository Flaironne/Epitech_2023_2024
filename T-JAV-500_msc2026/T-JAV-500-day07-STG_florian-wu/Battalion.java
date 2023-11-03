import java.util.ArrayList;
import java.util.List;

public class Battalion {

	private List<Character> characters=new ArrayList<Character>();
	
	public void add(List<? extends Character> list) {
		
		
		characters.addAll(list);
	}
	
	public void display() {
		for(Character mychar : characters) {
			System.out.println(mychar.getName());
		}
	}
	
	public boolean fight() {
		if(characters.isEmpty() || characters.size()==1) {
			return false;
		}
		else {
			if(characters.get(0).compareTo(characters.get(1))>0) {
				characters.remove(1);
			}
			else if(characters.get(0).compareTo(characters.get(1))<0){
				characters.remove(0);
			}
			else {
				characters.remove(0);
				characters.remove(1);
			}
		}
		return true;
	}
}
