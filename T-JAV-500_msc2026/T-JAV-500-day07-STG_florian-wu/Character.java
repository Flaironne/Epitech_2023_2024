public abstract class Character implements Movable,Comparable<Character>{
	protected String name;
	protected int life;
	protected int agility;
	protected int strength;
	protected int wit;
	protected String RPGClass;
	protected int capacity=0;
	
	protected Character(String name, String RPGClass){
		this.name = name;
		this.RPGClass = RPGClass;
	}
	
	protected Character(String name, String RPGClass, int capacity){
		this.name = name;
		this.RPGClass = RPGClass;
		this.capacity = capacity;
	}
	
	public void attack(String weapon) {
		System.out.println(this.name+": Rrrrrrrrr....");
	}
	
    public String getName(){
        return name;
    }

    public int getLife(){
        return life;
    }

    public int getAgility(){
        return agility;
    }
    
    public int getStrength(){
        return strength;
    }

    public int getWit(){
        return wit;
    }

    public String getRPGClass(){
        return RPGClass;
    }
    
	public void moveRight() {
		System.out.println(this.name+": moves right");
		
	}

	public void moveLeft() {
		System.out.println(this.name+": moves left");
		
	}

	public void moveForward() {
		System.out.println(this.name+": moves forward");		
	}

	public void moveBack() {
		System.out.println(this.name+": moves back");		
	}
	
    public final void unsheathe() {
		System.out.println(this.name+": unsheathes his weapon.");		
	}
    
    public int compareTo(Character theChar) {
    	
    	if(theChar.getClass() ==  this.getClass()) {
    		if(theChar.capacity == this.capacity) {
    			return 0;
    		}
    		else {
    			return this.capacity-theChar.capacity;
    		}
    	}
    	else if(theChar instanceof Mage && this instanceof Warrior) {
    		if(this.capacity%theChar.capacity==0) {
    			return 1;
    		}
    		else {
    			return -1;
    		}
    	}
    	else if(theChar instanceof Warrior && this instanceof Mage) {
    		if(theChar.capacity%this.capacity==0) {
    			return -1;
    		}
    		else {
    			return 1;
    		}
    	}
    	else {
    		return 0;
    	}
    }
}
