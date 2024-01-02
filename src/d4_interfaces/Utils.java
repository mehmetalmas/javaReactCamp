package d4_interfaces;

public class Utils {
   // Utilities = Araclar : Her zaman kullanacagimiz metotlar burada ststic olarak olusturulur ve kullanimi alinir
    public static void runLoggers(Logger[] loggers, String message){
        for(Logger logger : loggers) {
            logger.log(message);
        }
    }
}
