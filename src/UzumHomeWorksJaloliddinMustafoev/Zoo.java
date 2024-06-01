package UzumHomeWorksJaloliddinMustafoev;

import java.util.List;

public class Zoo {
    public static void printAnimalSounds(List<Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " says: " + animal.makeSound());
        }
    }

    public static void main(String[] args) {
        List<Animal> animals = List.of(
                new Lion("Lion"),
                new Elephant("Elephant"),
                new Dog("Dog")
        );

        printAnimalSounds(animals);
    }
}
