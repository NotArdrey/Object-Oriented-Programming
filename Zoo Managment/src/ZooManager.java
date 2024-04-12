import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ZooManager {
    private static ArrayList<Animal> animals = new ArrayList<>();
    private static Aviary aviary = new Aviary();
    private static Aquarium aquarium = new Aquarium();
    private static Savannah savannah = new Savannah();
    private static Jungle jungle = new Jungle();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



        while (true) {
            System.out.println("\nZoo Management System");
            System.out.println("1. View all animals in the zoo");
            System.out.println("2. View animals in a specific habitat");
            System.out.println("3. Simulate animal behavior");
            System.out.println("4. Add animal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); 
                if (choice == 1) {
                    viewAllAnimals();
                } else if (choice == 2) {
                    viewHabitatAnimals();
                } else if (choice == 3) {
                    simulateAnimalBehavior();
                } else if (choice == 4) {
                    createAnimals();
                } else if (choice == 5) {
                    System.out.println("Goodbye");
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); 
            }
        }
    }

    static void viewAllAnimals() {
        System.out.println("\nAll Animals in the Zoo");
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName() + ": " + animal.name);
            System.out.println("animal Name: " + animal.name);
            System.out.println("animal Age: " + animal.age);
            System.out.println("animal Weight: " + animal.weight + "kg\n");
        }
    }


    static void viewHabitatAnimals() {
        System.out.println("\nView Animals in a Specific Habitat");
        System.out.println("1. Aviary");
        System.out.println("2. Aquarium");
        System.out.println("3. Savannah");
        System.out.println("4. Jungle");
        System.out.print("Enter your choice: ");

        int habitatChoice = scanner.nextInt();
        scanner.nextLine();
        
        try {
        if (habitatChoice == 1) {
            aviary.viewAnimals();
        } else if (habitatChoice == 2) {
            aquarium.viewAnimals();
        } else if (habitatChoice == 3) {
            savannah.viewAnimals();
        } else if (habitatChoice == 4) {
            jungle.viewAnimals();
        } else {
            System.out.println("Invalid choice.");
        }
        }catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine(); 
        }
    }

    private static void createAnimals() {
            System.out.println("\nWhat type of animal do you want to create?");
            System.out.println("1. Mammal");
            System.out.println("2. Bird");
            System.out.println("3. Fish");
            System.out.println("4. Reptile");
            System.out.print("Enter your choice: ");
    
            int choice = scanner.nextInt();
            scanner.nextLine(); 
    
            try {
                if (choice == 1) {
                    createMammal();
                } else if (choice == 2) {
                    createBird();
                } else if (choice == 3) {
                    createFish();
                } else if (choice == 4) {
                    createReptile();
                } else {
                    System.out.println("Invalid choice.");
                    createAnimals();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); 
            }

    }


    private static void createMammal() {
        System.out.print("Enter mammal name: ");
        String name = scanner.nextLine();
        System.out.print("Enter mammal age: ");
        int age = scanner.nextInt();
        System.out.print("Enter mammal weight: ");
        double weight = scanner.nextDouble();
        
        Mammal mammal = new Mammal(name, age, weight);
        animals.add(mammal);
        savannah.addAnimal(mammal);
    }

    private static void createBird() {
        System.out.print("Enter bird name: ");
        String name = scanner.nextLine();
        System.out.print("Enter bird age: ");
        int age = scanner.nextInt();
        System.out.print("Enter bird weight: ");
        double weight = scanner.nextDouble();
        
        Bird bird = new Bird(name, age, weight);
        animals.add(bird);
        aviary.addAnimal(bird);
    }

    private static void createFish() {
        System.out.print("Enter fish name: ");
        String name = scanner.nextLine();
        System.out.print("Enter fish age: ");
        int age = scanner.nextInt();
        System.out.print("Enter fish weight: ");
        double weight = scanner.nextDouble();
        
        fish fish = new fish(name, age, weight);
        animals.add(fish);
        aquarium.addAnimal(fish);
    }
    
    private static void createReptile() {
        while(true){
        System.out.print("Enter Reptile name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Reptile age: ");
        int age = scanner.nextInt();
        if(age < 1 || age > 99){
            System.out.println("Invalid age. Make sure to put above 0 or below 99. Enter Again a value \n");
            scanner.next();
        }


        System.out.print("Enter Reptile weight: ");
        double weight = scanner.nextDouble();
        if(weight < 1 || weight > 100){
            System.out.println("Invalid age. Make sure to put above 0 or below 99. Enter Again a value \n");
            scanner.next();         
        }

        
        Reptile reptile = new Reptile(name, age, weight);
        animals.add(reptile);
        jungle.addAnimal(reptile);
        break;
      }
    }


    private static void simulateAnimalBehavior() {
        System.out.println("\n--- Simulate Animal Behavior ---");
        System.out.println("1. Make sounds");
        System.out.println("2. Fly");
        System.out.println("3. Swim");
        System.out.println("4. Climb");
        System.out.print("Enter your choice: ");

        int behaviorChoice = scanner.nextInt();
        scanner.nextLine(); 

    if (behaviorChoice == 1) {
        makeSounds();
    } else if (behaviorChoice == 2) {
        simulateFlying();
    } else if (behaviorChoice == 3) {
        simulateSwimming();
    } else if (behaviorChoice == 4) {
        simulateClimbing();
    } else {
        System.out.println("Invalid choice.");
    }
    }


    private static void makeSounds() {
        System.out.println("\n--- Animals Making Sounds ---");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }


    private static void simulateFlying() {
        System.out.println("\n--- Birds Flying ---");
        aviary.simulateInteractions();
    }


    private static void simulateSwimming() {
        System.out.println("\n--- Fish Swimming ---");
        aquarium.simulateInteractions();
    }

    private static void simulateClimbing() {
        System.out.println("\n--- Primates Climbing ---");
        jungle.simulateInteractions();
    }
}

