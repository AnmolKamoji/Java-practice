class A extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hi");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hello");
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        // Create thread objects
        A obj1 = new A();
        B obj2 = new B();

        // Start the threads
        obj1.start();
        obj2.start();
    }
}
