package day40_FinalKeyword;

public class Dog extends Animal{


    public Dog(String name, String bread, char gender, String color, String size, int age) {
        super(name, bread, gender, color, size, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating dog food");
    }

    public void drink(){
        System.out.println(getName()+" is drinking beer");
    }


    
}
