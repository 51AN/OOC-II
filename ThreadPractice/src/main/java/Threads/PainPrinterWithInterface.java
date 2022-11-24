package Threads;

public class PainPrinterWithInterface extends DummyClass implements Runnable{
    @Override
    public void run() {
        for (int i = 1 ; i<=10 ; i++){
            System.out.println("II Printing levels of pain. Current Level : " + i);
        }
    }
}
