package Lab08.ISPTask01;

public class BasicPrinter implements Printable{

    @Override
    public void print(Document document){
        System.out.println(document.getText());
    }


}
