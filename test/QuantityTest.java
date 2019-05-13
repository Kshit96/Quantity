import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QuantityTest {
    @Test
    public void equals_ShouldReturnTrue_when1MAnd100CmIsCompared(){
        Distance metre = new Distance(1, Unit.METRE);
        Distance centimetre = new Distance(100, Unit.CENTIMETRE);

        assertEquals(metre,centimetre);
    }

    @Test
    public void equals_ShouldReturnTrue_when100CmAnd1MIsCompared(){
        Distance centimetre = new Distance(1, Unit.METRE);
        Distance metre = new Distance(100, Unit.CENTIMETRE);

        assertEquals(centimetre,metre);
    }

    @Test
    public void equals_ShouldReturnTrue_when1KmAnd1000MIsCompared(){
        Distance kilometre = new Distance(1, Unit.KILOMETRE);
        Distance metre = new Distance(1000, Unit.METRE);

        assertEquals(kilometre,metre);
    }

    @Test
    public void equals_ShouldReturnTrue_when1000MAnd1KmIsCompared(){
        Distance kilometre = new Distance(1, Unit.KILOMETRE);
        Distance metre = new Distance(1000, Unit.METRE);

        assertEquals(metre,kilometre);
    }

    @Test
    public void equals_ShouldReturnTrue_when100000CmAnd1KmIsCompared(){
        Distance kilometre = new Distance(1, Unit.KILOMETRE);
        Distance centimetre = new Distance(100000, Unit.CENTIMETRE);

        assertEquals(centimetre,kilometre);
    }

    @Test
    public void equals_ShouldReturnTrue_when1KmAnd100000CmIsCompared(){
        Distance kilometre = new Distance(1, Unit.KILOMETRE);
        Distance centimetre = new Distance(100000, Unit.CENTIMETRE);

        assertEquals(kilometre,centimetre);
    }

    @Test
    public void equals_ShouldReturnTrue_whenHalfKmAnd50000CmIsCompared(){
        Distance kilometre = new Distance(0.5, Unit.KILOMETRE);
        Distance centimetre = new Distance(50000, Unit.CENTIMETRE);

        assertEquals(kilometre,centimetre);
    }

    @Test
    public void equals_ShouldReturnTrue_when10CmAnd10CmIsCompared(){
        Distance kilometre = new Distance(10, Unit.CENTIMETRE);
        Distance centimetre = new Distance(10, Unit.CENTIMETRE);

        assertEquals(kilometre,centimetre);
    }
}
