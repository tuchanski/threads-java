package application;

import model.MyThread;

public class Main {

    public static void main(String[] args) {

        try {
            MyThread myThread = new MyThread();

            myThread.start();
            myThread.join();

            System.out.println("Fim do programa!");

        } catch (InterruptedException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
