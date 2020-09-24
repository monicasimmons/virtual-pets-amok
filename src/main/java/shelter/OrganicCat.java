package shelter;

public class OrganicCat extends OrganicPet {

    private int litterBoxCleanlinessLevel;

    public OrganicCat(String petName, String petDescription, String petType, int healthLevel, int happinessLevel, int foodLevel, int waterLevel, int boredomLevel, int litterBoxCleanlinessLevel) {
        super(petName, petDescription, petType, healthLevel, happinessLevel, foodLevel, waterLevel, boredomLevel);
        this.litterBoxCleanlinessLevel = litterBoxCleanlinessLevel;
    }

    public int getLitterBoxCleanlinessLevel() {
        return litterBoxCleanlinessLevel;
    }

    public void cleanLitterBoxes() {
        litterBoxCleanlinessLevel = 100;
        healthLevel +=10;
        happinessLevel +=5;
    }

    public void tick() {
        litterBoxCleanlinessLevel -= 3;
        if (this.litterBoxCleanlinessLevel <= 50)
            healthLevel -= 5;
        System.out.println("ALERT: My litter box cleanliness level is low. Please clean my litter box!");

    }

}
