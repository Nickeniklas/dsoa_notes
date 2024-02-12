public class Stacky {

    int topOfStack = -1;
    String[] data;
    int stackSize;

    public Stacky(int stackSize) {
        this.stackSize = stackSize;
        data = new String[stackSize];
    }

    public void push(String val) {
        topOfStack++;
        data[topOfStack] = val;
    }
}
