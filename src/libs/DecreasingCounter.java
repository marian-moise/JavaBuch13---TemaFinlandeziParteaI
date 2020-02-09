package libs;

public class DecreasingCounter {
    private int value;   // object variable that remembers the value of the counter
    private int initialValue;


    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initialValue = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here the code that decrements the value of counter by one
        if (value > 0) {
            value--;
        }
    }

    public void reset() {
        value = 0;
    }


    public void setInitial() {
        this.value = initialValue;

    }
}
