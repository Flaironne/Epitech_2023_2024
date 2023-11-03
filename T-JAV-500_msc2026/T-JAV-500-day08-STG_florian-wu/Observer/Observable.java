package Observer;

public interface Observable {
	public void addObserver(Observer o);
	public boolean notifyObservers();
}
