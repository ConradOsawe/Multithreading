public class WaitAndNotify {

    private static final Object LOCK = new Object();

    public static void main(String[] args) {
        Thread one = new Thread(() -> {

        });

        Thread two = new Thread(() -> {

        });

        one.start();
        two.start();
    }
}
