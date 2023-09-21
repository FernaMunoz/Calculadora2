import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraGeometricaTest {

    @Test
    public void calculadoraCuadrado() {
        String input = "-5.0";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Scanner scanner = new Scanner(System.in);

        try {
            CalculadoraCuadrado.CalculadoraCuadrado(scanner);
            fail("Se esperaba que lanzara una excepción IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("El lado no puede ser negativo", e.getMessage());
        }
    }

    @Test
    void calculadoraRectangulo() {

    }

    @Test
    public void circuloCalculadora() {
        String input = "-5.0";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);

        try {
            CirculoCalculadora.CirculoCalculadora(scanner);
            fail("Se esperaba que lanzara una excepción IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("El radio no puede ser negativo", e.getMessage());
    }

    @Test
    void esferaCalculadora() {

        }
    }

    @Test
    void cuboCalculadora() {
    }

    @Test
    void conoCalculadora() {
    }
}