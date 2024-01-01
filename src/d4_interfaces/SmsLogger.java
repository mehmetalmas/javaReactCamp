package d4_interfaces;

public class SmsLogger implements Logger {

    //imlement anlami SmsLogger i interface Logger a uyarla demektir, asagidaki metot hemen mecburi gelir, extends
    // ile metot u istersek override ederdik

    @Override
    public void log(String message) {
        System.out.println("Sms gönderildi : " + message);  // bunu biz sinifa göre burada yazdik
    }
}
