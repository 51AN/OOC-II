package Threads;

import java.util.ArrayList;
import java.util.List;

public class LaMain {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("==Loading Pain==");

//        Runnable runnable = new PainPrinterWithInterface();
//        Thread thread = new Thread(runnable);
//        thread.start();
//
//        PainPrinter printer = new PainPrinter();
//        printer.start();
//
//        for (int i = 1 ; i<=10 ; i++){
//            System.out.println("// Printing levels of pain. Current Level : " + i);
//        }

        PainPrinterV2 printerV2 = new PainPrinterV2();

        PainThread thread = new PainThread(printerV2);
        PainThreadV2 v2 = new PainThreadV2(printerV2);
        thread.start();
//        thread.join();
        v2.start();

        List<Integer> list = new ArrayList<>();


        System.out.println("==Pain Loaded Successfully==");

    }
}
