package Threads;

public class PainThreadV2 extends Thread{
    PainPrinterV2 printer;

    PainThreadV2(PainPrinterV2 p){
        this.printer = p;
    }

    @Override
    public void run() {
        printer.printPain(10, "Naz");
    }
}
