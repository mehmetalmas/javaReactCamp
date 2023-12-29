package d2_oopIntro;

public class D2_ProductManager {
    // bu sekilde bir Product sinifi daha olusturma sebebimiz Produckt ile ilgili metotlari
    // burada tutarak bir düzen olusturma istegimizdir

/*  Metot olusturma,
    herzaman kullandigimiz kod buloklarini bir metot icine yazarak bu metodu cagirip kullaniriz,
    bu sekilde bu kodlari heryerde yazmaktan kurtuluruz, hem böylece bir degisiklik yapilmasi gerektiginde bir
    yerden bunu kolaylikla yapabilirz
*/

    //-------------------get ve set metotlarini kullanmadan Produck icin bir metodu olusturma-------------------------

    //Dogru kullanim degildir
    public void addToCart(D2_Product product){ // Sepete ekleme icin bir metot, her ürünün altinda olur
        // metoda obje geciyoruz, Produck sinifindan, böylece metot icinde alanlarina ulasabilirz ve her Produck bu metodu kullanabilir
        System.out.println("Sepete eklendi " + product.id); // böylece sepete ürünün id si eklendi, id unik
        // oldugundan hangi ürün oldugunu biliyoruz, birden fazla parametrede ekleyebilirsin

    }

    //-------------------get ve set metotlarini kullanarak Produck icin bir metod olusturma-------------------------

    //Dogru Kullanim böyle get metodu kullanarak field a ulasir sepete ekleriz veaya baska bir metot kullaniriz
    public void addToCart1(D2_Product product){
        System.out.println("Sepete eklendi " + product.getId1());

    }














}
