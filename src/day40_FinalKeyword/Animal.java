package day40_FinalKeyword;

public class Animal {

    private String name;
    private final String bread;
    private final char gender;
    private final String color;
    private String size;
    private int age;



    public Animal(String name, String bread, char gender, String color, String size, int age) {
        this.name = name;
        this.bread = bread;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBread() {
        return bread;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking water");
    }


}
