class NumberThread extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
        }
    }
}

class AlphabetThread extends Thread {

    public void run() {
        for (char ch = 'A'; ch <= 'J'; ch++) {
            System.out.println("Alphabet: " + ch);
        }
    }
}

public class Pro7 {
    public static void main(String[] args) {

        NumberThread t1 = new NumberThread();
        AlphabetThread t2 = new AlphabetThread();

        // Set thread names
        t1.setName("Number Thread");
        t2.setName("Alphabet Thread");

        // Set thread priorities
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        // Start threads
        t1.start();
        t2.start();
    }
}