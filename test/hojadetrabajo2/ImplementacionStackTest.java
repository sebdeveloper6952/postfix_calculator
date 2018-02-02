/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Arenas
 */
public class ImplementacionStackTest {
    
    public ImplementacionStackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of push method, of class ImplementacionStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        String element = "prueba";
        ImplementacionStack<String> instance = new ImplementacionStack();
        instance.push(element);
        String resultado = instance.pop();
        assertEquals(element,resultado);
         
    }

    /**
     * Test of pop method, of class ImplementacionStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        String element1 = "prueba1";
        String element2 = "prueba2";
        String element3 = "prueba3";
        ImplementacionStack<String> instance = new ImplementacionStack();
        instance.push(element1);
        instance.push(element2);
        instance.push(element3);
        String result = instance.pop();
        assertEquals(element3, result);
    }

    /**
     * Test of peek method, of class ImplementacionStack.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        String element = "elemento";
        ImplementacionStack<String> instance = new ImplementacionStack();
        instance.push(element);
        String result = instance.peek();
        assertEquals(element, result);
    }

    /**
     * Test of empty method, of class ImplementacionStack.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        ImplementacionStack instance = new ImplementacionStack();
        boolean expResult = true;
        boolean result = instance.empty();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of size method, of class ImplementacionStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ImplementacionStack<Integer> instance = new ImplementacionStack();
        for(int i = 0; i < 100000; i++)
        {
            instance.push(i);
        }
        assertEquals(100000, instance.size());
    }
    
}
