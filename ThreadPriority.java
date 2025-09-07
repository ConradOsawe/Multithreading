public class ThreadPriority {
    public static void main(String[] args) {
        // System.out.println(Thread.currentThread().getName());
        // System.out.println(Thread.currentThread().getPriority());
        // Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        // System.out.println(Thread.currentThread().getPriority());

        /*
         * In this code the main thread will run first despite having the lower priority
         * because it follows the FIFO principle
         */
        System.out.println(Thread.currentThread().getName() + " says HI!");

        Thread one = new Thread(() -> {
            System.out.println("Thread one says HI as well");
        });

        one.setPriority(Thread.MAX_PRIORITY);
        one.start();
    }
}
