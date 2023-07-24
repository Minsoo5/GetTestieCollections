package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    @Test
    public void linkedListRemoveLastOccurrenceTest() {
        //Given
        Person min = new Person("Min", 1996);
        Person calvin = new Person("Calvin", 1994);
        Person ryan = new Person("Ryan", 2000);

        LinkedList<Person> ll = new LinkedList();

        ll.add(ryan);
        ll.add(min);
        ll.add(ryan);
        ll.add(calvin);
        ll.add(ryan);

        //When
        ll.removeLastOccurrence(ryan);

        int expectedIndex = 2;
        int actualIndex = ll.lastIndexOf(ryan);


        //Then
        Assert.assertTrue(expectedIndex == actualIndex);

    }

    @Test
    public void linkedListAddFirstTest() {
        //Given
        Person min = new Person("Min", 1996);
        Person calvin = new Person("Calvin", 1994);
        Person ryan = new Person("Ryan", 2000);

        LinkedList<Person> ll = new LinkedList();

        ll.add(ryan);
        ll.add(min);
        ll.add(ryan);


        //When
        ll.addFirst(calvin);

        Person expectedPerson = calvin;
        Person actualPerson = ll.getFirst();

        //Then
        Assert.assertTrue(expectedPerson == actualPerson);

    }
    @Test
    public void linkedListPopTest() {
        //Given
        Person min = new Person("Min", 1996);
        Person calvin = new Person("Calvin", 1994);
        Person ryan = new Person("Ryan", 2000);

        LinkedList<Person> ll = new LinkedList();

        ll.add(ryan);
        ll.add(min);
        ll.add(ryan);
        ll.add(calvin);

        //When
        ll.pop();

        //Then
        Assert.assertTrue(ll.getFirst() == min);

    }


}
