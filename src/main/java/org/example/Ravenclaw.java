package org.example;
/*
Когтевранцы умны, мудры, остроумны и полны творчества.
 */
public class Ravenclaw extends hogwarts{
    private String name;
    private int magicForce;
    private int apparitionDistance;
    private int mind;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magicForce, int apparitionDistance,int mind,int wit,int creativity){
        super(name, magicForce, apparitionDistance);
        this.mind=mind;
        this.wit=wit;
        this.creativity=creativity;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }
    public String toString() {
        return super.toString() + ", ум: " + mind+ ", остроумие: " + wit + ", творчество: " + creativity;
    }
    public static void compareRavenClawStudents(Ravenclaw firstStudent, Ravenclaw secondStudent) {
        int sum1 = firstStudent.getMind() + firstStudent.getWit() + firstStudent.getCreativity();
        int sum2 = secondStudent.getMind() + secondStudent.getWit() + secondStudent.getCreativity();
        if (sum1 > sum2) {
            System.out.println(firstStudent.getName() + " лучший Когтевранец, чем " + secondStudent.getName());
        } else {
            System.out.println(secondStudent.getName() + " лучший Когтевранец, чем " + firstStudent.getName());
        }
    }

}
