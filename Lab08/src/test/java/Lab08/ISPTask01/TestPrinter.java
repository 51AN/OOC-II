package Lab08.ISPTask01;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPrinter {

    @Test
    public void TestPrinter01(){
        BasicPrinter basicPrinter = new BasicPrinter();
        Document document = new Document("This is basic printer");
        basicPrinter.print(document);


    }

    @Test
    public void TestPrinter02(){

        MultiFunctionPrinter multiFunctionPrinter = new MultiFunctionPrinter();

        Document document = new Document("This is Multi Printer");

        multiFunctionPrinter.print(document);



    }

    @Test
    public void TestPrinter03(){

        MultiFunctionPrinter multiFunctionPrinter = new MultiFunctionPrinter();
        multiFunctionPrinter.print(multiFunctionPrinter.scan());



    }
    @Test
    public void TestPrinter04(){

        MultiFunctionPrinter multiFunctionPrinter = new MultiFunctionPrinter();

        Document document = new Document("This is Multi Printer");

        multiFunctionPrinter.fax(document);



    }
}
