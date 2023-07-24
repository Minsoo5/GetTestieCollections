package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @org.junit.Test
    public void StackPopTest() {
        //Given
        Stack<String> stack = new Stack<>();
        stack.add("Hi");
        stack.add("Hello");
        stack.add("Hey");

        //When
        stack.pop();
        String expectedString = "Hello";
        String actualString = stack.lastElement();


        //Then
        Assert.assertEquals(expectedString, actualString);
    }

    @org.junit.Test
    public void StackPushTest() {
        //Given
        Stack<String> stack = new Stack<>();
        stack.add("Hi");
        stack.add("Hello");
        stack.add("Hey");

        //When
        stack.push("Hola");
        String expectedString = "Hola";
        String actualString = stack.lastElement();


        //Then
        Assert.assertEquals(expectedString, actualString);
    }

    @org.junit.Test
    public void StackContainsTrueTest() {
        //Given
        Stack<String> stack = new Stack<>();
        stack.add("Hi");
        stack.add("Hello");
        stack.add("Hey");

        //When

        //Then
        Assert.assertTrue(stack.contains("Hello"));
    }
    @org.junit.Test
    public void StackContainsFalseTest() {
        //Given
        Stack<String> stack = new Stack<>();
        stack.add("Hi");
        stack.add("Hello");
        stack.add("Hey");

        //When

        //Then
        Assert.assertFalse(stack.contains("Hola"));
    }




    // Make a bigger test exercising more Stack methods.....
}
