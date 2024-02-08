public class StringArray {

    String[] values;


    public StringArray(String[] values) {
        this.values = values;
    }

    public int size() {
        return values.length;
    }

    public void add(String value) {
        String[] newValues = new String[values.length + 1];
        newValues[values.length] = value;

        values = newValues;
    }

    public String toString() {
        for (String value :
                values) {
            System.out.println(value);
        }
        return null;
    }

    public void reverse() {
        String[] reversedList = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            System.out.println(reversedList[i] = values[values.length - 1 - i]);
        }
    }
}
