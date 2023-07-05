import java.util.*;

class A extends Thread {
    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("hello ji");
                Thread.sleep(1000);
            }
        } catch (InterruptedException i) {
        }
    }

}

class B {
    public static void main(String[] args) throws InterruptedException {
        A t = new A();
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("hello king u drop your crown");
            Thread.sleep(2000);
        }
    }

}
