package model;

public class MyThread extends Thread {

    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 1; i <= 10000; i++) {
            this.counter.increment();
        }
    }

}