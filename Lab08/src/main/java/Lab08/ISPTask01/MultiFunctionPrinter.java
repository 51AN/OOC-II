package Lab08.ISPTask01;

import java.util.Scanner;

public class MultiFunctionPrinter implements IMultiFunctionPrinter{

    @Override
    public void print(Document document){
        System.out.println(document.getText());
    }

    @Override
    public Document scan(){
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        Document document = new Document(string);
        return document;

    }

    @Override
    public void fax(Document document){
        System.out.println(document.getText() + " (faxed)");
    }


}
