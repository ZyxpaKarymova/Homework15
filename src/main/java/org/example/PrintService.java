package org.example;

public class PrintService {
public static void print (Gryffindor[] gryffindors){
    System.out.println("Факультет Гриффиндор " + gryffindors.length+ " волшебника");
    for (int i = 0; i < gryffindors.length; i++) {
        System.out.println(gryffindors[i].toString());
    }
}
    public static void print (Hufflepuff[] hufflepuffs){
        System.out.println("Факультет Пуффендуй " + hufflepuffs.length+ " волшебника");
        for (int i = 0; i < hufflepuffs.length; i++) {
            System.out.println(hufflepuffs[i].toString());
        }
    }
    public static void print (Ravenclaw[] ravenclaws){
        System.out.println("Факультет Когтевран " + ravenclaws.length+ " волшебника");
        for (int i = 0; i < ravenclaws.length; i++) {
            System.out.println(ravenclaws[i].toString());
        }
    }
    public static void print (Slytherin[] slytherins){
        System.out.println("Факультет Слизерин " + slytherins.length+ " волшебника");
        for (int i = 0; i < slytherins.length; i++) {
            System.out.println(slytherins[i].toString());
        }
    }



}
