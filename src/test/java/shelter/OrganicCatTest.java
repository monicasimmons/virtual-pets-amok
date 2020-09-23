package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicCatTest {

    OrganicCat underTest = new OrganicCat("organic cat name", "is an organic cat", "organic", 30, 40, 20, 60, 50, 30);

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
    public void cleanLitterBoxesShouldIncreaseLitterBoxCleanlinessFrom30To100() {
        underTest.cleanLitterBoxes();
        int litterBoxCleanlinessLevel = underTest.getLitterBoxCleanlinessLevel();
        assertEquals(100, litterBoxCleanlinessLevel);
    }

}