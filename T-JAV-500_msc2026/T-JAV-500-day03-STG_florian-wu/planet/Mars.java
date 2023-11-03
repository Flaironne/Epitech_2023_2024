package planet;

public class Mars {
	
	private static int counter = 0;
	private final int id;
	private String landingSite;
	
	public Mars(String landingSite){
		this.id = counter++;
		this.landingSite = landingSite;
	}
	
	public int getId() {
	    return id;  
	}
	
	public String getLandingSite() {
	    return landingSite;  
	}
	
}