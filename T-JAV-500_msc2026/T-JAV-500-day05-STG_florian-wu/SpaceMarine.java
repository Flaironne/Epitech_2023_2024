public abstract class SpaceMarine extends Unit {
    protected Weapon weapon;
    protected boolean isEntered = false;

    public SpaceMarine(String name, int hp, int ap) {
        super(name, hp, ap);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public boolean getIsEntered() {
        return isEntered;
    }

    public void setIsEntered(boolean isEntered) {
        this.isEntered = isEntered;
    }

    public boolean equip(Weapon weapon) {
        if (weapon.isUsed) {
            return false;
        }
        else if (!super.isDead && !weapon.isUsed) {
            System.out.println(this.name+" has been equipped with a "+weapon.getName()+".");
            weapon.setIsUsed(true);
            this.weapon = weapon;
            return true;  
        }
        else {
            return false;
        }
    }

    public boolean attack(Fighter target) {
        if (this.getHp() < 0) {
            return false;
        }
        if (this.weapon==null) {
            System.out.println(getName() + ": Hey, this is crazy. I'm not going to fight this empty-handed.");
            return false;
        }
        if (getWeapon().isMelee() && !getInRangeBool()) {
            System.out.println(getName() + ": I'm too far away from " + target.getName() + ".");
            // moveCloseTo(target);
            return true;
        }
        if (getAp() >= getWeapon().getApcost()) {
            System.out.println(getName() + " attacks " + target.getName() + " with a " + getWeapon().getName() + ".");
            target.receiveDamage(getWeapon().getDamage());
            weapon.attack();
            setAp(getAp() - getWeapon().getApcost());
            return true;
        } else {
            return false;
        }
    }

    @Override
	public boolean moveCloseTo(Fighter enemy) {
		if(weapon.isMelee()) {
			return super.moveCloseTo(enemy);
		}
		else {
			return false;
		}
	}
    
    @Override
    public void recoverAP() {
        if(super.isDead) {
			return;
		}
		super.ap = (super.ap + 7 >= 50) ? 50 : super.ap + 9;
	}
    
}
