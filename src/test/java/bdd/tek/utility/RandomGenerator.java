package bdd.tek.utility;

public class RandomGenerator {
    public String  randomEmail(String firstName,String lastName){
        int random =(int)(Math.random()*100);
        return firstName + lastName + random + "@gmail.com";

    }
}
