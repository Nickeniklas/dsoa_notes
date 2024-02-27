import java.util.Arrays;

public class Sorty {

    private String[] values;

    public Sorty(String[] values) {
        this.values = values.clone(); //om inte .clone() så är det en ref

        System.out.println("String array sort: " + Arrays.toString(this.values));

    }

    public void bubbleSort() {
    int ops = 0;
        for (int i = 0; i < values.length; i++) {
            //  Nestle
            for (int j = 1; j < values.length; j++) {
                if(values[j - 1].compareTo(values[j]) > 0){//  compareTo() returns -1(less), 0(same),1(more)
                    String temp  = values[j - 1];
                    values[j - 1] = values[j];
                    values[j] = temp;
                    ops++;
                }
            }
        }
        System.out.println("BubbleSort, " + ops + " ops.");
    }

    public void insertionSort() {
            //börjar från andra kortet
        for (int i = 1; i < values.length; i++) {
            String currentValue = values[i];
            int j = i - 1;
            while (j >= 0 && values[j].compareTo(currentValue) > 0) {
                values[j + 1] = values[j];
            }

        }

    }
}
