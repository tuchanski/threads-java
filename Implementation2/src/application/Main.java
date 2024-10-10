package application;

import model.MyThread;

public class Main {
    public static void main(String[] args) {

        MyThread t1 = new MyThread("Guilherme");
        MyThread t2 = new MyThread("Joaquim");

        for (int i = 0; i < 3; i++) {
            t1.run();
            t2.run();
        }

    }
}