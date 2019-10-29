package zajecia2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class GeometriaTest {}

class PunktTest {
    @Test
    void testDefaultConstructor() {
        Punkt punkt = new Punkt();

        assertEquals(punkt.getX(), 0.0, 0.001);
        assertEquals(punkt.getY(), 0.0, 0.001);
    }

    @Test
    void testCustomDataConstructor() {
        Random random = new Random();
        double x = random.nextDouble();
        double y = random.nextDouble();
        Punkt punkt = new Punkt(x, y);

        assertEquals(punkt.getX(), x, 0.001);
        assertEquals(punkt.getY(), y, 0.001);
    }

    @Test
    void testShiftMethod() {
        Random random = new Random();
        double x = random.nextDouble();
        double y = random.nextDouble();
        double shift = random.nextInt();
        Punkt punkt = new Punkt(x, y);
;
        punkt.shift(shift, shift);

        assertEquals(punkt.getX(), x+shift, 0.001);
        assertEquals(punkt.getY(), y+shift, 0.001);
    }
}
