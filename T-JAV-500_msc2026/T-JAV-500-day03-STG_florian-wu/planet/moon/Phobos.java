package planet.moon;

import planet.Mars;

public class Phobos {
	private planet.Mars mars;
	private String landingSite;
	
	public Phobos(Mars name,String landingSite) {
		
		if(name==null) {
			System.out.println("No planet given.");
		}
		else {
			this.mars = name;
			this.landingSite =  landingSite;
			System.out.println("Phobos placed in orbit.");
		}
	}

	public planet.Mars getMars() {
		return mars;
	}
	
	public String getLandingSite() {
	    return landingSite;  
	}
	
}
