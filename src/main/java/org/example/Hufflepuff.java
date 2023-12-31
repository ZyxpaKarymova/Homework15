package org.example;

/*
Студенты Пуффендуя трудолюбивы, верны, честны.
 */
public class Hufflepuff extends hogwarts {
    private String name;
    private int magicForce;
    private int apparitionDistance;
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicForce, int apparitionDistance, int diligence, int loyalty, int honesty) {
        super(name, magicForce, apparitionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() + ", трудолюбие: " + diligence + ", верность: " + loyalty + ", честность: " + honesty;
    }
    public static void compareHufflepuffStudents(Hufflepuff firstStudent, Hufflepuff secondStudent) {
        int sum1 = firstStudent.getDiligence() + firstStudent.getLoyalty() + firstStudent.getHonesty();
        int sum2 = secondStudent.getDiligence() + secondStudent.getLoyalty() + secondStudent.getHonesty();
        if (sum1 > sum2) {
            System.out.println(firstStudent.getName() + " лучший Пуффендуйец, чем " + secondStudent.getName());
        } else {
            System.out.println(secondStudent.getName() + " лучший Пуффендуйец, чем " + firstStudent.getName());
        }
    }
}
