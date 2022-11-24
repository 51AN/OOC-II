package Threads;

public class PainPrinter extends Thread{

    @Override
    public void run() {



        for (int i = 1 ; i<=10 ; i++){
            System.out.println("** Printing levels of pain. Current Level : " + i);
        }
    }
}
