public class Gecko {
    
    private String name;
    private int age;
    private int energy = 100;
    
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
    
    public void eat(String food) {
        food = food.toLowerCase();
        
        switch(food){
        
        case "meat":
            System.out.println("Yummy!");
            setEnergy(this.energy + 10);
            break;
        case "vegetable":
            System.out.println("Erk!");
            setEnergy(this.energy -10);
            break;
        default :
            System.out.println("I can't eat this!");
            break;
        }
    }
    
    public int getEnergy() {
        return energy;
    }
    
    public void setEnergy(int energy) {
        if(energy<100 && energy>0) {
                this.energy=energy;
        }
        else if(energy>=100){
            this.energy = 100;
        }
        else if(energy<=0) {
            this.energy = 0;
        }
    }
    
    public void work() {
        if(this.energy>=25) {
            this.energy-=9;
            System.out.println("Im' working T.T");
        }
        else if(this.energy<=24){
            this.energy += 50;
            System.out.println("Heyyy I'm too sleepy, better take a nap!");
        }
    }
    
    public void run() {
        if(this.energy>=10) {
            this.energy = 0;
            System.out.println("LET'S RUN AWAY!!!");
        }
        else {
            System.out.println("...");
        }
    }
    
    public void drink(Gecko gecko1, Gecko gecko2) {
        if (gecko1.getEnergy()>30 && gecko2.getEnergy()>30) {
            System.out.println("I'm going to drink with "+gecko2.name+"!");
            System.out.println("I'm going to drink with "+gecko1.name+"!");
            gecko1.setEnergy(-30);
            gecko2.setEnergy(-30);
        }
        else if (gecko1.getEnergy()>30 && gecko2.getEnergy()<30) {
            System.out.println("Sorry "+gecko1.getName() +", I'm too tired to go out tonight.");
            System.out.println("Oh! That's too bad, another time then!");
        }
        else if (gecko1.getEnergy()<30 && gecko2.getEnergy()>30) {
            System.out.println("Sorry "+gecko2.getName()+", I'm too tired to go out tonight.");
            System.out.println("Oh! That's too bad, another time then!");
        }
        else {
            System.out.println("Not today!");
            System.out.println("Not today!");
        }
        
    }
    
    public void fraternize(Object animal) {
            if(animal instanceof Gecko){
                ((Gecko) animal).drink(this,(Gecko) animal);
            }
            else if (animal instanceof Snake) {
                this.run();
            }
    }
}