package model;

public class MyThread implements Runnable {

    private int counter;
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (this.counter = 0; this.counter < 1001; this.counter++) {
            System.out.println(this.name + " - " + this.counter);
        }
    }

}
