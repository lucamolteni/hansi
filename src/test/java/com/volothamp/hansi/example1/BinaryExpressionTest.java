package com.volothamp.hansi.example1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class BinaryExpressionTest {

    @Test
    public void binaryExpressionTest () throws Exception {

        assertEquals(6, new BinaryExpression(2).add(4));
        assertEquals(8, new BinaryExpression(2).mulitply(4));

        assertEquals(6, new BinaryExpressionAdd(2).add(4));
        assertEquals(8, new BinaryExpressionMultiply(2).multiply(4));


    }

}