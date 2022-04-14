package day31.Constructors.day31_Constructors.ScrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {

        Tester tester1 = new Tester("layan", 11, "QA", 11000);
        Tester tester2 = new Tester("Tuğçe", 1, "SDET", 90000);
        Tester tester3 = new Tester("Kutay", 29, "QA", 5000);
        Tester tester4 = new Tester("Uras", 2, "SDET", 90000);

        Tester[] testers = {tester2,tester3,tester4};



        Developer developer1 = new Developer("Olga", 24, "Java Dev",145000);
        Developer developer2 = new Developer("Aygun", 35, "Java Master", 300000);
        Developer developer3 = new Developer("Tunc", 29, "Software Dev", 350000);
        Developer developer4 = new Developer("Sinem", 32, "Senior Dev", 23000);

        Developer[] developers={developer2,developer3,developer4};


        ScrumTeam scrum = new ScrumTeam("Nigara", "Hüseyin","Neira", 14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);


        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("-------------------------------------");

        for(Tester eachTester : scrum.testersList){
            System.out.println(eachTester.name +" : "+ eachTester.salary);
        }

        System.out.println("-------------------------------------");

        for(Developer eachDeveloper : scrum.devopList){
            System.out.println(eachDeveloper.name +" : "+eachDeveloper.salary);
        }

        System.out.println("-------------------------------------");

        scrum.removeTester(29);
        scrum.removeDeveloper(32);

        System.out.println(scrum);


    }
}
