package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboticDogTest {

    RoboticDog underTest = new RoboticDog("robotic dog name", "is a robotic dog", "robotic", 50, 30, 20);

    @Test
    public void oilShouldIncreaseOilLevelFrom20To30() {
        underTest.oil(10);
        int oilLevel = underTest.getOilLevel();
        assertEquals(30, oilLevel);
    }

    @Test
    public void walkIncreasesHappinessLevelBy10() {
        underTest.walk();
        int happinessLevel = underTest.getHappinessLevel();
        assertEquals(40, happinessLevel);
    }

}