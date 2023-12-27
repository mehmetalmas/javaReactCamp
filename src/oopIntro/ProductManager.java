package oopIntro;

public class ProductManager { // bu sekilde bir Product sinifi daha olusturma sebebimiz Produckt ile ilgili metotlari
    // burada tutarak bir düzen olusturma istegimizdir

/*  Metot olusturma,
    herzaman kullandigimiz kod buloklarini bir metot icine yazarak bu metodu cagirip kullaniriz,
    bu sekilde bu kodlari heryerde yazmaktan kurtuluruz, hem böylece bir degisiklik yapilmasi gerektiginde bir
    yerden bunu kolaylikla yapabilirz
*/

    public void addToCart(Product product){ // Sepete ekleme icin bir metot, her ürünün altinda olur
        System.out.println("Sepete eklendi " + product.id); // böylece sepete ürünün id si eklendi id unik
        // oldugundan hangi ürün oldugunu biliyoruz, birden fazla parametrede ekleyebilirsin

    }









}
