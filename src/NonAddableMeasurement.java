/*
To represent the non-addable measurements
 */


public class NonAddableMeasurement {

    private final double value;
    private final Unit unit;

    public NonAddableMeasurement(double value, Unit unit) {

        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {

        NonAddableMeasurement otherNonAddableMeasurement = (NonAddableMeasurement) obj;

        boolean sameValue = otherNonAddableMeasurement.unit.convertToBaseUnit(otherNonAddableMeasurement.value) == this.unit.convertToBaseUnit(this.value);

        return sameValue;
    }
}
