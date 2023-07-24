package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class HashSetTest {

    @Test
    public void hashSetDuplicationTest() {
        //Given
        HashSet hs = new HashSet();
        hs.add("ryan");
        hs.add("calvin");
        hs.add("ryan");

        //When
        int expectedSize = 2;
        int actualSize = hs.size();

        //Then
        Assert.assertEquals(expectedSize, actualSize);

    }

    @Test
    public void hashSetCloneTest() {
        //Given
        HashSet hs = new HashSet();
        hs.add("ryan");
        hs.add("calvin");

        //When
        hs.clear();

        //Then
        Assert.assertTrue(hs.size() == 0);

    }


}
