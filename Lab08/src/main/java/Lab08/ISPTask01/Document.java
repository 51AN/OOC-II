package Lab08.ISPTask01;

public class Document {
    private String string = "";
    public Document(String str){
        this.string = str;
    }

    public void setText(String str){
        this.string = str;
    }
    public String getText(){
        return this.string;
    }
}
