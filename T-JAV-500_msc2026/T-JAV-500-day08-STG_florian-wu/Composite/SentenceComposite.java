package Composite;

import java.util.ArrayList;
import java.util.List;

public class SentenceComposite implements Sentence{

	private List<Sentence> childSentence;
	
	public SentenceComposite() {
		childSentence = new ArrayList<>();
	}
	@Override
	public void print() {
		for(Sentence w : childSentence) {
			w.print();
		}
	}
	
	public void add(Sentence w) {
		childSentence.add(w);
	}
	
	public void remove(Sentence w) {
		childSentence.remove(w);
	}
}
