package rocks.zipcode;

import java.sql.Array;
import java.util.*;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
//        System.out.println("Hello World!");

        Person min = new Person("Min", 1996);
        Person calvin = new Person("Calvin", 1994);
        Person jeff = new Person("Jeff", 1990);
        Person ryan = new Person("Ryan", 2000);

        Address minsHouse = new Address("Primrose", "Maple Glen", "19002", "USA");
        Address calvinsHouse = new Address("Main Street", "Delaware", "19191", "USA");
        Address jeffsHouse = new Address("South Street", "Philadelphia", "19119", "USA");
        Address ryansHouse = new Address("Flower Lane", "Ambler", "19002", "USA");


        min.setAddress(minsHouse);
        calvin.setAddress(calvinsHouse);
        jeff.setAddress(jeffsHouse);
//        ryan.setAddress(ryansHouse);


        HashMap<List<String>, Integer> inventory = new HashMap();





    }




}
