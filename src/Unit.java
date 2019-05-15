public enum Unit {
    KILOMETRE(100000,0, MeasurementType.LENGTH),
    METRE(100,0, MeasurementType.LENGTH),
    CENTIMETRE(1, 0,MeasurementType.LENGTH),
    GRAM(1,0, MeasurementType.WEIGHT),
    KILOGRAM(1000,0, MeasurementType.WEIGHT),
    CELSIUS(1.8,32, MeasurementType.TEMPERATURE),
    FAHRENHEIT(1,0, MeasurementType.TEMPERATURE);

    enum MeasurementType {
        LENGTH,
        WEIGHT,
        TEMPERATURE
    }

    private final double coefficient;
    private final double constant;
    private final MeasurementType type;

    Unit(double coefficient, double constant, MeasurementType type) {
        this.coefficient = coefficient;
        this.constant = constant;
        this.type = type;
    }

    public double convertToBaseUnit(double value) {
        return value * this.coefficient + this.constant;
    }

    public double convertToUnit(double sumOfTwoMeasurements) {
        return (sumOfTwoMeasurements - this.constant) / this.coefficient;
    }

    public boolean compareUnit(Unit unit) {
        if( this.type == unit.type )
            return true;
        throw new IncompatibleUnitTypeException();
    }

}
