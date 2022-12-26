package Task1.b;
//The code smell present here is Data Clump.
public class Mail {
    private String subject;
    private String body;
    private String to;
    private String from;
    private String cc;

    public void setMailAdresses(String to, String from, String cc){
        this.to = to;
        this.from = from;
        this.cc = cc;
    }

    public void setMailSubjectAndBody(String subject, String body){
        this.subject = subject;
        this.body = body;
    }

    public void SendEmail(boolean sendImmediately) {
         EmailService.Send(subject, body, to, from, cc, sendImmediately);
         }
    public void SendEmail() {
         EmailService.Send(subject, body, to, from, cc);
         }


         //by adding new methods, we remove data clump from the given code.
}
