public class SuperMutant extends Monster {
    protected static int id = 1;

    public SuperMutant() {
        super("SuperMutant #"+id, 170, 20);
        id++;
        setApcost(20);
        setDamage(60);
        System.out.println(getName()+": Roaarrr!");
    }    

    @Override
	public void recoverAP() {
		super.recoverAP();
		super.hp = (super.hp+10>=170) ? 170 : super.hp+10;
	}
    

}
