package org.example;
import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.example.TddArray.impares;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PruebasTDD {

    @BeforeAll
    public static void setUpClass() {
        //E.G - Prepare/create the database
        System.out.println("WELCOME TO MY TESTS");
    }

    @AfterAll
    public static void tearDownClass() {
        //E.G - Delete the database
        System.out.println("BYE BYE");
    }

    @BeforeEach
    public void setUp() {
        //E.G - Create a bunch of math data to test
        //calculator = new Calculator();
        System.out.println("@BeforeEach - executed before each of the tests");
    }

    @AfterEach
    public void tearDown() {
        //E.G - Delete these math data used for the tests
        System.out.println("@AfterEach - executed after each of the tests");
    }

    @Test
    @DisplayName("Testing impares()")
    void impares_positiveNumbers_Ok() {
        int [] expected = {1,3,5};
        int [] result = TddArray.impares(5);
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Testing impares con numeros negativos()")
    void impares_negatives() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> TddArray.impares(-3));
        Assertions.assertThrows(IllegalArgumentException.class, () -> TddArray.impares(-10));
    }

    @Test
    @DisplayName("Testing impares con un solo valor()")
            void impares_oneValue(){
    int [] expected = {1};
    int [] result = TddArray.impares(1);
        assertArrayEquals(expected, result);
    }

}
