package creationalpatterns.singleton.threadsafe;

public class DemoMultiThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then Singleton was reused!" + "\n" +
                "If you see different values, then 2 Singleton instances were created" + "\n\n" +
                "RESULT :: " + "\n");

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());

        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
