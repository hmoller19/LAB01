/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Se probó todos los métodos importantes. Como mencionado en clase, no se necesitan probar sets y gets.

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Héctor
 */
public class RadioTest {
    
    public RadioTest() {
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
     * Test of cambiarFrecuencia method, of class Radio.
     */
    @Test
    public void testCambiarFrecuencia() {
        System.out.println("cambiarFrecuencia");
        boolean frecuencia = false;
        Radio instance = new Radio(true,true,530);
        instance.cambiarFrecuencia(frecuencia);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sacar method, of class Radio.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        int boton = 1;
        Radio instance = new Radio(true,true,1000);
        double expResult = 0;
        double result = instance.sacar(boton);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of apagar method, of class Radio.
     */
    @Test
    public void testApagar() {
        System.out.println("apagar");
        Radio instance = new Radio(true,true,530);
        instance.apagar();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of encender method, of class Radio.
     */
    @Test
    public void testEncender() {
        System.out.println("encender");
        Radio instance = new Radio(false,true,530);
        instance.encender();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of guardar method, of class Radio.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        int boton = 1;
        double estacion = 600;
        Radio instance = new Radio(true,true,530);
        instance.guardar(boton, estacion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of subirEstacion method, of class Radio.
     */
    @Test
    public void testSubirEstacion() {
        System.out.println("subirEstacion");
        Radio instance = new Radio(true,true,530);
        double expResult = 540;
        double result = instance.subirEstacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        //Se probó el método de subir estación.
    }

    /**
     * Test of bajarEstacion method, of class Radio.
     */
    @Test
    public void testBajarEstacion() {
        System.out.println("bajarEstacion");
        Radio instance = new Radio(true,true,530);
        double expResult = 1610;
        double result = instance.bajarEstacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        //Se probó bajando estación, para ver si se respetaba el intervalo. 
    }
    

    /**
     * Test of getFrecuencia method, of class Radio.
     */
//    @Test
//    public void testGetFrecuencia() {
//        System.out.println("getFrecuencia");
//        Radio instance = new Radio();
//        boolean expResult = false;
//        boolean result = instance.getFrecuencia();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEncendido method, of class Radio.
//     */
//    @Test
//    public void testGetEncendido() {
//        System.out.println("getEncendido");
//        Radio instance = new Radio();
//        boolean expResult = false;
//        boolean result = instance.getEncendido();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEstacionAM method, of class Radio.
//     */
//    @Test
//    public void testGetEstacionAM() {
//        System.out.println("getEstacionAM");
//        Radio instance = new Radio();
//        double expResult = 0.0;
//        double result = instance.getEstacionAM();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEstacionFM method, of class Radio.
//     */
//    @Test
//    public void testGetEstacionFM() {
//        System.out.println("getEstacionFM");
//        Radio instance = new Radio();
//        double expResult = 0.0;
//        double result = instance.getEstacionFM();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isOn method, of class Radio.
//     */
//    @Test
//    public void testIsOn() {
//        System.out.println("isOn");
//        Radio instance = new Radio();
//        boolean expResult = false;
//        boolean result = instance.isOn();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setOn method, of class Radio.
//     */
//    @Test
//    public void testSetOn() {
//        System.out.println("setOn");
//        boolean on = false;
//        Radio instance = new Radio();
//        instance.setOn(on);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isBandaAM method, of class Radio.
//     */
//    @Test
//    public void testIsBandaAM() throws Exception {
//        System.out.println("isBandaAM");
//        Radio instance = new Radio();
//        boolean expResult = false;
//        boolean result = instance.isBandaAM();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setBandaAM method, of class Radio.
//     */
//    @Test
//    public void testSetBandaAM() throws Exception {
//        System.out.println("setBandaAM");
//        boolean bandaAM = false;
//        Radio instance = new Radio();
//        instance.setBandaAM(bandaAM);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getValorFrecuencia method, of class Radio.
//     */
//    @Test
//    public void testGetValorFrecuencia() throws Exception {
//        System.out.println("getValorFrecuencia");
//        Radio instance = new Radio();
//        double expResult = 0.0;
//        double result = instance.getValorFrecuencia();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setValorFrecuencia method, of class Radio.
//     */
//    @Test
//    public void testSetValorFrecuencia() throws Exception {
//        System.out.println("setValorFrecuencia");
//        double valorFrecuencia = 0.0;
//        Radio instance = new Radio();
//        instance.setValorFrecuencia(valorFrecuencia);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setBotonFavoritoAM method, of class Radio.
//     */
//    @Test
//    public void testSetBotonFavoritoAM() throws Exception {
//        System.out.println("setBotonFavoritoAM");
//        double valorFrecuencia = 0.0;
//        int boton = 0;
//        Radio instance = new Radio();
//        instance.setBotonFavoritoAM(valorFrecuencia, boton);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setBotonFavoritoFM method, of class Radio.
//     */
//    @Test
//    public void testSetBotonFavoritoFM() throws Exception {
//        System.out.println("setBotonFavoritoFM");
//        double valorFrecuencia = 0.0;
//        int boton = 0;
//        Radio instance = new Radio();
//        instance.setBotonFavoritoFM(valorFrecuencia, boton);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
