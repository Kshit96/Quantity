public enum Unit {
    KILOMETRE,
    METRE,
    CENTIMETRE;

    double convertToCentimetre(double value, Unit unit) {
        if (unit == Unit.METRE) {
            return value * 100;
        }
        if (unit == Unit.KILOMETRE) {
            return value * 100000;
        }
        return value;
    }

    double convertToMetre(double value, Unit unit) {
        if (unit == Unit.CENTIMETRE) {
            return value / 100;
        }
        if (unit == Unit.KILOMETRE) {
            return value * 1000;
        }
        return value;
    }

    double convertToKilometre(double value, Unit unit) {
        if (unit == Unit.CENTIMETRE) {
            return value / 100000;
        }
        if (unit == Unit.METRE) {
            return value / 1000;
        }
        return value;
    }
}
