package application;

import model.MyThread;

public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyThread("Guilherme"));
        Thread t2 = new Thread(new MyThread("Joaquim"));

        for (int i = 0; i < 3; i++) {
            t1.start();
            t2.start();
        }

    }
}