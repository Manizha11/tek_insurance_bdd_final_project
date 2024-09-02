package bdd.tek.utility;

public class RandomGenerator {
    public static String  randomEmail(String firstName, String prefix){
        int random =(int)(Math.random()*100);
        return prefix + random + "@gmail.com";

    }
}
