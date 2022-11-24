package Threads;

public class PainThread extends Thread{
    PainPrinterV2 printer;

    PainThread(PainPrinterV2 p){
        this.printer = p;
    }

    @Override
    public void run() {
//        synchronized (printer){
//            printer.printPain(10, "Sian");
//        }
        printer.printPain(10, "Sian");
    }
}
