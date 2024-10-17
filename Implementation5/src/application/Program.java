package application;

import model.Counter;
import model.MyThread;

public class Program {


    public static void main(String[] args) {

        Counter counter = new Counter(0);
    
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
       
        counter.print();

    }

}