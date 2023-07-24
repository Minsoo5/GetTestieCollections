package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {

    @Test
    public void hashMapGetTest() {
        //Given
        Person min = new Person("Min", 1996);

        HashMap<Person, Integer> hm = new HashMap();

        hm.put(min, min.getYearOfBirth());

        //When


        int expectedYear = 1996;
        int actualYear = hm.get(min);

        //Then

        Assert.assertTrue(expectedYear == actualYear);

    }

    @Test
    public void hashMapReplaceTest() {
        //Given
        Person min = new Person("Min", 1996);
        Person calvin = new Person("Calvin", 1994);
        Person ryan = new Person("Ryan", 2000);

        HashMap<Person, Integer> hm = new HashMap();

        hm.put(min, min.getYearOfBirth());
        hm.put(calvin, calvin.getYearOfBirth());
        hm.put(ryan, ryan.getYearOfBirth());

        //When
        hm.replace(min, calvin.getYearOfBirth());

        //Then
        int expectedNum = 1994;
        int actualNum = hm.get(min);

        Assert.assertEquals(expectedNum, actualNum);

    }
    @Test
    public void hashMapContainsKeyTest() {
        //Given
        Person min = new Person("Min", 1996);
        Person calvin = new Person("Calvin", 1994);
        Person ryan = new Person("Ryan", 2000);

        HashMap<Person, Integer> hm = new HashMap();

        hm.put(min, min.getYearOfBirth());
        hm.put(calvin, calvin.getYearOfBirth());

        //When


        //Then
        Assert.assertFalse(hm.containsKey(ryan));

    }


}
