package d4_inheritanceOverride;

public class CustomerManeger1 {

/*  Meto bu sekilde yazmak ileride problem yaratir, baska yerlerde sürdürülebilir olmaz

    public void add() {
        System.out.println("Müsteri eklendi");
        DatabeseLogger2 logger2 = new DatabeseLogger2();
        logger2.log();
     }
*/


    // Her zaman referans gecerek isi cözmeyi düsün, yukaridakini aynisi yapar ve ileride problem cikartmaz
    // metoda Logger2 sinifinin refreansi gecirek, bu sinifi extends eden tüm siniflarinda bu metodu kullanmasini sagliyoruz
    // ve metot u kullndigimiz her yerde, metot icinde 100 lerce kez ayni objeyi olusturma zahmetinden kurtuluyoruz


    public void add (Logger2 logger2) {
        System.out.println("Müsteri eklendi");
        logger2.log();
    }








}
