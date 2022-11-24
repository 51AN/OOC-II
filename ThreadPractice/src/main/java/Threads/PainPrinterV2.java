package Threads;

public class PainPrinterV2 {
    synchronized void printPain(int level, String Sufferer){
        for(int i =1  ;i<=level ; i++){
            System.out.println("@@ Loading levels of pain, level : " + i);
        }
    }
}
