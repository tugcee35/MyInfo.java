package week02;

public class NoahsArk {

    public static void main(String[] args) {

        AnimalSpecies dogs = new AnimalSpecies();
        dogs.setInfo("dogs", 50, 10);
        System.out.println(dogs);

        AnimalSpecies cats = new AnimalSpecies();
        cats.setInfo("cats", 60,15);

        System.out.println("Habitat of animals: "+AnimalSpecies.habitat);
    }
}
