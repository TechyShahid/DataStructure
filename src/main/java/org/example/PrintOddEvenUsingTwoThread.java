package org.example;

public class PrintOddEvenUsingTwoThread {
    private volatile int counter=1;
    private int limit;

    public PrintOddEvenUsingTwoThread(int limit) {
        this.limit = limit;
    }
    public synchronized void  printOdd(){
        while(counter<=limit) {
            if (counter % 2 == 1) {
                System.out.println(counter);
                counter++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public synchronized void  printEven(){
        while(counter<=limit) {
            if (counter % 2 == 0) {
                System.out.println(counter);
                counter++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public static void main(String args []){
        PrintOddEvenUsingTwoThread ob=new PrintOddEvenUsingTwoThread(10);
        Thread t1=new Thread(()->{
            ob.printOdd();
        });
        Thread t2=new Thread(()->{
            ob.printEven();
        });
        t1.start();
        t2.start();
    }
}
