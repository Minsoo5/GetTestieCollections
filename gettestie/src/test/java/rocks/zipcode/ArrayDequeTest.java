package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class ArrayDequeTest {

@Test
    public void ArrayDequeAddFirstTest() {
    //Given
    Person min = new Person("Min", 1996);
    Person calvin = new Person("Calvin", 1994);
    Person jeff = new Person("Jeff", 1990);
    Person ryan = new Person("Ryan", 2000);

    ArrayDeque<Person> ad = new ArrayDeque();

    ad.add(jeff);
    ad.add(ryan);
    ad.add(min);

    //When
    ad.addFirst(calvin);

    //Then
    Assert.assertTrue(ad.getFirst() == calvin);


}
    @Test
    public void ArrayDequeCloneTest() {
        //Given
        Person min = new Person("Min", 1996);
        Person calvin = new Person("Calvin", 1994);
        Person jeff = new Person("Jeff", 1990);
        Person ryan = new Person("Ryan", 2000);

        ArrayDeque<Person> ad = new ArrayDeque();
        ArrayDeque<Person> adNew = new ArrayDeque();

        ad.add(jeff);
        ad.add(ryan);
        ad.add(min);

        //When
        adNew = ad.clone();

        //Then
        Assert.assertTrue(adNew.containsAll(ad));


    }
    @Test
    public void ArrayDequeRemoveAllTest() {
        //Given
        Person min = new Person("Min", 1996);
        Person calvin = new Person("Calvin", 1994);
        Person jeff = new Person("Jeff", 1990);
        Person ryan = new Person("Ryan", 2000);

        ArrayDeque<Person> ad = new ArrayDeque();
        ArrayDeque<Person> adNew = new ArrayDeque();

        ad.add(jeff);
        ad.add(ryan);
        ad.add(min);

        adNew.add(jeff);
        adNew.add(min);

        //When
        ad.removeAll(adNew);

        //Then
        Assert.assertFalse(ad.contains(jeff) || ad.contains(min));


    }



}
