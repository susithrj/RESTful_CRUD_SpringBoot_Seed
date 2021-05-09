package com.susithrj.util;

import com.susithrj.uril.MathUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    MathUtils mathUtils = new MathUtils();
    @Test
    void sum() {


            int expected = 2 ;
            int actual = mathUtils.sum(1,1);
            assertEquals(expected,actual);
            System.out.println("this test ran");


    }

    @Test
    void subtract() {
        int expected = 2 ;
        int actual = mathUtils.subtract(4,2);
        assertEquals(expected,actual);
        System.out.println("this test ran");
    }

    @Test
    void multiply() {
        int expected = 2 ;
        int actual = mathUtils.multiply(1,2);
        assertEquals(expected,actual);
        System.out.println("this test ran");
    }

    @Test
    void testMultiply() {
        assertAll(
                () -> assertEquals(0, mathUtils.multiply(1, 0)),
                () -> assertEquals(1, mathUtils.multiply(1, 1)),
                () -> assertEquals(6, mathUtils.multiply(2, 3))
        );
    }

    @Test
    void divide() {
        int expected = 2 ;
        int actual = mathUtils.divide(4,2);
        assertEquals(expected,actual);
        System.out.println("this test ran");

    }

    @Test
    void computeCircleArea() {
        double expected = 153.93804002589985;
        double actual = mathUtils.computeCircleArea(7);
        assertEquals(expected,actual);
        System.out.println("this test ran");

    }
}
