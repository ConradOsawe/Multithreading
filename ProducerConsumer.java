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

        }

        public void consumer() {

        }
    }
}
