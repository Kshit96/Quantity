import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonAddableMeasurementTest {
    @Test
    public void equals_ShouldReturnTrue_when100CelsiusAnd212FahrenheitIsCompared() {

        NonAddableMeasurement celsius = new NonAddableMeasurement(100, Unit.CELSIUS);
        NonAddableMeasurement fahrenheit = new NonAddableMeasurement(212, Unit.FAHRENHEIT);

        assertEquals(celsius, fahrenheit);
    }

    @Test
    public void equals_ShouldReturnTrue_when212FahrenheitAnd100CelsiusIsCompared() {

        NonAddableMeasurement celsius = new NonAddableMeasurement(100, Unit.CELSIUS);
        NonAddableMeasurement fahrenheit = new NonAddableMeasurement(212, Unit.FAHRENHEIT);

        assertEquals(fahrenheit, celsius);
    }

    @Test
    public void equals_ShouldReturnTrue_when10CelsiusAnd100CelsiusIsCompared() {

        NonAddableMeasurement celsius = new NonAddableMeasurement(100, Unit.CELSIUS);
        NonAddableMeasurement anothercelsius = new NonAddableMeasurement(100, Unit.CELSIUS);

        assertEquals(anothercelsius, celsius);
    }
}
