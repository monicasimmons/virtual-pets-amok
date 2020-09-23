package shelter;

public class RoboticCat extends RoboticPet {

    public RoboticCat(String petName, String petDescription, String petType, int healthLevel, int happinessLevel, int oilLevel) {
        super(petName, petDescription, petType, healthLevel, happinessLevel, oilLevel);
    }

    public void tick() {
        oilLevel -= 3;
        if (this.oilLevel <= 50)
            healthLevel -= 5;
        System.out.println("ALERT: My oil level is low. Please give me more oil!");

    }
}
