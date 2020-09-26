package shelter;

public class OrganicDog extends OrganicPet implements Walk {

    private int cageCleanlinessLevel;

    public OrganicDog(String petName, String petDescription, String petType, int healthLevel, int happinessLevel, int foodLevel, int waterLevel, int boredomLevel, int cageCleanlinessLevel) {
        super(petName, petDescription, petType, healthLevel, happinessLevel, foodLevel, waterLevel, boredomLevel);
        this.cageCleanlinessLevel = cageCleanlinessLevel;
    }

    public int getCageCleanlinessLevel() {
        return cageCleanlinessLevel;
    }

    public void cleanCages() {
        cageCleanlinessLevel = 100;
        healthLevel +=10;
        happinessLevel +=5;
    }

    @Override
    public void walk() {
        healthLevel += 10;
        happinessLevel += 10;
        cageCleanlinessLevel += 3;
    }

    public void tick() {
        cageCleanlinessLevel -= 3;
        if (this.cageCleanlinessLevel <= 50)
            healthLevel -= 5;
    }
}

