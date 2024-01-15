package org.example;

/*
Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью в сколько-то баллов
и могут трансгрессировать на какое-то расстояние.
Сила магии и расстояние трансгрессии у каждого ученика своё и выражается в целочисленном эквиваленте.
 */
public class Hogwarts {
    private String name;
    private int magicForce;
    private int apparitionDistance;

    public Hogwarts(String name, int magicForce, int apparitionDistance) {
        this.name = name;
        this.magicForce = magicForce;
        this.apparitionDistance = apparitionDistance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMagicForce(int magicForce) {
        this.magicForce = magicForce;
    }

    public void setApparitionDistance(int apparitionDistance) {
        this.apparitionDistance = apparitionDistance;
    }

    public String getName() {
        return this.name;
    }

    public int getMagicForce() {
        return this.magicForce;
    }

    public int getApparitionDistance() {
        return apparitionDistance;
    }

    public String toString() {
        return "Имя: " + this.name + ", сила магии: " + this.magicForce + ", расстояние трансгрессии: " + this.apparitionDistance;
    }
    public static void compareStudentsMagicForce(Hogwarts firstStudent, Hogwarts secondStudent){
        if (firstStudent.getMagicForce()> secondStudent.getMagicForce()){
            System.out.println(firstStudent.getName()+" обладает бОльшей мощностью магии, чем "+secondStudent.getName());

    }else {
            System.out.println(secondStudent.getName()+" обладает бОльшей мощностью магии, чем "+firstStudent.getName());
        }
        }
    public static void compareStudentsApparitionDistance(Hogwarts firstStudent, Hogwarts secondStudent){
        if (firstStudent.getApparitionDistance()> secondStudent.getApparitionDistance()){
            System.out.println(firstStudent.getName()+" трансгрессирует дальше, чем "+secondStudent.getName());
        }else {
            System.out.println(secondStudent.getName()+" трансгрессирует дальше, чем "+firstStudent.getName());
        }
    }

}

