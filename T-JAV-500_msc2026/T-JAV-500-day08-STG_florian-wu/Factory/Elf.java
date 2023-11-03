package Factory;

import java.util.ArrayList;
import java.util.List;

public class Elf {
	
	private Toy toy;
	private List<GiftPaper> papers = new ArrayList<>();
	private Factory factory;
	
	public Elf(Factory factory) {
		this.factory = factory;
	}
	
	public boolean pickToy(String theToy) {
		
		if(toy!=null) {
			System.out.println("Minute please?! I'm not that fast.");
			return false;
		}
		
		try {
            toy = factory.create(theToy);
            System.out.println("What a nice one! I would have liked to keep it...");
            return true;
        } catch (NoSuchToyException e) {
            System.out.println("I didn't find any " + theToy + ".");
            return false;
        }
		
	}
	
	public boolean pickPapers(int nb) {

		if(nb>=1){
			papers.addAll(factory.getPapers(nb));
		}
		
		return true;
	}
	
	public GiftPaper pack() {
		if(papers== null || papers.size()==0) {
			System.out.println("Wait... I can't pack it with my shirt.");
			return null;
		}
		else if(toy==null) {
			System.out.println("I don't have any toy, but hey at least it's paper!");
			GiftPaper toPack = papers.get(0);
			papers.remove(0);
			return toPack;
		}
		else {
			papers.get(0).wrap(toy);
			toy = null;
			System.out.println("And another kid will be happy!");
			GiftPaper toPack = papers.get(0);
			papers.remove(0);
			return toPack;
		}
    }
}