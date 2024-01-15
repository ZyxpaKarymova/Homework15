package org.example;

public class Main {
    public static void main(String[] args) {

        /* Гарри Поттер, Гермиона Грейнджер и Рон Уизли учатся на факультете Гриффиндор.*/
        Gryffindor[] gryffindors = {
                new Gryffindor("Harry Potter", 52, 88, 100, 100, 100),
                new Gryffindor("Hermione Granger", 50, 100, 100, 100, 100),
                new Gryffindor("Ron Weasley", 51, 100, 100, 100, 100),
        };
        /* Драко Малфой, Грэхэм Монтегю, Грегори Гойл учатся на Слизерине.*/
        Slytherin[] slytherins = {
                new Slytherin("Draco Malfoy", 68, 62, 50, 50, 100, 75, 100),
                new Slytherin("Graham Montague", 43, 15, 50, 50, 50, 50, 50),
                new Slytherin("Gregory Goyle", 23, 4, 50, 50, 50, 50, 50),
        };
        /*На факультет Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.*/
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Zacharias Smith", 66, 100, 100, 100, 100),
                new Hufflepuff("Cedric Diggory", 75, 100, 100, 100, 100),
                new Hufflepuff("Justin Finch-Fletchley", 83, 56, 100, 100, 100)
        };
        /*На факультете Когтевран учатся Чжоу Чанг, Падма Патил и Маркус Белби*/
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Cho Chang", 67, 32, 65, 18, 92),
                new Ravenclaw("Padma Patil", 77, 44, 38, 11, 88),
                new Ravenclaw("Marcus Belby", 32, 26, 62, 10, 78),
        };
        PrintService.print(gryffindors);
        PrintService.print(hufflepuffs);
        PrintService.print(ravenclaws);
        PrintService.print(slytherins);

        System.out.println("Сравнение по факультетам");
        Gryffindor.compareGryffindorStudents(gryffindors[0], gryffindors[1]);
        Hufflepuff.compareHufflepuffStudents(hufflepuffs[0], hufflepuffs[1]);
        Ravenclaw.compareRavenClawStudents(ravenclaws[0], ravenclaws[1]);
        Slytherin.compareSlytherinStudents(slytherins[1], slytherins[2]);
        System.out.println("Сравнение магии");
        Hogwarts.compareStudentsMagicForce(gryffindors[0], hufflepuffs[2]);
        Hogwarts.compareStudentsMagicForce(hufflepuffs[1], gryffindors[1]);
        Hogwarts.compareStudentsMagicForce(ravenclaws[0], slytherins[2]);
        Hogwarts.compareStudentsMagicForce(slytherins[1], ravenclaws[1]);
        System.out.println("Сравнение трансгрессии");
        Hogwarts.compareStudentsApparitionDistance(gryffindors[0], hufflepuffs[2]);
        Hogwarts.compareStudentsApparitionDistance(hufflepuffs[1], gryffindors[1]);
        Hogwarts.compareStudentsApparitionDistance(ravenclaws[0], slytherins[2]);
        Hogwarts.compareStudentsApparitionDistance(slytherins[1], ravenclaws[1]);

    }

}


