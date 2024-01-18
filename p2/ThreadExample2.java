package p2;

public class ThreadExample2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("run");

        }
    }

    public static void main(String[] args) {
        ThreadExample2 t1= new ThreadExample2();
        Thread t2= new Thread(t1);
        t2.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main");

        }
    }
}
