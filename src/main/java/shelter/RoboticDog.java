package shelter;

public class RoboticDog extends RoboticPet implements Walk {

    public RoboticDog(String petName, String petDescription, String petType, int healthLevel, int happinessLevel, int oilLevel) {
        super(petName, petDescription, petType, healthLevel, happinessLevel, oilLevel);
    }

    @Override
    public void walk() {
        healthLevel += 10;
        happinessLevel += 10;
    }

    public void tick() {
        oilLevel -= 3;
        if (this.oilLevel <= 50)
            healthLevel -= 5;
    }
}
