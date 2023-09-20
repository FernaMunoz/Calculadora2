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
       //assertEquals(3,Main.division(9,3));
       assertThrows(ArithmeticException.class, () -> {
            Main.division(5,0);
        });
       //assertEquals(-4, Main.division(-4,0));
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
    }

    @Test
    void porcentaje() {
    }
}