package org.example;

/*
Всем Гриффиндорцам присущи благородство, честь и храбрость.
 */
public class Gryffindor extends Hogwarts {
    private String name;
    private int magicForce;
    int apparitionDistance;
    private int nobleness;
    private int honor;
    private int courage;

    public Gryffindor(String name, int magicForce, int apparitionDistance, int nobleness, int honor, int courage) {
        super(name, magicForce, apparitionDistance);
        this.nobleness = nobleness;
        this.honor = honor;
        this.courage = courage;
    }

    public void setNobleness(int nobless) {
        this.nobleness = nobless;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public int getNobleness() {
        return nobleness;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public String toString() {
        return super.toString() + ", благородство: " + this.nobleness + ", честь: " + this.honor + ", храбрость: " + this.courage;
    }

    public static void compareGryffindorStudents(Gryffindor firstStudent, Gryffindor secondStudent) {
        int sum1 = firstStudent.getNobleness() + firstStudent.getHonor() + firstStudent.getCourage();
        int sum2 = secondStudent.getNobleness() + secondStudent.getHonor() + secondStudent.getCourage();
        if (sum1 > sum2) {
            System.out.println(firstStudent.getName() + " лучший Гриффиндорец, чем " + secondStudent.getName());
        } else {
            System.out.println(secondStudent.getName() + " лучший Гриффиндорец, чем " + firstStudent.getName());
        }
    }
}
