public abstract class Monster extends Unit {

    protected int damage = 0;
    protected int apcost = 0;
    protected boolean IsEntered = false;

    public Monster(String name, int hp, int ap) {
        super(name, hp, ap);
    }

    public int getDamage() {
        return damage;
    }

    public int getApcost() {
        return apcost;
    }

    public void setApcost(int apcost){
        this.apcost= apcost;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    public boolean getIsEntered() {
        return IsEntered;
    }

    public void setIsEntered(boolean isEntered) {
        IsEntered = isEntered;
    }

    public boolean equip(Weapon weapon) {
        System.out.println("Monsters are proud and fight with their own bodies.");
        return false;
    }

    public boolean attack(Fighter target) {
        if (target.getHp() > 0 && this.getHp() > 0) {
            if (!getInRangeBool()) {
                System.out.println(getName() + ": I'm too far away from " + target.getName() + ".");
                return true;
            }
            if (getAp() >= getApcost()) {
                System.out.println(getName() + " attacks " + target.getName() + ".");
                target.receiveDamage(getDamage());
                setAp(getAp() - getApcost());
                return true;
            } 
        }
        return false;
    }
}
