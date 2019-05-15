import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest {
    @Test
    public void equals_ShouldReturnTrue_when1MAnd100CmIsCompared() {
        AddableMeasurement metre = new AddableMeasurement(1, Unit.METRE);
        AddableMeasurement centimetre = new AddableMeasurement(100, Unit.CENTIMETRE);

        assertEquals(metre, centimetre);
    }

    @Test
    public void equals_ShouldReturnTrue_when100CmAnd1MIsCompared() {
        AddableMeasurement centimetre = new AddableMeasurement(1, Unit.METRE);
        AddableMeasurement metre = new AddableMeasurement(100, Unit.CENTIMETRE);

        assertEquals(centimetre, metre);
    }

    @Test
    public void equals_ShouldReturnTrue_when1KmAnd1000MIsCompared() {
        AddableMeasurement kilometre = new AddableMeasurement(1, Unit.KILOMETRE);
        AddableMeasurement metre = new AddableMeasurement(1000, Unit.METRE);

        assertEquals(kilometre, metre);
    }

    @Test
    public void equals_ShouldReturnTrue_when1000MAnd1KmIsCompared() {
        AddableMeasurement kilometre = new AddableMeasurement(1, Unit.KILOMETRE);
        AddableMeasurement metre = new AddableMeasurement(1000, Unit.METRE);

        assertEquals(metre, kilometre);
    }

    @Test
    public void equals_ShouldReturnTrue_when100000CmAnd1KmIsCompared() {
        AddableMeasurement kilometre = new AddableMeasurement(1, Unit.KILOMETRE);
        AddableMeasurement centimetre = new AddableMeasurement(100000, Unit.CENTIMETRE);

        assertEquals(centimetre, kilometre);
    }

    @Test
    public void equals_ShouldReturnTrue_when1KmAnd100000CmIsCompared() {
        AddableMeasurement kilometre = new AddableMeasurement(1, Unit.KILOMETRE);
        AddableMeasurement centimetre = new AddableMeasurement(100000, Unit.CENTIMETRE);

        assertEquals(kilometre, centimetre);
    }

    @Test
    public void equals_ShouldReturnTrue_whenHalfKmAnd50000CmIsCompared() {
        AddableMeasurement kilometre = new AddableMeasurement(0.5, Unit.KILOMETRE);
        AddableMeasurement centimetre = new AddableMeasurement(50000, Unit.CENTIMETRE);

        assertEquals(kilometre, centimetre);
    }

    @Test
    public void equals_ShouldReturnTrue_when10CmAnd10CmIsCompared() {
        AddableMeasurement kilometre = new AddableMeasurement(10, Unit.CENTIMETRE);
        AddableMeasurement centimetre = new AddableMeasurement(10, Unit.CENTIMETRE);

        assertEquals(kilometre, centimetre);
    }

    @Test
    public void equals_ShouldReturnTrue_when1000GramAnd1KilogramIsCompared() {
        AddableMeasurement gram = new AddableMeasurement(1000, Unit.GRAM);
        AddableMeasurement kilogram = new AddableMeasurement(1, Unit.KILOGRAM);

        assertEquals(gram, kilogram);
    }

    @Test
    public void equals_ShouldReturnTrue_when1KilogramAnd1GramIsCompared() {
        AddableMeasurement gram = new AddableMeasurement(1000, Unit.GRAM);
        AddableMeasurement kilogram = new AddableMeasurement(1, Unit.KILOGRAM);

        assertEquals(kilogram, gram);
    }

    @Test(expected = RuntimeException.class)
    public void equals_ShouldReturnFalse_when1GramAnd1CentimetreIsCompared() {
        AddableMeasurement gram = new AddableMeasurement(1, Unit.GRAM);
        AddableMeasurement centimetre = new AddableMeasurement(1, Unit.CENTIMETRE);

        centimetre.equals(gram);
    }

    @Test(expected = RuntimeException.class)
    public void equals_ShouldReturnFalse_when1KilogramAnd1CentimetreIsCompared() {
        AddableMeasurement kilogram = new AddableMeasurement(1, Unit.KILOGRAM);
        AddableMeasurement centimetre = new AddableMeasurement(1, Unit.CENTIMETRE);

        centimetre.equals(kilogram);
    }

    @Test(expected = RuntimeException.class)
    public void equals_shouldThrowException_whenInputTypeAreDifferent() {
        AddableMeasurement kilogram = new AddableMeasurement(1, Unit.KILOGRAM);
        AddableMeasurement centimetre = new AddableMeasurement(1, Unit.CENTIMETRE);

        kilogram.equals(centimetre);

    }

    @Test(expected = RuntimeException.class)
    public void equals_shouldThrowException_whenKgAndNullAreCompared() {
        AddableMeasurement kilogram = new AddableMeasurement(1, Unit.KILOGRAM);


        kilogram.equals(null);

    }

}
