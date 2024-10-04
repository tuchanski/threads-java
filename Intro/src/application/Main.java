package application;

import model.MyThread;

public class Main {

    // Main is a thread too. But here I created 3. Total: 4
    public static void main(String[] args) {

        MyThread myThread1 = new MyThread("First!");
        MyThread myThread2 = new MyThread("Second!");

        // Another way to initialize a thread
        (new Thread(new MyThread("Third!"))).start();

        // Multithreading
        myThread1.start();
        myThread2.start();

        // Never overlap a thread with another -> join()
        try {
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
