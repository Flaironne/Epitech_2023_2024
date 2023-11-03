public class Gecko {
	
	private String name;
	private int age;
	
	public Gecko(String name, int age) {
		this.age = age;
		this.name = name;
		System.out.println("Hello "+this.name+"!");
	}
	
	public Gecko(String name) {
		this.name = name;
		System.out.println("Hello "+this.name+"!");
	}
	
	public Gecko() {
		this.name = "Unknown";
		System.out.println("Hello!");
	}
	
	public String getName() {
	    return name;
	}
	
	public void setAge(int age) {
	    this.age=age;
	}
	
	public int getAge() {
	    return age;
	}
	
	public void status() {
		
		switch(age) {
		case 0:
			System.out.println("Unborn Gecko");
			break;
		case 1: case 2:
			System.out.println("Baby Gecko");
			break;
		case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: 
			System.out.println("Adult Gecko");
			break;
		case 11: case 12: case 13:
			System.out.println("Old Gecko");
			break;
		default:
			System.out.println("Impossible Gecko");
			break;
		}
	}
	
	public void hello(String string) {
		System.out.println("Hello "+string+", I'm "+this.name+"!");
	}
	
	public void hello(int times) {
		for(int i=0;i<times;i++) {
			System.out.println("Hello, I'm "+this.name+"!");
		}
	}	
}
