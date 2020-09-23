package shelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

    VirtualPetShelter underTest;
    OrganicCat organicCat;
    OrganicDog organicDog1;
    OrganicDog organicDog2;
    RoboticCat roboticCat;
    RoboticDog roboticDog;

    @BeforeEach
    public void SetUp() {
        underTest = new VirtualPetShelter();
        organicCat = new OrganicCat("organic cat name", "is an organic cat", "organic", 30, 40, 20, 60, 50, 20);
        organicDog1 = new OrganicDog("organic dog1 name", "is an organic dog", "organic", 40, 50, 60, 20, 40, 30);
        organicDog2 = new OrganicDog("organic dog2 name", "is also an organic dog", "organic", 20, 40, 30, 60, 50, 40);
        roboticCat = new RoboticCat("robotic cat name", "is a robotic cat", "robotic", 20, 30, 20);
        roboticDog = new RoboticDog("robotic dog name", "is a robotic dog", "robotic", 50, 20, 60);
    }

    @Test
    public void shouldBeAbleToFeedAllOrganicPets() {
        underTest.addPet(organicCat);
        underTest.addPet(organicDog1);
        underTest.feedAll();
        assertEquals(30, organicCat.getFoodLevel());
        assertEquals(70, organicDog1.getFoodLevel());
    }

    @Test
    public void shouldBeAbleToGiveWaterToAllOrganicPets() {
        underTest.addPet(organicCat);
        underTest.addPet(organicDog1);
        underTest.giveWaterToAll();
        assertEquals(70, organicCat.getWaterLevel());
        assertEquals(30, organicDog1.getWaterLevel());

    }

    @Test
    public void shouldBeAbleToPlayWithAnOrganicPet() {
        underTest.addPet(organicCat);
        underTest.playWith("name", 5);
        assertEquals(45, organicCat.getBoredomLevel());
    }

    @Test
    public void shouldBeAbleToOilAllRoboticPets() {
        underTest.addPet(roboticCat);
        underTest.addPet(roboticDog);
        underTest.oilAll();
        assertEquals(30, roboticCat.getOilLevel());
        assertEquals(70, roboticDog.getOilLevel());
    }
}