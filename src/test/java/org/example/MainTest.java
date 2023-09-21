package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void suma() {
        double num1 = 4;
        double num2 = 3;
        double resultado = Main.suma(num1, num2);
        assertEquals(7, resultado);
    }

    @Test
    void resta() {
        double num1 = -3;
        double num2 =  4;
        double resultado = Main.resta(num1, num2);
        assertEquals(-7, resultado);
    }

    @Test
    void multiplicacion() {
        double num1= 0;
        double num2= 0;
        double resultado = Main.multiplicacion(num1, num2);
        assertEquals(0, resultado);
    }

    @Test
    void division() {
       assertEquals(3,Main.division(9,3));
       assertThrows(ArithmeticException.class, () -> {
            Main.division(5,0);
        });
       assertEquals(-4, Main.division(-4,0));
    }

    @Test
    void numMayor() {
        assertEquals(3 , Main.numMayor(2,3));
        assertEquals(3, Main.numMayor(3,3));
        assertEquals(6, Main.numMayor(6, -3));
        assertEquals(4, Main.numMayor(-5, 4));
        assertEquals(2, Main.numMayor(2,-6));
        assertEquals(-1, Main.numMayor(-7,-1));
    }

    @Test
    void numMenor() {
        assertEquals(2 , Main.numMenor(2,3));
        assertEquals(3, Main.numMenor(3,3));
        assertEquals(-3, Main.numMenor(6, -3));
        assertEquals(-5, Main.numMenor(-5, 4));
        assertEquals(-6, Main.numMenor(2,-6));
        assertEquals(-7, Main.numMenor(-7,-1));

    }

    @Test
    void potencia() {
        assertEquals(4, Main.potencia(2,2));
        assertEquals(2,Main.potencia(2,1));
        assertEquals(1, Main.potencia(3,0));
        assertEquals(-27,Main.potencia(-3,3) );
        assertEquals(9, Main.potencia(-3,2));
        assertEquals(0, Main.potencia(0,3));
        assertEquals(0.125, Main.potencia(2,-3));
        assertEquals(-0.125, Main.potencia(-2,-3));
        assertEquals(4, Main.potencia(16, 0.5));
    }
    @Test
    void porcentaje() {
        assertEquals(25,Main.porcentaje(25,100) );
        assertEquals(100,Main.porcentaje(70,70));
        assertEquals(0, Main.porcentaje(0,50));
        assertThrows(ArithmeticException.class, () -> {
            Main.porcentaje(50,0);
        });
        assertThrows(ArithmeticException.class, () -> {
            Main.porcentaje(-30,50);
        });
        assertThrows(ArithmeticException.class, () -> {
            Main.porcentaje(50,-100);
        });

    }
}