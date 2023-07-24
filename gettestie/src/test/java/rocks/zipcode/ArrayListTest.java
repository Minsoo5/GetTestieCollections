package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {

    @Test
    public void arrayListIndexTest() {
        //Given
        Person min = new Person("Min", 1996);
        Person calvin = new Person("Calvin", 1994);
        Person jeff = new Person("Jeff", 1990);
        Person ryan = new Person("Ryan", 2000);

        ArrayList<Person> ar = new ArrayList<>();

        ar.add(min);
        ar.add(jeff);
        ar.add(ryan);

        //When
        int expectedIndex = 1;
        int actualIndex = ar.indexOf(jeff);

        //Then
        Assert.assertEquals(expectedIndex, actualIndex);


    }

    @Test
    public void arrayListLastIndexTest() {
        //Given
        Person min = new Person("Min", 1996);
        Person calvin = new Person("Calvin", 1994);
        Person jeff = new Person("Jeff", 1990);
        Person ryan = new Person("Ryan", 2000);

        ArrayList<Person> ar = new ArrayList<>();

        ar.add(min);
        ar.add(jeff);
        ar.add(ryan);
        ar.add(jeff);
        ar.add(ryan);

        //When
        int expectedIndex = 3;
        int actualIndex = ar.lastIndexOf(jeff);

        //Then
        Assert.assertEquals(expectedIndex, actualIndex);


    }
    @Test
    public void arrayListSetTest() {
        //Given
        Person min = new Person("Min", 1996);
        Person calvin = new Person("Calvin", 1994);
        Person jeff = new Person("Jeff", 1990);
        Person ryan = new Person("Ryan", 2000);

        ArrayList<Person> ar = new ArrayList<>();

        ar.add(min);
        ar.add(jeff);
        ar.add(ryan);
        ar.add(jeff);
        ar.add(ryan);

        //When
        ar.set(2, jeff);

        Person expectedPerson = jeff;
        Person actualPerson = ar.get(2);

        //Then
        Assert.assertEquals(expectedPerson, actualPerson);


    }
}
