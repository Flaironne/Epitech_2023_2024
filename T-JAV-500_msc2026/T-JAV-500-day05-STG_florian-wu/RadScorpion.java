public class RadScorpion extends Monster{
    protected static int id = 1;
    public RadScorpion() {
        super("RadScorpion #"+id, 80, 50);
        id++;
        System.out.println(getName()+": Crrr!");
        setApcost(8);
        setDamage(25);
    }
    
    @Override
    public boolean attack(Fighter target) {    
        if (target instanceof AssaultTerminator) {
            boolean value = super.attack(target);
            return value;
        }
        else{
            boolean value = super.attack(target);
            if(value){
                target.receiveDamage(getDamage());
            }
            return value;
        }
    }
    
}

