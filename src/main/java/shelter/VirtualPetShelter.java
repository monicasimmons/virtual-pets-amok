package shelter;

import java.awt.*;
import java.util.*;

public class VirtualPetShelter {

    Map<String, VirtualPet> petList = new HashMap<>();

    public void addPet(VirtualPet petToAdd) {
        petList.put(petToAdd.getName(), petToAdd);
    }

    public VirtualPet findPet(String name) {
        return petList.get(name);
    }

    public void removePet(VirtualPet pet) {
        petList.remove(pet.getName(), pet);
    }


//    public Collection<VirtualPet> getAllOrganicPets() {
//        Collection<VirtualPet> organicPets = new ArrayList<>();
//        for (VirtualPet pet : petList.values()) {
//            if (pet instanceof OrganicPet) {
//                organicPets.add(pet);
//            }
//        }
//        return organicPets;
//    }
//
//    public Collection<VirtualPet> getAllRoboticPets() {
//        Collection<VirtualPet> roboticPets = new ArrayList<>();
//        for (VirtualPet pet : petList.values()) {
//            if (pet instanceof RoboticPet) {
//                roboticPets.add(pet);
//            }
//        }
//        return roboticPets;
//    }

    public void feedAll() {
        for (VirtualPet pet : petList.values()) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).feed(10);
            }
        }
    }

    public void giveWaterToAll() {
        for (VirtualPet pet : petList.values()) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).giveWaterTo(10);
            }
        }
    }

    public void playWith(String petName, int amountOfTimeToPlay) {
        for (VirtualPet pet : petList.values()) {
            if (pet instanceof OrganicPet) {
                findPet(petName);
                ((OrganicPet) pet).playWith("name", 5);
            }
        }
    }

    public void oilAll() {
        for (VirtualPet pet : petList.values()) {
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).oil(10);
            }
        }
    }

    public void walkAllDogs() {
        for (VirtualPet pet : petList.values()) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).walk();
            } else if (pet instanceof RoboticDog) {
                ((RoboticDog) pet).walk();
            }
        }
    }

    public void cleanCatLitterBoxes() {
        for (VirtualPet pet : petList.values()) {
            if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).cleanLitterBoxes();
            }
        }
    }

    public void cleanDogCages() {
        for (VirtualPet pet : petList.values()) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).cleanCages();
            }
        }
    }


    public void tickAll() {
        for (VirtualPet pet : petList.values()) {
            if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).tick();
            }
            if (pet instanceof OrganicDog) {

            }
        }
    }

    public void showAllOrganicCats() {
        String format = "%-10s %15s %15s %15s %15s %15s %20s\n";
        System.out.format(format, "Name", "Health Level", "Happiness Level", "Food Level", "Water Level", "Boredom Level", "Pet Waste\n");
        for (VirtualPet pet : petList.values()) {
            if (pet instanceof OrganicCat) {
                String petName = pet.getName();
                int healthLevel = pet.getHealthLevel();
                int happinessLevel = pet.getHappinessLevel();
                int foodLevel = ((OrganicCat) pet).getFoodLevel();
                int waterLevel = ((OrganicCat) pet).getWaterLevel();
                int boredomLevel = ((OrganicCat) pet).getBoredomLevel();
                int litterBoxCleanlinessLevel = ((OrganicCat) pet).getLitterBoxCleanlinessLevel();
                System.out.format(format, petName, healthLevel, happinessLevel, foodLevel, waterLevel, boredomLevel, litterBoxCleanlinessLevel);
            }
        }
    }

    public void showAllOrganicDogs() {
        String format = "%-10s %15s %15s %15s %15s %15s %20s\n";
        System.out.format(format, "Name", "Health Level", "Happiness Level", "Food Level", "Water Level", "Boredom Level", "Pet Waste\n");
        for (VirtualPet pet : petList.values()) {
            if (pet instanceof OrganicDog) {
                String petName = pet.getName();
                int healthLevel = pet.getHealthLevel();
                int happinessLevel = pet.getHappinessLevel();
                int foodLevel = ((OrganicDog) pet).getFoodLevel();
                int waterLevel = ((OrganicDog) pet).getWaterLevel();
                int boredomLevel = ((OrganicDog) pet).getBoredomLevel();
                int cageCleanlinessLevel = ((OrganicDog) pet).getCageCleanlinessLevel();
                System.out.format(format, petName, healthLevel, happinessLevel, foodLevel, waterLevel, boredomLevel, cageCleanlinessLevel);
            }
        }
    }

    public void showAllRoboticCats() {
        String format = "%-10s %15s %15s %20s\n";
        System.out.format(format, "Name", "Health Level", "Happiness Level", "Oil Level\n");
        for (VirtualPet pet : petList.values()) {
            if (pet instanceof RoboticCat) {
                String petName = pet.getName();
                int healthLevel = pet.getHealthLevel();
                int happinessLevel = pet.getHappinessLevel();
                int oilLevel = ((RoboticCat) pet).getOilLevel();
                System.out.format(format, petName, healthLevel, happinessLevel, oilLevel);
            }
        }
    }

    public void showAllRoboticDogs() {
        String format = "%-10s %15s %15s %20s\n";
        System.out.format(format, "Name", "Health Level", "Happiness Level", "Oil Level\n");
        for (VirtualPet pet : petList.values()) {
            if (pet instanceof RoboticDog) {
                String petName = pet.getName();
                int healthLevel = pet.getHealthLevel();
                int happinessLevel = pet.getHappinessLevel();
                int oilLevel = ((RoboticDog) pet).getOilLevel();
                System.out.format(format, petName, healthLevel, happinessLevel, oilLevel);
            }
        }
    }


    public void showAllPetsStatuses() {
        String format = "%-20s %30s %30s %30s\n";
        System.out.format(format, "Name", "Type", "Health Level", "Happiness Level\n");
        for (VirtualPet pet : petList.values()) {
            String petName = pet.getName();
            String petType = pet.getType();
            int healthLevel = pet.getHealthLevel();
            int happinessLevel = pet.getHappinessLevel();
            System.out.format(format, petName, healthLevel, happinessLevel);
        }
    }

    public void showPetNameDescription() {
        String format = "%-20s %30s\n";
        System.out.format(format, "Name", "Description\n");
        for (VirtualPet pet : petList.values()) {
            String petName = pet.getName();
            String petDescription = pet.getPetDescription();
            System.out.format(format, petName, petDescription);
        }
    }

}