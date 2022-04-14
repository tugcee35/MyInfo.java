package day36_Inhertitance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Gofret", "Husky", 'M', 2, "Small", "white");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();

        System.out.println(dog);
        Cat cat = new Cat();
        cat.setInfo("Minnie", "British", 'F', 3, "Small", "brown");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.scratch();

        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 10, "Large", "blacj");
        tiger.eat();
        tiger.sleep();
        tiger.move();
        tiger.drink();
        tiger.hunt();
        tiger.roar();

        System.out.println(tiger);



    }
}
