// Runnable interface to implement concurrency
public class RunnableDemo {
    public static void main(String[] s) {
        Thread one = new Thread(new ThreadOne());
        Thread two = new Thread(new ThreadTwo());
        Thread three = new Thread(() -> {

            for (int i = 0; i < 15; i++) {
                System.out.println("Thread Three : " + i);
            }
        });
        one.start();
        two.start();
        three.start();
    }
}

class ThreadOne implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread One : " + i);
        }
    }
}

class ThreadTwo implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread Two : " + i);
        }
    }
}