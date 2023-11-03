public class TacticalMarine extends SpaceMarine {
    protected PlasmaRifle tmWeapon = new PlasmaRifle();
    public TacticalMarine(String name) {
        super(name,100,20);
        System.out.println(getName()+" on duty.");
        this.equip(tmWeapon);
    }
    
    @Override
	public void recoverAP() {
		if(isDead) {
			return;
		}
		super.ap = (super.ap + 7 >= 50) ? 50 : super.ap + 12;
	}
}