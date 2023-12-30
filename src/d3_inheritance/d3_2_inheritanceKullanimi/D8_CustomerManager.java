package d3_inheritance.d3_2_inheritanceKullanimi;

public class D8_CustomerManager {

    // bana bir sey vermesin, sadece dedigimi yapsin, void metot
    // yeni bir müsteri girisi oldugunda sadece kayit yapsin bana bir sey döndürmesin void metot yapmalisin

/*

    public  void add(D5_IndividualCustomer2 d5_individualCustomer2){
        System.out.println(d5_individualCustomer2.cunstomerNummer + " Kaydedildi");
    }

    D5_IndividualCustomer2 d5_individualCustomer2 parametre olarak gecilmesi bu siniftan
    olusturlan her objenin referansi ile bu metot u calistirma istegimdir, baska yerde add kullanirken
    sadece referan girmem yeterli


    public void add(D6_CorporateCustomer2 d6_corporateCustomer2){
        System.out.println(d6_corporateCustomer2.cunstomerNummer + " Kaydedildi");
    }

    D6_CorporateCustomer2 d6_corporateCustomer2 parametre olarak gecilmesi bu siniftan
    olusturlan her objenin referansi ile bu metot u calistirma istegimdir, baska yerde add kullanirken
    sadece referan girmem yeterli


    //iki tane add metodu var ama parametreleri farkli oldugunda problem yok, Overloading



*/


    //----------Bununarin yerine asagidaki metot ayni isi yapar--------------------------------


    public void add(D4_Customer2 d4_customer2) { //kendinin ve cocuklarinin obje referanslari bu metotda calisacak
        System.out.println(d4_customer2.cunstomerNummer + " Kaydedildi");
    }

    // parametrayi "D4_Customer2 d4_customer2" girerek bu metoda müsteri icin islem yap diyoruz,danani kuyrugunun
    // koptugu yer burasi ben "D5_IndividualCustomer2" ve "D6_CorporateCustomer2" de "D2_Customer1" extends ederek
    // onlara sen ayriyaten bir Customer sin dedim, onlar ayriyaten Costumer olduklarindan bu metot, "D4_Customer2
    // d4_customer2" paremetresi girilmis metot onlar icinde calisir, bu siniflar "D4_Customer2" extends etmeseler
    // di bu metoda bu referansi onlarinda kullanimi icin gecemezdim. Bunun aciklamasi ebeveyn siniflar
    // cocuklarinin referanslarini tutarlar bundan dolayi yazilim sürdürülebilir olur, ebeyev sinifi üzerinden
    // yazilan(ebeven refransi parametre olarak gecilen) tüm metotlari cocuklari icinde kullanabilirim


//---------------------------karisik bir müsteri listesini sisteme ekleme / bulk insert----------------------------------------------

    // Elimizde karisik bir müsteri listesi var her türten müsteriyi barindiriyor, bunlari sisteme ekleme
    // Poliformilizm i kullanma

    public void addMultiple(D4_Customer2[] d4_customer2s){ //referanslari parametre olarak al dedik, birden fazla
        for (D4_Customer2 customer2 : d4_customer2s )
            add(customer2); // üstteki add metodunu her müsteri icin calistir dedik
    }


}



