package track.Class_Practice.Threads;

import java.util.*;

class Addition extends Thread {
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Addition activity started and using file");
        System.out.println("Enter a: ");
        int a = scan.nextInt();
        System.out.println("Enter b: ");
        int b = scan.nextInt();
        int res = a + b;
        System.out.println("Addition result is: " + res);
        System.out.println("Addition activity completed and stopped using file");
        scan.close();
    }
}

class PrintNum extends Thread {
    @Override
    public void run() {
        System.out.println("Printing num activity started using file");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
        System.out.println("Printing num activity completed and stopped using file");
    }
}

class PrintChar extends Thread {
    @Override
    public void run() {
        System.out.println("Printing char activity started using file");
        for (char i = 'A'; i <= 'G'; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }
        }
        System.out.println("Printing char activity completed and stopped using file");
    }
}

public class ThreadLifeCycle {
    public static void main(String[] args) {
        System.out.println("Main Thread Execution Started and opened file");
        Addition ad = new Addition();
        PrintNum pn = new PrintNum();
        PrintChar pc = new PrintChar();
        ad.start();
        pn.start();
        pc.start();
        try {
            ad.join();
            pn.join();
            pc.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread Execution completed and closed file");
    }
}
