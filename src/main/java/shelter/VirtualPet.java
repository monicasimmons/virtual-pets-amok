package shelter;

public abstract class VirtualPet {

    protected String petName;
    protected String petDescription;
    protected String petType;
    protected int healthLevel;
    protected int happinessLevel;

    public String getName() {
        return petName;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public String getType() {
        return petType;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public VirtualPet(String petName, String petDescription, String petType, int healthLevel, int happinessLevel) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.petType = petType;
        this.healthLevel = healthLevel;
        this.happinessLevel = happinessLevel;
    }

}