class Aviary {
    private ArrayList<Bird> birds = new ArrayList<>();

    public void addAnimal(Bird bird) {
        birds.add(bird);
    }

    public void viewAnimals() {
        System.out.println("\n--- Animals in the Aviary ---");
        for (Bird bird : birds) {
            System.out.println("Bird Name: " + bird.name);
            System.out.println("Bird Age: " + bird.age);
            System.out.println("Bird Weight: " + bird.weight + "kg\n");
        }
    }

    public void simulateInteractions() {
        System.out.println("Interactions in the Aviary:");
        for (Bird bird : birds) {
            bird.makeSound();
            bird.eat();
            bird.sleep();
            if (bird instanceof Flyable) {
                ((Flyable) bird).fly();
            }
        }
    }
}
class Aquarium {
    private ArrayList<fish> fishes = new ArrayList<>();

    public void addAnimal(fish fish) {
        fishes.add(fish);
    }

    public void viewAnimals() {
        System.out.println("\n--- Animals in the Aquarium ---");
        for (fish fish : fishes) {
            System.out.println("fish Name: " + fish.name);
            System.out.println("fish Age: " + fish.age);
            System.out.println("fish Weight: " + fish.weight + "kg\n");
        }
    }

    public void simulateInteractions() {
        System.out.println("Interactions in the Aquarium:");
        for (fish fish : fishes) {
            fish.makeSound();
            fish.eat();
            fish.sleep();
            if (fish instanceof Swimmable) {
                ((Swimmable) fish).swim();
            }
        }
    }
}

class Savannah {
    private ArrayList<Mammal> mammals = new ArrayList<>();

    public void addAnimal(Mammal mammal) {
        mammals.add(mammal);
    }

    public void viewAnimals() {
        System.out.println("\n--- Animals in the Savannah ---");
        for (Mammal mammal : mammals) {
            System.out.println("mammal Name: " + mammal.name);
            System.out.println("mammal Age: " + mammal.age);
            System.out.println("mammal Weight: " + mammal.weight + "kg\n");
        }
    }

    public void simulateInteractions() {
        System.out.println("Interactions in the Savannah:");
        for (Mammal mammal : mammals) {
            mammal.makeSound();
            mammal.eat();
            mammal.sleep();
        }
    }
}

class Jungle {
    private ArrayList<Reptile> reptiles = new ArrayList<>();

    public void addAnimal(Reptile reptile) {
        reptiles.add(reptile);
    }

    public void viewAnimals() {
        System.out.println("\n--- Animals in the Jungle ---");
        for (Reptile reptile : reptiles) {
            System.out.println("reptile Name: " + reptile.name);
            System.out.println("reptile Age: " + reptile.age);
            System.out.println("reptile Weight: " + reptile.weight + "kg\n");
        }
    }

    public void simulateInteractions() {
        System.out.println("Interactions in the Jungle:");
        for (Reptile reptile : reptiles) {
            reptile.makeSound();
            reptile.eat();
            reptile.sleep();
            if (reptile instanceof Climber) {
                ((Climber) reptile).climb();
            }
        }
    }
}