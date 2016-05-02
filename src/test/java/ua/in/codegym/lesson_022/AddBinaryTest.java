package ua.in.codegym.lesson_022;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddBinaryTest {

    @Test
    public void testAdd() throws Exception {
        String a = "101";
        String b = "100";

        String actual = AddBinary.add(a,b);
        assertEquals("1001", actual);
    }

    @Test
    public void testAdd2() throws Exception {
        String a = "10000000000000000000000000000000";
        String b = "10000000000000000000000000000000";

        String actual = AddBinary.add(a,b);
        assertEquals("100000000000000000000000000000000", actual);
    }


}