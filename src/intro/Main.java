package intro;

public class Main {
    public static void main(String[] args) {


        String internetSubeButton = "Internet Subesi";
        System.out.println(internetSubeButton);
        double dolarDun = 9.15;
        double dolarBugun = 9.10;
        int  vade = 36;
        boolean dustuMu = false;

        if (dolarBugun<dolarDun) { //true olursa if e girer
            // sadece if ve else kullanilirsa bir bug olur oda iki degerin ayni lma ihtimalidir / 9.15 ve 9.15
            // bu durumda else otmatik calisir ama bu calismasini istemedigimiz bir durum olur
            // bunun icin else if unutulmamali
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

















    }
}
