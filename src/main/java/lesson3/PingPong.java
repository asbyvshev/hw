package lesson3;

public class PingPong {
    private final Object mon = new Object();
    private volatile String currentString = "Ping";

    public static void main(String[] args) {
        PingPong w = new PingPong();
        Thread t1 = new Thread(() -> {
            w.printPing();
        });
        Thread t2 = new Thread(() -> {
            w.printPong();
        });
        t1.start();
        t2.start();
    }

    public void printPing() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 3; i++) {
                    while (!currentString.equalsIgnoreCase("Ping")) {
                        mon.wait();
                    }
                    System.out.print("Ping ");
                    currentString = "Pong";
                    mon.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printPong() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 3; i++) {
                    while (!currentString.equalsIgnoreCase("Pong")) {
                        mon.wait();
                    }
                    System.out.print("Pong ");
                    currentString = "Ping";
                    mon.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
