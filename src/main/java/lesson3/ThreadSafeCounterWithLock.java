package lesson3;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeCounterWithLock {
    private volatile int count;
    private final ReentrantLock lock;

    public ThreadSafeCounterWithLock() {
        lock = new ReentrantLock();
    }

    public void increment(){
        try {
            lock.lock();
            count++;
        } finally {
            lock.unlock();
        }
    }

    public void decrement(){
        try {
            lock.lock();
            count--;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        ThreadSafeCounterWithLock counter = new ThreadSafeCounterWithLock();

        Thread thread1 = new Thread(()->{
            for (int i = 0; i < 100; i++){
                counter.increment();
            }

        });

        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 100; i++){
                counter.decrement();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getCount());
    }
}
