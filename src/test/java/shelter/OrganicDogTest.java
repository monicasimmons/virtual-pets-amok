package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicDogTest {

    OrganicDog underTest = new OrganicDog ("organic dog name", "is an organic dog", "organic", 30, 40, 20, 60, 50, 50);

    @Test
    public void feedShouldIncreaseFoodLevelFrom20To30() {
        underTest.feed(10);
        int foodLevel = underTest.getFoodLevel();
        assertEquals(30, foodLevel);
    }

    @Test
    public void giveWaterToShouldIncreaseWaterLevelFrom60To70() {
        underTest.giveWaterTo(10);
        int waterLevel = underTest.getWaterLevel();
        assertEquals(70, waterLevel);

    }

    @Test
    public void playWithShouldDecreaseBoredomFrom50To45() {
        underTest.playWith("name", 5);
        int boredomLevel = underTest.getBoredomLevel();
        assertEquals(45, boredomLevel);
    }

    @Test
    public void cleanCagesShouldIncreaseCageCleanlinessFrom50To100() {
        underTest.cleanCages();
        int cageCleanlinessLevel = underTest.getCageCleanlinessLevel();
        assertEquals(100, cageCleanlinessLevel);
    }

    @Test
    public void walkIncreasesHappinessLevelBy10() {
        underTest.walk();
        int happinessLevel = underTest.getHappinessLevel();
        assertEquals(50, happinessLevel);
    }

    @Test
    public void walkMaintainsCageCleanlinessLevelByOffsettingTick() {
        underTest.walk();
        int cageCleanlinessLevel = underTest.getCageCleanlinessLevel();
        assertEquals(53, cageCleanlinessLevel);

    }


}