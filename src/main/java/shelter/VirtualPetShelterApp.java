package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner option = new Scanner(System.in);
        Scanner choice = new Scanner(System.in);

        String userOption;
        String userChoice;
        String newPetDetail;

        VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();

        OrganicCat organicCat1 = new OrganicCat("Cat Benatar", "This black and white cat loves to cuddle and meow. We belong together!", "Organic", (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1));
        OrganicCat organicCat2 = new OrganicCat("Kitty Poppins", "This beautiful gray cat loves to play. Let's go fly a kite!", "Organic", (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1));
        OrganicDog organicDog1 = new OrganicDog("Bark Twain", "This fun dog is always up for an adventure. His favorite food is huckleberry.", "Organic", (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1));
        OrganicDog organicDog2 = new OrganicDog("Salvador Dogi", "This bizarre dog will melt your heart. Let's get surreal!", "Organic", (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1));
        RoboticCat roboticCat1 = new RoboticCat("Catzilla", "This large cat does get angry if not oiled. But he is monstrously dependable.", "Robotic", (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1));
        RoboticCat roboticCat2 = new RoboticCat("Cindy Clawford", "This slim cat is the model robotic pet. She also enjoys fashionable outfits.", "Robotic", (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1));
        RoboticDog roboticDog1 = new RoboticDog("Sir Waggington", "This dog is chivalrous and will protect you faithfully.", "Robotic", (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1));
        RoboticDog roboticDog2 = new RoboticDog("Woofer", "This dog can get loud sometimes but is always the life of the party.", "Robotic", (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1));

        myVirtualPetShelter.addPet(organicCat1);
        myVirtualPetShelter.addPet(organicCat2);
        myVirtualPetShelter.addPet(organicDog1);
        myVirtualPetShelter.addPet(organicDog2);
        myVirtualPetShelter.addPet(roboticCat1);
        myVirtualPetShelter.addPet(roboticCat2);
        myVirtualPetShelter.addPet(roboticDog1);
        myVirtualPetShelter.addPet(roboticDog2);

        System.out.println("Thank you for visiting Monica's Virtual Pet Shelter!\n");
        System.out.println("What is your name?");
        String userName = input.nextLine();
        System.out.println("Welcome, " + userName + ". What is your reason for visiting today?");
        System.out.println("Enter 1 if you are volunteering.");
        System.out.println("Enter 2 if you want to adopt a pet.");
        System.out.println("Enter 3 if you want to admit a pet.");
        System.out.println("Enter 4 if you want to exit.");
        userOption = option.nextLine();

        while (!userOption.equals("8")) {

            if (userOption.equals("1")) {
                System.out.println("Thank you for volunteering! The pets are excited that you're here.\n");
                System.out.println("These are the pets we have in the shelter today:\n");
                myVirtualPetShelter.showAllOrganicCatStatuses();
                System.out.println(" ");
                myVirtualPetShelter.showAllOrganicDogStatuses();
                System.out.println(" ");
                myVirtualPetShelter.showAllRoboticCatStatuses();
                System.out.println(" ");
                myVirtualPetShelter.showAllRoboticDogStatuses();
                do {
                    System.out.println("");
                    System.out.println("What would you like to do?");
                    System.out.println("Enter 1 to feed all organic pets.");
                    System.out.println("Enter 2 to give water to all organic pets.");
                    System.out.println("Enter 3 to give oil to all robotic pets.");
                    System.out.println("Enter 4 to choose a pet to play with.");
                    System.out.println("Enter 5 to walk all dogs.");
                    System.out.println("Enter 6 to clean dog cages.");
                    System.out.println("Enter 7 to clean cat litter boxes.");
                    System.out.println("Enter 8 to exit.");
                    userChoice = choice.nextLine();

                    if (userChoice.equals("1")) {
                        System.out.println(" ");
                        System.out.println("Thank you for choosing to feed these hungry pets!\n");
                        myVirtualPetShelter.feedAll();
                        System.out.println("Here are the organic pets' updated statuses:\n");
                        myVirtualPetShelter.showAllOrganicCatStatuses();
                        System.out.println(" ");
                        myVirtualPetShelter.showAllOrganicDogStatuses();

                    } else if (userChoice.equals("2")) {
                        System.out.println("Thank you for choosing to give water to these thirsty pets!\n");
                        myVirtualPetShelter.giveWaterToAll();
                        System.out.println("Here are the organic pets' updated statuses:\n");
                        myVirtualPetShelter.showAllOrganicCatStatuses();
                        System.out.println(" ");
                        myVirtualPetShelter.showAllOrganicDogStatuses();

                    } else if (userChoice.equals("3")) {
                        System.out.println("Thank you for choosing to oil the robotic pets!\n");
                        myVirtualPetShelter.oilAll();
                        System.out.println("Here are the robotic pets' updated statuses:\n");
                        myVirtualPetShelter.showAllRoboticCatStatuses();
                        System.out.println(" ");
                        myVirtualPetShelter.showAllRoboticDogStatuses();

                    } else if (userChoice.equals("4")) {
                        System.out.print("Thank you for choosing to play with a pet!\n");
                        System.out.println("Which pet would you like to play with?");
                        String petToPlayWith = choice.nextLine();
                        System.out.println("How many minutes do you want to play?");
                        int amountOfTimeToPlay = choice.nextInt();
                        choice.nextLine();
                        myVirtualPetShelter.playWith(petToPlayWith, amountOfTimeToPlay);

                    } else if (userChoice.equals("5")) {
                        System.out.println("Thank you for choosing to walk the dogs!");
                        myVirtualPetShelter.walkAllDogs();
                        System.out.println("Here are the dogs' updated statuses:\n");
                        myVirtualPetShelter.showAllOrganicDogStatuses();
                        System.out.println(" ");
                        myVirtualPetShelter.showAllRoboticDogStatuses();

                    } else if (userChoice.equals("6")) {
                        System.out.println("Thank you for choosing to clean the dog cages!");
                        myVirtualPetShelter.cleanDogCages();
                        System.out.println("Here are the organic dogs' updated statuses:\n");
                        myVirtualPetShelter.showAllOrganicDogStatuses();

                    } else if (userChoice.equals("7")) {
                        System.out.println("Thank you for choosing to clean the litter boxes!");
                        myVirtualPetShelter.cleanCatLitterBoxes();
                        System.out.println("Here are the organic cats' updated statuses:\n");
                        myVirtualPetShelter.showAllOrganicCatStatuses();


                    } else if (userChoice.equals("8")) {
                        System.out.println("Thank you for volunteering today!");
                        System.exit(0);
                    } else
                        System.out.println("I'm sorry...I do not understand.");

                    System.out.println(" ");
                    System.out.println("Here are all of the pets' updated statuses:\n");
                    myVirtualPetShelter.showAllOrganicCatStatuses();
                    System.out.println(" ");
                    myVirtualPetShelter.showAllOrganicDogStatuses();
                    System.out.println(" ");
                    myVirtualPetShelter.showAllRoboticCatStatuses();
                    System.out.println(" ");
                    myVirtualPetShelter.showAllRoboticDogStatuses();

                } while (!userChoice.equals("4"));

            } else if (userOption.equals("2")) {
                System.out.println(" ");
                System.out.println("Thank you for wanting to adopt a pet! We have many great animals for you to choose from!\n");
                myVirtualPetShelter.showPetNameDescription();
                System.out.println(" ");
                System.out.println("Which pet are you interested in adopting?");
                String adoptedPet = option.nextLine();
                System.out.println(" ");
                System.out.println("You are going to love " + adoptedPet + "!");
                myVirtualPetShelter.removePet(myVirtualPetShelter.findPet(adoptedPet));
                System.out.println("Congratulations! Your adoption is now complete!\n");
                System.out.println("These are the remaining pets in the shelter.\n");
                myVirtualPetShelter.showAllPetsStatuses();

            } else if (userOption.equals("3")) {
                System.out.println("Thank you for bringing a pet into our shelter!\n");
                System.out.println("What is this pet's name? If you're not sure, be creative!");
                String newPetName = option.nextLine();
                System.out.println("Please write a description for " + newPetName + ".");
                String newPetDescription = option.nextLine();
                System.out.println("Enter 1 if your pet is an organic cat.");
                System.out.println("Enter 2 if your pet is a robotic cat.");
                System.out.println("Enter 3 if your pet is an organic dog.");
                System.out.println("Enter 4 if your pet is a robotic dog.");
                newPetDetail = choice.nextLine();
                if (newPetDetail.equals("1")) {
                    String newPetType = "organic";
                    OrganicCat petToAdd = new OrganicCat(newPetName, newPetDescription, newPetType, (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1));
                    myVirtualPetShelter.addPet(petToAdd);
                } else if (newPetDetail.equals("2")) {
                    String newPetType = "robotic";
                    RoboticCat petToAdd = new RoboticCat(newPetName, newPetDescription, newPetType, (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1));
                    myVirtualPetShelter.addPet(petToAdd);
                } else if (newPetDetail.equals("3")) {
                    String newPetType = "organic";
                    OrganicDog petToAdd = new OrganicDog(newPetName, newPetDescription, newPetType, (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1));
                    myVirtualPetShelter.addPet(petToAdd);
                } else if (newPetDetail.equals("4")) {
                    String newPetType = "robotic";
                    RoboticCat petToAdd = new RoboticCat(newPetName, newPetDescription, newPetType, (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1));
                    myVirtualPetShelter.addPet(petToAdd);
                }
                System.out.println("Congratulations! " + newPetName + " has been admitted!\n");
                System.out.println("Here is the status of all of the pets in the shelter:\n");
                myVirtualPetShelter.showAllOrganicCatStatuses();
                System.out.println(" ");
                myVirtualPetShelter.showAllOrganicDogStatuses();
                System.out.println(" ");
                myVirtualPetShelter.showAllRoboticCatStatuses();
                System.out.println(" ");
                myVirtualPetShelter.showAllRoboticDogStatuses();

            } else
                System.out.println("I'm sorry...I do not understand.");

            myVirtualPetShelter.tickAll();

            System.out.println(" ");
            System.out.println("Press 1 if you want to volunteer.");
            System.out.println("Press 2 if you want to adopt a pet.");
            System.out.println("Press 3 if you want to admit a pet.");
            System.out.println("Press 4 if you want to exit.");
            userOption = option.nextLine();

        }
            System.out.println("Thank you for visiting the shelter today!");

    }

}
