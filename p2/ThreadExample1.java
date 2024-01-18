package p2;

public class ThreadExample1 extends Thread {   // thread class contains run() and start().

    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("run");
        }
    }

    public static void main(String[] args) {
        ThreadExample1 t1=new ThreadExample1();
        t1.start();
        for (int i = 0; i < 1000; i++) {    // main thread will run sometime and run thread will run sometime
            System.out.println("main");
        }
    }
}
