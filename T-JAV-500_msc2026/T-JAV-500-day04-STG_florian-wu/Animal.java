public class Animal {
	
	protected enum Type {
		MAMMAL,
		FISH,
		BIRD,	
	}
	
	private String name;
	private int legs;
	protected Type type;
	private static int numberOfAnimals;
	private static int numberOfMammals;
	private static int numberOfFish;
	private static int numberOfBirds;
	
	public String getName() {return name;}
	public int getLegs() {return legs;}
	public String getType() {
	        String typeString = "";
	        switch (type) {
	            case MAMMAL:
	                typeString = "mammal";
	                break;
	            case FISH:
	                typeString = "fish";
	                break;
	            case BIRD:
	                typeString = "bird";
	                break;
	        }
	        return typeString;
	    }
	
	protected Animal(String name, int legs, Type type){
		this.name = name;
		this.legs = legs;
		this.type = type;
		numberOfAnimals++;
		addNumberToType(type);
		System.out.println("My name is "+this.name+" and I am a "+getType()+"!");
	}
	
	public static int getNumberOfAnimals() {
		if(numberOfAnimals <= 1) {
			System.out.println("There is currently "+numberOfAnimals+" animal in our world.");
		}
		else {
			System.out.println("There are currently "+numberOfAnimals+" animals in our world.");
		}
		return numberOfAnimals;
	}
	
	
	private void addNumberToType(Type type) {
        switch (type) {
            case MAMMAL:
            	numberOfMammals++;
                break;
            case FISH:
            	numberOfFish++;
                break;
            case BIRD:
            	numberOfBirds++;
                break;
        }
	}
	
	public static int getNumberOfMammals(){
		if(numberOfMammals == 1) {
			System.out.println("There is currently "+numberOfMammals+" mammal in our world.");
		}
		else {
			System.out.println("There are currently "+numberOfMammals+" mammals in our world.");
		}
		return numberOfMammals;
	}
	
	public static int getNumberOfFish() {
        if (numberOfFish == 1) {
            System.out.println("There is currently " + numberOfFish + " fish in our world.");
        } else {
            System.out.println("There are currently " + numberOfFish + " fish in our world.");
        }
        return numberOfFish;
    }
	
	public static int getNumberOfBirds() {
        if (numberOfBirds == 1) {
            System.out.println("There is currently " + numberOfBirds + " bird in our world.");
        } else {
            System.out.println("There are currently " + numberOfBirds + " birds in our world.");
        }
        return numberOfBirds;
    }
	
}
