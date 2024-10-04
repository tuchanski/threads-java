package application;

import model.MyThread;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();

        myThread.start();
        myThread.join();

        System.out.println("Fim do programa!");

    }

}
