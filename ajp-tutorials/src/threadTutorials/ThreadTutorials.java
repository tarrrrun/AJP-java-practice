package threadTutorials;

public class ThreadTutorials {

    public ThreadTutorials() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        B2 b = new B2();
        Temp t2 = new Temp();
        Temp2 t3 = new Temp2();
        t2.start();
        b.print();
        t3.start();
    }
}

class B2 {
    void print() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

class Temp2 extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("huehuehue");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class Temp extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
