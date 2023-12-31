package d3_inheritance;

public class NeOgrendim {
    /*
              Ne Ögrendim - 3.gün

1- Alanlarin sadece sinifina has olmasi gerektigini ve siniflarin sadece kendi isine odaklanmasi gerektigini

  * bazen birden fazla siniflar ortak alanlara sahih olabilirler, örnegin müsteri cesitleri vardir, bireysel müsteri,
    ticari müsteri veya ticareri olmayan tüzel müsteriler ama hepsini id si müsteri numarasi olmali bunu
    yaninda kendine has alanlari, eger ben tüm müsteriler icin sadece bir Customer sinifi olustup sonra tüm
    müsterilerin alanlarini bu sinifa kayarsam bireysel müsteri, ticari müsteri veya ticareri olmayan tüzel
    müsterilerin alanlarina bu sinifan olusturulan her obje ile ulasabilecek ve diger müsteri servisleri icin
    tersi gecerli olacak, bu kurudgun sistemin aslinda ulasmamasi gerekli yerlere baskalarinin ulasmasi icin izin
    verdigi anlamina gelir, sistemin ulasilmamasi gerekli yerlere baskalarin ulasmasina izin vermesi ileride
    programini patlatir


    // bir bireysel müsteri olusturalim
      Customer customer = new Customer();
        customer.id = 1;
        customer.cunstomerNummer = "0001";
        customer.firstName = "Mehmet";
        customer.lastName = "Elmas";
        customer.natiaonalIdentity = "712947983749";
        customer.companyName = "......";   Bireysel müsteri, ticari müsteri alana ulasiyor, sikinti
        customer.taxNummer = ".........";  Bireysel müsteri, ticari müsteri alana ulasiyor, sikinti

      ----------------------------------------------------------------------------------

2- Ortak alanlar icin temel bir sinif olusturulmasi gerektigini ve diger benzer siniflarin bu ortak alanlari extends
etmesi gerektigini

     * Müsterileri bölmeliyim, böylece her sinif kendi isini yapar, kendi isine yogunlasir, mesela müsteri diye ana
     bir sinif olusturup her müsterinin kullanmak zorunda oldugu, her müsteride olmasi gerekli ana seyleri
     buraya koyarim sonra ticari müsteriye  extends ile sen ayriyaten müsterisin derim vb, böyle hic bir müsteri tipi
     baska müsteri tipinin alanina ulasamaz. Bir class dan ne istiyorsak sadece onlari yapabilmeli,cok dikkat
     edilmesi gereken bir durum, yoksa veri tabanin corbaya döner

     * ortak alanlari olan siniflarin ortak alanlari üst bir sinifta toplanip extends ile onlara ulasilarak
     kodu tekrar yazmaktan kurlululmali


     * Ek not : Bana bir sey vermesin, sadece dedigimi yapsin dedigin metot, void metotdur. yeni bir müsteri
     girisi oldugunda sadece kayit yapsin bana bir sey döndürmesin diyorsan metodun void olmali

     -------------------------------------------------------------------------------------

3- ebeveyn siniflarin cocuklarinin referanslarini da tuttuklarini

       * Ebeveyn in cocuklarinin genine sahip oldugu seklinde düsünebilirsin

       * Bunun kullanimi ve anlami : CustomerManeger de yazdigimiz  bir metoda referans olarak Customer costomer u
       gectigimizde Customer sinifini extends eden siniflarin objelerinin referanslari ile de bu metodun
       calisacagidir

        Örnek: Bir müsteri ekleme metodu

        public void add(Customer customer) {
        System.out.println(customer.cunstomerNummer + " Kaydedildi");
    }

       kendisinin ve cocuklarinin obje referanslari ile bu metot calisacak, kod tekrarindan, her cocuk sinif
       icin ayri ayri buna benzer metot olusturmaktan kurtulduk.

       alt müsteri tiplerine, müsteriyi(Customer) extends ederek hepsine ayriyaten siz bir Customer sunuz dedik,
       onlar ayriyaten Costumer olduklarindan bu metot, onlarin referansini paremetre olarak alir ve calisir,

       --------------------------------------------------------------------------------------

4- Tüm müsteri tiplerinin karisik bir sekilde listelendigi bir listeyi sisteme eklemeyi / bulk insert

        foreach ile ekleme

        public void addMultiple(Customer[] customers){
            for (Customer customer : customers )
              add(customer);                    // add metodunu her müsteri icin calistir dedik
    }

        metot a referanslari parametre olarak al dedik, birden fazla müsteri girisi icin, Customer[] customers
        baska bir yerde tanimli yada bir datadan veri cekiyordur gercekte


        bireysel, ticari ve sendika tipli bir listenin sisteme eklenmesi örnegi, referanslar listeye girilmis,
        hepsi icin CustomerManager daki addMultiple() metodunu calistiriyoruz

        CustomerManager customerManager = new CustomerManager();
        Customer[] customers = {mehmet, hepsiBurada, sendika};
        customerManager.addMultiple(customers);

       --------------------------------------------------------------------------------------

5- Her zaman bir metoda referans gecerek isi cözmeyi düsünmeyi, bir yerde yazmayi sonra heryerde kullanacak
   sekilde plan yapmayi, bunu yapabilmek icin siniflari tam olarak yapacagi ise göre tasarlamayi sonra buna göre
   inhertitanceyi kullanmayi, metotlara genelde ebeveyni sinifinin referanslari parametre olarak verilerek
   tüm cocuk siniflar icin tekrar ayi metotlardan olusturmaktan kurtulmayi, bu sekilde bir insanin ileride problem
   cikarmadan gelisecegini islem yapan sinifin ebeven sinifi ismi ile olusturup metotlari buraya yazmanin görüntü
   olarak düzenli duracagini (tüm metotlar EbeveynManeger da olur, paremetre olarak ebeveyn özellik sinifinin
   referansi verilir diger siniflarda ebeveyn i extends ettiklerinden metotlari tüm hepsi kullanabilir) ögrendim

      ----------------------------------------------------------------------------------------

6- Override nasil yapilir onu ögrendik

    * cocuk siniflar ebeveyn siniflarinin metotlarini degistirerek yani seyler ekleyerek kullanabilirler


    ----------------------------------------------------------------------------------------


7- Logger sinifinin tüm yapilan islemleri, tiklanan yerleri kaydettigini bu verilerin gönderildi yerlerin farkli
   olabilecegini, bir dosya, bir database veya bir email olabilecegini, ayni sekilde burada veya bunun gibi durumlarda
   bir ebeveyn Logger sinifi sonra ondan verileri extends eden DatabaseLogger veya FileLogger larin olmasi gerektigini,
   sonucta mantigin degismedigini ögrendim



     */

}
