/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cosas;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Borja
 */
public class ReservaTest {
    
    public ReservaTest() {
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
     * Test of setViv method, of class Reserva.
     */
    @Test
    public void testSetViv() {
        System.out.println("setViv");
        Object resviv = null;
        Reserva instance = null;
        instance.setViv(resviv);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getViv method, of class Reserva.
     */
    @Test
    public void testGetViv() {
        System.out.println("getViv");
        Reserva instance = null;
        Object expResult = null;
        Object result = instance.getViv();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInicio method, of class Reserva.
     */
    @Test
    public void testSetInicio() throws Exception {
        System.out.println("setInicio");
        String x = "";
        Reserva instance = null;
        instance.setInicio(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInicio method, of class Reserva.
     */
    @Test
    public void testGetInicio() {
        System.out.println("getInicio");
        Reserva instance = null;
        Date expResult = null;
        Date result = instance.getInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFinal method, of class Reserva.
     */
    @Test
    public void testSetFinal() throws Exception {
        System.out.println("setFinal");
        String x = "";
        Reserva instance = null;
        instance.setFinal(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFinal method, of class Reserva.
     */
    @Test
    public void testGetFinal() {
        System.out.println("getFinal");
        Reserva instance = null;
        Date expResult = null;
        Date result = instance.getFinal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImporte method, of class Reserva.
     */
    @Test
    public void testSetImporte() {
        System.out.println("setImporte");
        Reserva instance = null;
        instance.setImporte();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImporte method, of class Reserva.
     */
    @Test
    public void testGetImporte() {
        System.out.println("getImporte");
        Reserva instance = null;
        double expResult = 0.0;
        double result = instance.getImporte();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoPago method, of class Reserva.
     */
    @Test
    public void testSetTipoPago() {
        System.out.println("setTipoPago");
        String tipoPago = "";
        Reserva instance = null;
        instance.setTipoPago(tipoPago);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoPago method, of class Reserva.
     */
    @Test
    public void testGetTipoPago() {
        System.out.println("getTipoPago");
        Reserva instance = null;
        String expResult = "";
        String result = instance.getTipoPago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDetalles method, of class Reserva.
     */
    @Test
    public void testSetDetalles() {
        System.out.println("setDetalles");
        String detalles = "";
        Reserva instance = null;
        instance.setDetalles(detalles);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetalles method, of class Reserva.
     */
    @Test
    public void testGetDetalles() {
        System.out.println("getDetalles");
        Reserva instance = null;
        String expResult = "";
        String result = instance.getDetalles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodRerserva method, of class Reserva.
     */
    @Test
    public void testSetCodRerserva() {
        System.out.println("setCodRerserva");
        int codRerserva = 0;
        Reserva instance = null;
        instance.setCodRerserva(codRerserva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodRerserva method, of class Reserva.
     */
    @Test
    public void testGetCodRerserva() {
        System.out.println("getCodRerserva");
        Reserva instance = null;
        int expResult = 0;
        int result = instance.getCodRerserva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuracion method, of class Reserva.
     */
    @Test
    public void testSetDuracion() {
        System.out.println("setDuracion");
        Reserva instance = null;
        instance.setDuracion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuracion method, of class Reserva.
     */
    @Test
    public void testGetDuracion() {
        System.out.println("getDuracion");
        Reserva instance = null;
        long expResult = 0L;
        long result = instance.getDuracion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarReserva method, of class Reserva.
     */
    @Test
    public void testMostrarReserva() {
        System.out.println("mostrarReserva");
        Reserva instance = null;
        String expResult = "";
        String result = instance.mostrarReserva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
