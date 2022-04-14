package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer = new Developer("Ali", 39, 'M', 84848, "Java Developer", 1255000);

        Tester tester = new Tester("Tuğçe", 28, 'F', 12345, "SDET", 200000);

        Teacher teacher = new Teacher("Daniel", 40, 'M', 83838, "Math Teacher", 100000);

        Student student = new Student("Olga", 22, 'F', 3990, "SDET");


        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("------------------------------------------------");

        developer.setAge(32);
        System.out.println(developer.getAge());
        System.out.println(developer);

        System.out.println("------------------------------------------");

        developer.work();
        tester.work();
        teacher.work();

        System.out.println("-------------------------");

        developer.fixingBug();
        developer.drink();
        developer.sleep();
        developer.eat();

        System.out.println("---------------------------------");

        tester.createTicket();
        tester.drink();
        tester.eat();
        tester.sleep();

        System.out.println("----------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        System.out.println("---------------------------------");

        student.eat();
        student.sleep();
        student.drink();
        student.study();



    }

}
