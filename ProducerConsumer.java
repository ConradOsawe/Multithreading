import java.util.*;

public class ProducerConsumer {
    class Worker {

        private int sequence = 0;
        private final Integer top;
        private final List<Integer> container;
        private final Object lock = new Object();

        public Worker(Integer top, Integer bottom) {
            this.top = top;
            this.bottom = bottom;
            this.container = new ArrayList<>();
        }

        public void produce() {
            synchronized (lock) {
                while (true) {
                    if (container.size() == top) {
                        System.out.println("Container full waiting for items to be removed ....");
                        lock.wait();
                    } else {
                        System.out.println(sequence + " Added to the container");
                        container.add(sequence++);
                        lock.notify();
                    }
                    Thread.sleep(500);
                }
            }
        }

        public void consumer() {

        }
    }
}
