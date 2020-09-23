package shelter;

public abstract class RoboticPet extends VirtualPet {

    protected int oilLevel;

    public RoboticPet(String petName, String petDescription, String petType, int healthLevel, int happinessLevel, int oilLevel) {
        super(petName, petDescription, petType, healthLevel, happinessLevel);
        this.oilLevel = oilLevel;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public void oil(int amountToOil) {
        oilLevel += amountToOil;
    }
}