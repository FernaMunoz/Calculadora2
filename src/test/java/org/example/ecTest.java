package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ecTest {

    @Test
    void calcular_pendiente() {

        double x1 = 1;
        double y1 = 3;
        double x2 = 5;
        double y2 = 4;
        double pendiente = ec.Calcular_pendiente(x1, y1, x2, y2);
        assertEquals(0.25, pendiente);
    }
    @Test
    void calcular_b() {
        double x = 6;
        double y = 3;
        double pendiente = 2;
        double b = ec.Calcular_b(x, y, pendiente);
        assertEquals(2, b );
    }
}