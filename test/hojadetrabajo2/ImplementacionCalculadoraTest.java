package hojadetrabajo2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Sebastian Arriola 11463
 * @author Fernando Figueroa 14175
 * @author Jose Andres Arenas 14470
 */
public class ImplementacionCalculadoraTest 
{
    
    public ImplementacionCalculadoraTest() 
    {
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
    }
    
    @AfterClass
    public static void tearDownClass() 
    {
    }
    
    @Before
    public void setUp() 
    {
    }
    
    @After
    public void tearDown() 
    {
    }

    /**
     * Prueba de una expresion correcta.
     */
    @Test
    public void testCalcular() 
    {
        System.out.println("Test calcular() con operacion valida.");
        String expresion = "1 2 + 4 * 3 +";
        ImplementacionCalculadora instance = new ImplementacionCalculadora();
        String expResult = "15.0";
        String result = instance.calcular(expresion);
        assertEquals(expResult, result);
    }
    
    /**
     * Prueba para verificar division por cero.
     */
    @Test
    public void testCalcular1()
    {
        System.out.println("Test calcular() con division por cero.");
        String expresion = "0 8 /";
        ImplementacionCalculadora instance = new ImplementacionCalculadora();
        String expResult = "ERROR: division por cero detectada.";
        String result = instance.calcular(expresion);
        assertEquals(expResult, result);
    }
    
    /**
     * Prueba para una expresion que contiene caracteres invalidos.
     */
    @Test
    public void testCalcular2()
    {
        System.out.println("Test calcular() con una expresion invalida.");
        String expresion = "LOLOLOLOLOL";
        ImplementacionCalculadora instance = new ImplementacionCalculadora();
        String expResult = "ERROR: operandos insuficientes.";
        String result = instance.calcular(expresion);
        assertEquals(expResult, result);
    }   
}
