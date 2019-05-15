/*
To represent the addable measurements
 */

public class AddableMeasurement implements Addable {

    private final double value;
    private final Unit unit;

    public AddableMeasurement(double value, Unit unit) {

        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) throws UnsupportedOperationException{

        AddableMeasurement otherAddableMeasurement = (AddableMeasurement) obj;

        boolean sameValue = otherAddableMeasurement.unit.convertToBaseUnit(otherAddableMeasurement.value) == this.unit.convertToBaseUnit(this.value);
        boolean sameUnit = this.unit.compareUnit(otherAddableMeasurement.unit);

        return sameValue;
    }

    public int measurementType(Unit unit) {

        if (unit.toString().contains("METRE")) {
            return 1;
        }
        return 0;
    }

    public AddableMeasurement add(AddableMeasurement addableMeasurementToBeAdded) {

        double thisValueInBaseUnit = this.unit.convertToBaseUnit(this.value);
        double valueToAddInBaseUnit = addableMeasurementToBeAdded.unit.convertToBaseUnit(addableMeasurementToBeAdded.value);

        double sumOfTwoMeasurements = thisValueInBaseUnit + valueToAddInBaseUnit;
        double sumInCorrectUnit = this.unit.convertToUnit(sumOfTwoMeasurements);

        return new AddableMeasurement(sumInCorrectUnit, this.unit);
    }

    public AddableMeasurement subtract(AddableMeasurement addableMeasurementToBeSubtracted) {

        double thisValueInBaseUnit = this.unit.convertToBaseUnit(this.value);
        double valueToAddInBaseUnit = addableMeasurementToBeSubtracted.unit.convertToBaseUnit(addableMeasurementToBeSubtracted.value);

        double sumOfTwoMeasurements = thisValueInBaseUnit - valueToAddInBaseUnit;
        double sumInCorrectUnit = this.unit.convertToUnit(sumOfTwoMeasurements);

        return new AddableMeasurement(sumInCorrectUnit, this.unit);
    }
}
