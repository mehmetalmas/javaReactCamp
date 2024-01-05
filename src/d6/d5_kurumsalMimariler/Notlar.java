package d6.d5_kurumsalMimariler;

public class Notlar {



    /*

    Otomasyon sistemleri, bir veri tabanin oldugu ve o veri tabanin üzerinden islemlerin yapildigi, dis servisler ile
    entegrasyonlarin yapildigi (ki bu dis servislerde veri tabani icerirler) sistemleridir, Bankalarin kullandiklari
    sistemler, Hepsi burada, kamu kuruluslarin personel servisleri vb otomasyon sistemleridir

    Temelde otomasyon sistemleri 3 katmanli mimari ile yapilir

     1-Data Access = veriye erisim saglanan yer, burasi veri tabanidir ( veya Data Acces Layer, Online Architecture )
     MySQL / MongoDB / PostgreSQL / Excel / Metin Dosyasi
     Buraya veriye erisim disinda asla bir kod yazilmaz, siniflar isimlendirirlirken ...Dao ile bitirilirler bu onlarin
     data dosyasi olduklarini söyler

     2-Business = is kurallarinin yazildigi katman, mesela bir oyun da kisiye göre puanlama yapan bir
     if sart blogunun yazildigi yer burasidir veya bir sayfada en fazla 100 ürün ile sinirlandirilmasi icin kodlarin
     yazilmasi gereken yer dir burasidir veya bir bankadan kredi almak icin enfazla 4 ayri bankada hesabin olmali 5
     bankada hesabin varsa sistemin ona izin vermemesi icin yazilmasi gereken kod burada yazilir

     3-API (Restful) = yukaridaki 2 katmani bu katmanda dis dünya ile etkilesime getirecek alt yapiya getiriyoruz,
     Dis dünya bir uygulamanin Android, IOS, React, Swing, Angular gibi yapilari olacaktir. Busines da yazdigin bir kod
     direk React ile iletisime gecemiyor bunu icin bir ara katman gerekiyor bu da API katmanidir
     Burada da dis dünya ile nasil bir iletisim kurulacak ise sadece o yaziliyor, diger diller ile yazilmis araclar
     ile iletisim de diyebiliriz

     Yardimci Katmanlar
        * Entities (Varliklar) =
        Veri tabanindaki tablolrin karsiliklari, uygulama icerisinde ihtiyacimiz olan özellik
        tutan siniflar yani tüm sisteme (domain e) hizmet eden siniflari burada tutariz, 3 katman ile de iletisim
        icersinde olabilir, concretes somut(normal) siniflarin oldugu ve abstracts soyut siniflarin icinde oldugu
        paketlere sahiptir
         ** concretes(somut demek) ler =
         isi yapan gercek siniflardir. önceki örnekteki Logger abstracts klasöründe olurken burada, DatabaseLogger,
         FileLogger gibi siniflar olur
         **abstracts(soyut demek) lar =
         önceki örnekteki Logger gibi interface ve abstract siniflari tutar

         Bir yerde Entities ler haric bir yerde new liyorsak ileride problem yasayacagiz demektir

        *CORE =
        Bize tüm sistemimizde kullanabilecegimiz ve ayni zamanda yeni projelerimizde de kullanabilecegimiz
        kodlari icerir, ortak katman anlamaina gelir, her zaman her yerde kullanilabilir kodlar. örnegin email gönderme
        kodu, 3 katmanda kullanabilir


    Yardimci katmanlara coklu katmanli anlamina gelen n layert ismini alir


    Api, Business e talep de bulunur ve derki; kullanici ürün eklemek istiyor ne dersin, business kurallarini(kodlarini)
    calistirie ve api ye derki müster ürün ekleyemez bundan ben veri tabanini cagirmiyorum

    Eger müsteride ürün ekleyebilse idi bu sefer Businees data acces i cagirirdi ve ürün veri tabanina eklenirdi

    iletisim her zaman sirali olmali Api den Businees a Businees dan  Data Access e,
    Api direk Data Access e bir sey diyemez
    VE Katmanlar da biribirleri ile abstrac(interface) lar ile iletisim kurar // ÖNEMLI!!!

    ----------------------------------------------------

    Sisteme disaridan bir sey ekleme farkli bir seydir, jLogger paketi böyle bir pakettir ve bizim olusturdugumuz
    framework e sonradan eklenmistir, framework un ana yapisinin kurgusu disindadir. Mikro servis mimarilerde bu
    sekilde projeye eklenir, bu dosyalarin kodlarina bir ekleme veya müdahele edilemez, edilememeli

    Bu ekleme islemi icin kendi interface mi olusturmamliyiz bu her zaman kullanilacagi icin u interface core paketi
    icinde olustururuz sonra bunu busniness pakaeti icinde ProducktManeger sinifinda Dependency Injection seklinde
    kullaniriz. Dependency Injection kisaca tanimi interface üzerinden verilere ulasmak

    jLogger paketinde interface olsa bile onunki kullanilmaz, kendi olusturacagin interface kullanilmali











     */
}
