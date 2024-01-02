package d4_interfaces;

public class CustomerManeger {
    /*
     * yeni kullanici olusturuldugunda hemen bu olusturulma islem hareketi kaydedilmeli,nereye
     * kaydedelim dosyaya mi, bu genel düsünülmeli, Logger interface ile bunu yaparsam sonradan nereye
     * göndermek istersem isteyeyim degisikligi kolayca yapabilirim, Logger interface kendini imlement
     * edenlerin referanslarini tutuyor. Logger i bir privat instance variable olarak girdim, sonra sinifin,
     * CustomerManeger in consturocturunu olusturdum,  add metodunda this ile ayriyaten bu logger referansina
     * ulastim ve Logger sinifinda ki metoda olasuturalack Costumer lar icin fistName ni al istenilen yere gönder
     * dedim
     */


    private Logger[] loggers;  // Interface bir alan olarak girdik, bu sinif Logger i biliyor demek olur bu

    public CustomerManeger(Logger[] loggers) { //Bunu yapmamizin sebebi private Logger logger; bir katman daha gizlememiz
        // ve olusturlacak obje bir Logger gecilmesini istememiz
        this.loggers = loggers;
    }


    public void add(Customer customer) { //metot yeni bir müsteri referansi isteyecek
        System.out.println("Müsteri eklendi : " + customer.getFirstName());
        /*
         * foru direk burada da yazabiliriz
        for (Logger logger: loggers) {
            logger.log(customer.getFirstName());
        }
         * Bu sekilde kullanimda her zaman bu for u yazmak zorunda kalirsin, bir sinifta ststic metot
         * olarak tanimla sonra kullan (Utulities sinifi gibi)
         */
        Utils.runLoggers(loggers, customer.getFirstName()); // for u hep kullanacagimizdan Utils sinifi olustuduk
                                                            // for u statik bir metot icine koyduk ve Sinif üzerinden
                                                            // ulastik



    }

    // ayni seyleri delete metodu icinde yaptim
    public void delete(Customer customer) {
        System.out.println("Müsteri silindi : " + customer.getFirstName());


        /*
        foru direk burada da yazabiliriz

        for (Logger logger: loggers) {
            logger.log(customer.getFirstName());

        }

       Bu sekilde kullanimda her zaman bu for u yazmak zorunda kalirsin, bir sinifta ststic metot
       olarak tanimla sonra kullan (Utulities sinifi gibi)


        */

        Utils.runLoggers(loggers, customer.getFirstName()); // for u hep kullanacagimizdan Utils sinifi olustuduk
                                                            // for u statik bir metot icine koyduk ve Sinif üzerinden
                                                            // ulastik

    }



    /*


    --------------------------------------Bu kati bagimli bir tasarim--------------------------------------------
    eger ileride datalari bir dosyada tutalim denilse o zaman cok orlanirsin tüm DatabaseLogger lari degistirmelisin


    public void add(Customer customer){
        System.out.println("Müsteri eklendi : " + customer.getFirstName());
         DatabaseLogger databaseLogger = new DatabaseLogger();
         databaseLogger.log(customer.getFirstName() + " Veri(Database) tabanina loglandi" );



        // yeni kullanici olusturuldugunda hemen bu olusturulma islemi hareketi kaydedilmeli,nereye
        // kaydedelim dosyaya mi, data yi yoksa email mi atalim, buna karar verdikten sonra bu siniftan  metot
        // icinde bir obje olusturup o sinifta interface ile mecbur tutulan metota ulasalim ve müsterinin neyini
        // tutacagini belirtip, kullanici kayit oldugu anda kullanicinin bu islem hareketini da kaydetmis olalim
        // log() metodu String bir parametre istiyor ondan  customer.getFirstName() ile String gönderiliyor
        // interface ler bu sekilde kullanilmazsa belli bir yerden sonra anlamsiz oluyorlar
    }


    public void delete(Customer customer){
        System.out.println("Müsteri silindi : " + customer.getFirstName() );
        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.log(customer.getFirstName() + " Veri(Database) tabanina loglandi" );



        //metoda sinif referansi gecildiginden metot icinde refransi kullanabilirim

        // kullanici silindiginde hemen bu silme islemi hareketi kaydedilmeli,nereye
        // kaydedelim dosyaya mi, data yi yoksa email mi atalim, buna karar verdikten sonra bu siniftan metot
        // icinde bir obje olusturup o sinifta interface ile mecbur tutulan metota ulasalim ve müsterinin neyini
        // tutacagini belirtip, kullanici silindigi anda kullanicinin bu islem hareketini da kaydetmis olalim
        // log() metodu String bir parametre istiyor ondan  customer.getFirstName() ile String gönderiliyor
        // interface ler bu sekilde kullanilmazsa belli bir yerden sonra anlamsiz oluyorlar

    }


     */


}
