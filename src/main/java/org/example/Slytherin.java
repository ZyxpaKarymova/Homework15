package org.example;

/*
Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
 */
public class Slytherin extends hogwarts {
    private String name;
    private int magicForce;
    private int apparitionDistance;
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;


    public Slytherin(String name, int magicForce, int apparitionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicForce, apparitionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }
public void setCunning(int cunning){
        this.cunning=cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public int getCunning(){
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public String toString() {
        return super.toString()+", хитрость: "+cunning+", решительность: "+determination+", амбициозность: "+ambition+", находчивость: "+resourcefulness+", жажда власти: "+thirstForPower;
    }
    public static void compareSlytherinStudents(Slytherin firstStudent, Slytherin secondStudent) {
        int sum1 = firstStudent.getCunning() + firstStudent.getDetermination() + firstStudent.getAmbition()+firstStudent.getResourcefulness()+firstStudent.getThirstForPower();
        int sum2 = secondStudent.getCunning() + secondStudent.getDetermination() + secondStudent.getAmbition()+secondStudent.getResourcefulness()+secondStudent.getThirstForPower();
        if (sum1 > sum2) {
            System.out.println(firstStudent.getName() + " лучший Слизеринец, чем " + secondStudent.getName());
        } else {
            System.out.println(secondStudent.getName() + " лучший Слизеринец, чем " + firstStudent.getName());
        }
    }

}
