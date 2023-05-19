package activities;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {
    static ArrayList<String> list;

    @BeforeEach
    public void setUp() throws Exception{
        list = new ArrayList<String>();
        list.add("alpha");
        list.add("beta");
    }
    @Test
    public void insertTest(){
        System.out.println(list);
        //Assertion for size of array
        assertEquals(2, list.size(), "Wrong size");
        list.add(2,"charlie");
        //assertEquals(3, list.size(), "new value added");
        // Assert with new elements
        assertEquals(3, list.size(), "Wrong size");

        // Assert individual elements
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("beta", list.get(1), "Wrong element");
        assertEquals("charlie", list.get(2), "Wrong element");
        
    }
    @Test
    public void replaceTest(){
        //assertion
        assertEquals(2, list.size(), "Wrong size");
        list.set(1, "gamma");
        //Assertion of new value
        assertEquals(2, list.size(), "Wrong size");
        //Assertion
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("gamma", list.get(1), "Wrong element");
    }

}
