package shelter;

public abstract class OrganicPet extends VirtualPet {

    protected int foodLevel;
    protected int waterLevel;
    protected int boredomLevel;

    public OrganicPet(String petName, String petDescription, String petType, int healthLevel, int happinessLevel, int foodLevel, int waterLevel, int boredomLevel) {
        super(petName, petDescription, petType, healthLevel, happinessLevel);
        this.foodLevel = foodLevel;
        this.waterLevel = waterLevel;
        this.boredomLevel = boredomLevel;
    }

    public int getFoodLevel() {
        return foodLevel;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

        public void feed(int amountToFeed) {
        foodLevel += amountToFeed;
        waterLevel -= (amountToFeed * .50);
        boredomLevel -= (amountToFeed * .50);
        healthLevel += 5;
        happinessLevel += 5;

    }


    public void giveWaterTo(int amountOfWaterToGive) {
        waterLevel += amountOfWaterToGive;
        foodLevel -= (amountOfWaterToGive * .20);
        boredomLevel -= (amountOfWaterToGive * .20);
        healthLevel += 5;
        happinessLevel += 5;
    }

    public void playWith(String petName, int amountOfTimeToPlay) {
        boredomLevel -= amountOfTimeToPlay;
        foodLevel -= (amountOfTimeToPlay * .40);
        waterLevel -= (amountOfTimeToPlay * .40);
        healthLevel += 5;
        happinessLevel += 5;
    }

}