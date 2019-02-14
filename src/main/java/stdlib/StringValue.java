package stdlib;

public class StringValue implements Value {

    private final String value;

    public StringValue(String value) {
        this.value = value;
    }

    @Override
    public double asNumber() {

        try {
            return Double.parseDouble(value);
        }catch (NumberFormatException e){
            return Integer.MAX_VALUE;
        }
    }

    @Override
    public String asString() {
        return value;
    }

    @Override
    public Object asLink() {
        return asString();
    }

    @Override
    public String toString() {
        return asString();
    }
}
