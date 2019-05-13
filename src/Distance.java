/*
To represent the distance quanitity
 */

public class Distance {

    private final double value;
    private final Unit unit;

    public Distance(double value, Unit unit) {

        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {

        Distance otherDistance = (Distance) obj;

        double thisConvertedValue = 0.0;

        switch (otherDistance.unit) {
            case CENTIMETRE:
                thisConvertedValue = this.unit.convertToCentimetre(this.value, this.unit);
                break;

            case METRE:
                thisConvertedValue = this.unit.convertToMetre(this.value, this.unit);
                break;

            default:
                thisConvertedValue = this.unit.convertToKilometre(this.value, this.unit);
                break;
        }

        return thisConvertedValue == otherDistance.value;
    }
}
