package d4_interfaces;

public class Main {
    public static void main(String[] args) {

        Customer mehmet = new Customer(1, "Mehmet", "Almas");
        // mehmet isiminde  olusturuldu ama sisteme eklenmedi, asagida ekleyelim

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new EmailLogger(), new SmsLogger()};
        CustomerManeger customerManeger  = new CustomerManeger(loggers);
        // DatabaseLogger(), Logger i imlement ettiginden

        customerManeger.add(mehmet);
        // add metoduna ulasmak icin CustomerManeger sinifindan bir obje olusturalim
        // metot bizden müsterinin referansini istiyor, yeni olusturlan müsterinin referansi mehmet onu girelim
        // calistirdigimizda hem kayit oluyor hemde bu kayit hareketi bir dataya gönderiliyor, dataya gönderilme
        // islemi bize interface tarafindan zorunlu tutulmustu



        customerManeger.delete(mehmet);









    }
}
