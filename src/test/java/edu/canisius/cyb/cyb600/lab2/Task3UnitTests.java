package edu.canisius.cyb.cyb600.lab2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;


public class Task3UnitTests {
    private Task3 task3;

    @Before
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void setUp() {
        this.task3 = new Task3();
    }

    @Test
    public void test_removeDuplicates_best(){
        String parameter1 = "software";
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("a", "r", "s", "t", "e", "f", "w", "o"));
        ArrayList<String> result=task3.removeDuplicates(parameter1);
        assertEquals("Expected: ",expected,result );
    }

    @Test
    public void test_removeDuplicates_average(){
        String parameter2 = "cybersecurity";
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("b","r","c","s","t","e","u","y","i"));
        ArrayList<String> result=task3.removeDuplicates(parameter2);
        assertEquals("Expected: ",expected, task3.removeDuplicates(parameter2));
    }

    @Test
    public void test_removeDuplicates_worst(){
        String parameter3 = "nnnnnnnnnnnnnnnnnnnnnn";
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("n"));
        ArrayList<String> result=task3.removeDuplicates(parameter3);
        assertEquals("Expected: ",expected, task3.removeDuplicates(parameter3));

    }

    @Test
    public void test_areTheseAnagrams_best(){
        assertTrue(task3.areTheseAnagrams("tac","cat"));
        assertFalse(task3.areTheseAnagrams("tic","tac"));
    }

    @Test
    public void test_areTheseAnagrams_average(){
        assertTrue(task3.areTheseAnagrams("java", "jvaa"));
        assertTrue(task3.areTheseAnagrams("javascript", "scriptjava"));
        assertFalse(task3.areTheseAnagrams("nonsense", "noworld"));

    }

    @Test
    public void test_areTheseAnagrams_worst(){
        assertTrue(task3.areTheseAnagrams("dormitory", "dirtyroom"));
        assertFalse(task3.areTheseAnagrams(null, "really long word"));

    }

}
