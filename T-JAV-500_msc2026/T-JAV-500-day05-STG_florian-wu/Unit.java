public abstract class Unit implements Fighter {
    protected String name;
    protected int hp;
    protected int ap;
    protected boolean isDead=false;
    protected Fighter inRange;
    protected boolean inRangeBool = false;

    protected Unit(String name, int hp, int ap) {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    public String getName() {
        return name;
    }

    public void setHp(int hp) {
        if (this.hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public int getHp() {
        return hp;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public int getAp() {
        return ap;
    }

    public void setInRange(Fighter inRange) {
        this.inRange = inRange;
    }

    public Fighter getInRange() {
        return inRange;
    }

    public void setInRangeBool(boolean inRangeBool) {
        this.inRangeBool = inRangeBool;
    }

    public boolean getInRangeBool() {
        return inRangeBool;
    }

    public void receiveDamage(int damage) {
        if(isDead){
            return;
        }
        if (getHp() - damage >= 0) {
            this.hp = this.hp - damage;
        } else {
            this.hp = 0;
            isDead = true;
        }
    }

    public boolean moveCloseTo(Fighter target) {
        if (isDead) {
            return false;
        }
        if (inRange != target && target != this) {
            inRange = target;
            System.out.println(getName() + " is moving closer to " + target.getName() + ".");
            setInRangeBool(true);
            return true;
        } else {
            setInRangeBool(false);
            return false;
        }
    }

    public void recoverAP() {
        if(isDead){
            return;
        }
        setAp(getAp() + 7);
        if (getAp() > 50) {
            setAp(50);
        }
    }
}
