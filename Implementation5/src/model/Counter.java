package model;

public class Counter {

    private int value;

    public Counter(int value){
        this.value = value;
    }

    public synchronized void increment() {
        this.value++;
    }

    public void print() {
        System.out.println(this.value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Counter [value=" + value + "]";
    }

}
