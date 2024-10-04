package model;

public class MyThread extends Thread {

    private int counter = 0;
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        while (counter < 1000) {
            System.out.printf("\nThread %s -> %d", this.name, this.counter);
            counter += 1;
        }
    }

}
