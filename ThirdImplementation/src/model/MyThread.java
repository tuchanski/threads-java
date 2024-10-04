package model;

public class MyThread extends Thread {

    public MyThread() {

    }

    public void run() {
        System.out.println("Bem-vindo!");
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Adeus!");
    }

}
