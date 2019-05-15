import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddableMeasurementTest {

    @Test
    public void equals_ShouldReturnTrue_when100CentimetrePlus1MetreAnd200CentimetreIsCompared() {

        AddableMeasurement centimetre = new AddableMeasurement(100, Unit.CENTIMETRE);
        AddableMeasurement metre = new AddableMeasurement(1, Unit.METRE);

        AddableMeasurement actual = centimetre.add(metre);
        AddableMeasurement expectedAddableMeasurement = new AddableMeasurement(200, Unit.CENTIMETRE);

        assertEquals(expectedAddableMeasurement, actual);
    }

    @Test
    public void equals_ShouldReturnTrue_when1MetrePlus100CentimetreAnd200CentimetreIsCompared() {

        AddableMeasurement centimetre = new AddableMeasurement(100, Unit.CENTIMETRE);
        AddableMeasurement metre = new AddableMeasurement(1, Unit.METRE);

        AddableMeasurement actual = metre.add(centimetre);
        AddableMeasurement expectedAddableMeasurement = new AddableMeasurement(2, Unit.METRE);

        assertEquals(expectedAddableMeasurement, actual);
    }

    @Test
    public void equals_ShouldReturnTrue_when1KilometrePlus100MetreAnd1Point1KilometreIsCompared() {

        AddableMeasurement metre = new AddableMeasurement(100, Unit.METRE);
        AddableMeasurement kilometre = new AddableMeasurement(1, Unit.KILOMETRE);

        AddableMeasurement actual = kilometre.add(metre);
        AddableMeasurement expectedAddableMeasurement = new AddableMeasurement(1.1, Unit.KILOMETRE);

        assertEquals(expectedAddableMeasurement, actual);
    }

    @Test
    public void equals_ShouldReturnTrue_when1KilometreMinus100MetreAndPoint9KilometreIsCompared() {

        AddableMeasurement metre = new AddableMeasurement(100, Unit.METRE);
        AddableMeasurement kilometre = new AddableMeasurement(1, Unit.KILOMETRE);

        AddableMeasurement actual = kilometre.subtract(metre);
        AddableMeasurement expectedAddableMeasurement = new AddableMeasurement(0.9, Unit.KILOMETRE);

        assertEquals(expectedAddableMeasurement, actual);
    }

}
