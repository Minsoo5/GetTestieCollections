package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {
    @Test
    public void vectorDynamicSizeTest() {
        //Given
        Person min = new Person("Min", 1996);
        Person calvin = new Person("Calvin", 1994);
        Person jeff = new Person("Jeff", 1990);
        Person ryan = new Person("Ryan", 2000);
        Vector<Person> vec = new Vector<>();

        vec.addElement(min);
        vec.addElement(ryan);

        //When
        int preAddVecSize = vec.size();
        vec.add(jeff);
        int postAddVecSize = vec.size();

        //Then
        Assert.assertTrue(preAddVecSize < postAddVecSize);

    }

    @Test
    public void vectorIndexOfTest() {
        //Given
        Person min = new Person("Min", 1996);
        Person calvin = new Person("Calvin", 1994);
        Person jeff = new Person("Jeff", 1990);
        Person ryan = new Person("Ryan", 2000);
        Vector<Person> vec = new Vector<>();

        vec.addElement(min);
        vec.addElement(ryan);

        //When
        int preAddIndex = vec.indexOf(min);
        vec.add(0, jeff);
        int postAddIndex = vec.indexOf(min);

        //Then
        Assert.assertTrue(preAddIndex != postAddIndex);

    }
    @Test
    public void vectorClearTest() {
        //Given
        Person min = new Person("Min", 1996);
        Person calvin = new Person("Calvin", 1994);
        Person jeff = new Person("Jeff", 1990);
        Person ryan = new Person("Ryan", 2000);
        Vector<Person> vec = new Vector<>();

        vec.addElement(min);
        vec.addElement(ryan);

        //When
        vec.clear();

        //Then
        Assert.assertTrue(vec.isEmpty());

    }
}
