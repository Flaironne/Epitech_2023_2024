public abstract class Character implements Movable{
	protected String name;
	protected int life=50;
	protected int agility=2;
	protected int strength=2;
	protected int wit=2;
	protected final String RPGClass;
	
	protected Character(String name, String RPGClass){
		this.name = name;
		this.RPGClass = RPGClass;
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
}
