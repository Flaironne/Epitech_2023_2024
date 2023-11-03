package Observer;

import java.util.ArrayList;
import java.util.List;

public class Order implements Observable{
	
	private String position;
	private String destination;
	private int timeBeforeArrival;
	private List<Observer> observers = new ArrayList<>();
	
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public boolean notifyObservers() {
		if (observers.isEmpty()) {
            return false;
        }
        for (Observer observer : observers) {
            observer.update(this);
        }
        return true;
	}

	public String getPosition() {
		return position;
	}

	public String getDestination() {
		return destination;
	}
	
	public int getTimeBeforeArrival() {
		return timeBeforeArrival;
	}
	
	public void setData(String position,String destination,int timeBeforeArrival) {
		this.position = position;
		this.destination = destination;
		this.timeBeforeArrival = timeBeforeArrival;
		notifyObservers();
	}

	
}
