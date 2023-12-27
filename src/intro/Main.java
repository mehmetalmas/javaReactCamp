package intro;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------Veri Tipleri-------------------------");


        String internetSubeButton = "Internet Subesi";
        System.out.println(internetSubeButton);
        double dolarDun = 9.15;
        double dolarBugun = 9.10;
        int  vade = 36;
        boolean dustuMu = false;

        if (dolarBugun<dolarDun) { //true olursa if e girer
            // sadece if ve else kullanilirsa bir bug olur oda iki degerin ayni lma ihtimalidir / 9.15 ve 9.15
            // bu durumda else otmatik calisir ama bu calismasini istemedigimiz bir durum olur
            // bunun icin else if unutulmamali ornek ; https://altin.in/ adresi
            System.out.println("Dolar düstü resmi");
        }else if(dolarBugun>dolarDun){
            System.out.println("Dolar yükseldi resmi");
        }else { // else ne olursa olsun calisir, mantik karsilastirmasi olmadigindan
            System.out.println("Dolar esittir resmi");
        }


        System.out.println("-----------------------------------------------");

        // bir bankada bir drapDrop icin elemanlari böyle olusturabiliriz
        String kredi1 = "Konut Kredisi";
        String kredi2 = "Arac Kredisi";
        String kredi3 = "Tatil Kredisi";
        String kredi4 = "Egitim Kredisi";
        String kredi5 = "Ciftci Kredisi";
        String kredi6 = "Hizli Kredi";
        // yazdirmak icin hepsini tek tek yazdirmamiz gerekir
        System.out.println(kredi1);
        System.out.println(kredi2);
        System.out.println(kredi3);
        System.out.println(kredi4);
        System.out.println(kredi5);
        System.out.println(kredi6);
        // peki yani bir kredi türü eklenince ne yapacagiz bu kodu koydugumuz heryerde bunu degistirmemiz gerekecek
        // yada  böyle teker teker yazdirmamiz gerekecek veya baska bir yerde yazip kullanmamiz gerekecek özellikle
        // bir datadan degerler aldigimizi düsünün 1000 tane degeri tek tek yazmak zorunda klairsiniz
        // bunun yerine array kullaniriz, datadan cektigimiz verileri array icinde tutup sonra ona ulasiriz

        String[] krediler = {
                "Konut Kredisi",   // 0 indis
                "Arac Kredisi",    // 1 indis
                "Tatil Kredisi",   // 2 indis
                "Egitim Kredisi",  // 3 indis
                "Ciftci Kredisi",  // 4 indis
                "Hizli Kredi"      // 5 indis
        };

        //array icine 1000 tane elemani nasil yazadiriz tek tek mi hayir bunun icin foreach kullaniriz

        for (String kredi : krediler) {
            // kredi, krediler array ine gider ve ilk elemani(Konut Kredisi) kendine atar sonra cümleyi calistirir
            // sonra ikinci elemani kendine atar ve cümlesini calistiri bu döngü array deki elemanlarin sayisi
            // kadar döner sonra biter
            System.out.println(kredi);
        }
        // böylece yeni bir kredi array eklendiginde onun icin yeniden sout yazmama gerek kalmadi, foreach bunu yapacak

        //foreach yerine asagidaki for loop ilede ayni islemi yapabiliriz

        for (int i = 0; i <krediler.length; i++) { // sartimiz i sifirdan baslayarak kredilerin eleman
            // sayisindan kücük oldugu sürece calissin ve i yi her döngüde 1 arttir
            System.out.println(krediler[i]); //krediler[0] yazarsan Konut Kredisi ni 6 kere yazdirir

        }


        System.out.println("-----------------------------------------------");

        // referans tiplari / deger Tipleri

        // su iki konu , Tasarim desenleri, Tasarim prensiplerini, Katmanli mimarileri, dependency injection,
        // ais container gibi konulari anlamamizi saglayan temel bilgidir, interface leri bilip o interfaceleri
        // gercek hayatta da kullanmamizi saglayacak hususu icerir

        //deger-ilkel(primitiv/stack) tip : degere sahip olurlar
        int  sayi1 = 10;
        int sayi2 = 20 ;
        sayi1 = sayi2; // sayi1 e 20 atandi
        sayi2 = 100;
        System.out.println(sayi1); // 20 yazdirir

        //referans(non-primitive/heap) tip : degeri gösterirler
        int[] sayilar1 = {1,2,3,4,5,};
        int[] sayilar2 = {10,20,30,40,50,};
        sayilar1 = sayilar2; // sayilar1 referansi artik sayilar2 referansinin gösterdigi elemanlari, gösteriyor,
        // sayilari1 in onceki elemanlar listesi artik null, cöp oldu
        sayilar2[0] = 100;
        System.out.println(sayilar1[0]); //100 yazdirir


        String s1 = "Ankara";
        String s2 = "Istanul";
        s1=s2;
        s2 = "Izmir";
        System.out.println(s1); // Istanbul yazdirir; s1 referansina s2 referansi atandi diye s2 objesini göstermez
                                // s2 objesi s1 e sadece atandi (ve aralarindaki bag yok) gibi davranir
                                // yada s1 artik s2 giyi gösteriyor ama orada ki Istanbul gösteriyor
                                // Istanbul artik s1 ve s2 olan iki tane referansa sahip
                                // s2 izmir olunca s1 istanbulu göstermeye tek olarak devam eder
                                // normalde öbür non-primitiv tiplerde array vb böyle degil
        // String referans(non-primitive) bir tip olsa da string atamlarinin calisma sekli deger
        // tipliler(primitive) gibi olur ÖNEMLI!!!,
        // java yi tasarlayanlar stringi referans tipli yapilsalarda calisma seklini böyle tasarlamislar




        /*

         1- Ilkel (Primitive) Veri Tipleri:

            1.byte: 8-bit işaretsiz tamsayıları temsil eder. -128 ile 127 arasındaki değerleri alabilir.
            2.short: 16-bit işaretsiz tamsayıları temsil eder. -32,768 ile 32,767 arasındaki değerleri alabilir.
            3.int: 32-bit tam sayıları temsil eder. -2,147,483,648 ile 2,147,483,647 arasındaki değerleri alabilir.
            4.long: 64-bit tam sayıları temsil eder. Çok büyük veya çok küçük tamsayıları saklamak için kullanılır.
            5.float: 32-bit kayan noktalı sayıları temsil eder. Kesirli sayıları (ondalık) saklar.
            6.double: 64-bit kayan noktalı sayıları temsil eder. Daha yüksek hassasiyetli kesirli sayıları saklar.
            7.char: 16-bit Unicode karakterleri temsil eder. Tek bir karakteri saklar.
            8.boolean: Mantıksal değerleri temsil eder. Sadece true veya false değerlerini alabilir.

         2- Referans veri tipleri:

            - Class: Sınıflar, nesnelerin oluşturulmasını ve yönetilmesini sağlar. Özelleştirilebilir veri tiplerini
            tanımlamak için kullanılır.
            - Interface: Arayüzler, metotların imzalarını içeren ancak metotların gövdelerini içermeyen referans
            veri tipleridir. Sınıflar bu arayüzleri - uygular.
            - Array: Dizi veri tipi, aynı türden verileri saklamak için kullanılır. Örneğin, int[] bir tamsayı
            dizisini temsil eder.
            - Enum: Enumerations (sıralamalar), önceden tanımlanmış sabit değerlerin bir koleksiyonunu temsil eder.

            1.String: Metin dizilerini temsil eder ve metin işlemleri için kullanılır.
            2.Array (Dizi): Diziler, aynı türden öğeleri saklamak için kullanılır. Bir dizi, bellekte bir nesne olarak
            saklanır ve bu nesnenin bir referansı vardır.
            3.ArrayList: ArrayList, dinamik boyutlu bir diziyi temsil eder. ArrayList, bir nesne olarak
            bellekte saklanır ve bir referansa sahiptir.
            4.HashMap: HashMap, anahtar-değer çiftlerini saklamak için kullanılır ve bir anahtarla ilişkilendirilen
            değerlere hızlı erişim sağlar. HashMap da bir nesne ve bir referans içerir.
            5.Kullanıcı Tanımlı Sınıflar (Custom Classes): Java'da kullanıcı tarafından tanımlanan sınıflar,
            nesneleri ve veri yapılarını oluşturmanıza olanak tanır. Bu sınıflar, programınızın mantığını ve
            veri yapısını temsil etmek için kullanılır.
            6.Enum (Sıralı Tip): Enumerations (enum), belirli bir sınırlı küme değeri temsil etmek için kullanılır.
            Bu değerler bir referans veri tipi olan enum türüne aittir.



         3- Özel Veri Tipleri:

            - String: Metin verilerini temsil eden bir sınıf. String verileri değiştirilemez (immutable) ve birçok
            metinsel işlem için kullanılır.
            - Wrapper Sınıflar: Java'da her biri bir ilkel veri türünü sarmalayan (wrap) sınıflar vardır. Örneğin,
            Integer, Double, Boolean vb.

         4- Null Veri Tipi:

            null: Herhangi bir nesnenin değeri yoksa veya atanmamışsa kullanılan özel bir değerdir. Özellikle referans
            türlerinde kullanılır.

            NULL - "null" bir değeri ifade eden özel bir değerdir ve Java'da sadece referans veri tiplerine aittir.
            "null", bir nesnenin atanmamış olduğunu veya herhangi bir bellek alanını işaret etmediğini
            belirtmek için kullanılır.

         */













    }
}
