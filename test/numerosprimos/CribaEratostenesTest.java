/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package numerosprimos;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergio GB
 */
public class CribaEratostenesTest {
    
    public CribaEratostenesTest() {
    }

    /**
     * Test de generarPrimos, se recibe 0 como parámetro
     */
    @Test
    public void testGenerarPrimos1() {
        int[] arrayEsperado = new int[0]; // El array que se espera obtener
        int[] arrayRecibido = numerosprimos.CribaEratostenes.generarPrimos(0); // El array que se obtiene mediante el método
        System.out.println("Prueba para cuando el método generarPrimos recibe 0 como parámetro.");
        assertArrayEquals(arrayEsperado,arrayRecibido); // Se usa assertArrayEquals para comparar los arrays
    }
    
    /**
     * Test de generarPrimos, se recibe 2 como parámetro
     */
    @Test
    public void testGenerarPrimos2() {
        int[] arrayEsperado = {2}; // El array que se espera obtener
        int[] arrayRecibido = numerosprimos.CribaEratostenes.generarPrimos(2); // El array que se obtiene mediante el método
        System.out.println("Prueba para cuando el método generarPrimos recibe 2 como parámetro.");
        assertArrayEquals(arrayEsperado,arrayRecibido); // Se usa assertArrayEquals para comparar los arrays
    }
    
    /**
     * Test de generarPrimos, se recibe 3 como parámetro
     */
    @Test
    public void testGenerarPrimos3() {
        int[] arrayEsperado = {2,3}; // El array que se espera obtener
        int[] arrayRecibido = numerosprimos.CribaEratostenes.generarPrimos(3); // El array que se obtiene mediante el método
        System.out.println("Prueba para cuando el método generarPrimos recibe 3 como parámetro.");
        assertArrayEquals(arrayEsperado,arrayRecibido); // Se usa assertArrayEquals para comparar los arrays
    }
    
    /**
     * Test de generarPrimos, se recibe 100 como parámetro
     */
    @Test
    public void testGenerarPrimos4() {
        int[] arrayEsperado = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97}; // El array que se espera obtener
        int[] arrayRecibido = numerosprimos.CribaEratostenes.generarPrimos(100); // El array que se obtiene mediante el método
        System.out.println("Prueba para cuando el método generarPrimos recibe 100 como parámetro.");
        assertArrayEquals(arrayEsperado,arrayRecibido); // Se usa assertArrayEquals para comparar los arrays
    }
    
}
