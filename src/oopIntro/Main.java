package oopIntro;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {



        System.out.println("\n----------Sinifinda constructor olusturmadan obje olusturma----------------\n");

        Product product1 = new Product(); // obje. referans olusturma (instance)
        product1.id = 1;
        product1.name = "Lenova V14";
        product1.unitPrice = 1500;
        product1.detail = "8 GB Ram";


        Product[] productsList1 = {}; // bu esitligin karsisinda getProducts() diye bir metot koyarlar bu metot
                                      // verileri buradaki listeye getirir
        System.out.println( "productsList1 uzunlugu = " + productsList1.length); // 0 yazdirir, hic elemani yok

        Product[] productsList2 = {product1};
        System.out.println( "productsList2 uzunlugu = " + productsList2.length); // 1 yazdirir, 1 tane obje elemani var



        Product product2 = new Product(); // obje. referans olusturma (instance)
        product2.id = 2;
        product2.name = "Lenova V15";
        product2.unitPrice = 1700;
        product2.detail = "16 GB Ram";

        Product product3 = new Product(); // obje. referans olusturma (instance)
        product3.id = 3;
        product3.name = "Lenova V14T";
        product3.unitPrice = 1600;
        product3.detail = "16 GB Ram";

        Product product4 = new Product(); // obje. referans olusturma (instance)
        product4.id = 4;
        product4.name = "Lenova V14TM";
        product4.unitPrice = 1900;
        product4.detail = "32 GB Ram";

        Product[] productsList3 = {product1, product2, product3, product4};
        System.out.println( "productsList3 uzunlugu = " + productsList3.length); // 4 yazdirir, 4 tane obje elemani var

        for ( Product produck : productsList3) {  // foreach ile objelerin alanlarina ulasabilirz ve yazdirabilirz
            System.out.println("Produck Id = " + produck.id);
            System.out.println("produck name = " + produck.name);
            System.out.println("produck unitPrice = " + produck.unitPrice);
            System.out.println("produck detail = " + produck.detail);
        }



        System.out.println("\n----------Sinifinda constructor olusturarak obje olusturma----------------\n");


        //Category sinifindaki 1.Constructor(default) ile obje olusturma
        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Bilgisayarlar";
        category1.siralamasi = 1;
        /* burada run yaptiginda bu obje icinde sout kayulmamasina ragmen sinifintaki constructoru icinde sout
         * oldugundan orada ki sout u burada calisirtirir ve "default constructor calisti" yazdirir
         * her böyle olusturulan (default constuctor ile) obje icin "default constructor calisti" yazdirir
         * default icinde hic birsey olmayan compiler tarafindan olusturulan constructor, paremetresiz
         */
        System.out.println(" category1.id = " + category1.id);  // id yi üst satirda yazdirmiyor neden
        System.out.println(" category1.name = " + category1.name); // name i üst satirda yazdirmiyor neden
        System.out.println(" category1.siralamasi = " + category1.siralamasi); // siralamasi ni üst satirda yazdirmiyor neden




        //Category sinifindaki 2.Constructor ile obje olusturma, iki paremetreli
        Category category2 = new Category(2,"Telefonlar"); //constructor ile obje olusturma
        System.out.println(" category2.id = " + category2.id);     // id yi üst satirda yazdirmiyor neden
        System.out.println(" category2.name = " + category2.name); // name i üst satirda yazdirmiyor neden




        System.out.println("\n----------constructorlarin Birbirlerini cagirmasi----------------\n");


        //Category sinifindaki 3.Constructor ile obje olusturma, uc paremetreli ama ayriyaten default constructoru cagiriyor
        Category category3 = new Category(3, "Ekranlar", 3);
        /*calistiginda default constructor icindeki sout da calisir*/
        System.out.println(" category3.id = " + category3.id); //yazdirir
        System.out.println(" category3.name = " + category3.name); //yazdirir
        System.out.println(" category3.siralamasi = " + category3.siralamasi); //yazdirir


        //Category sinifindaki 4.Constructor ile obje olusturma, bir paremetreli ama ayriyaten 2.constructoru cagiriyor
        Category category4 = new Category(4);
        /*calistiginda id si 35, name "özelCatogori" olan bir obje ile birlikte siralamayida alip yeni bir obje olusturur*/
        System.out.println(" category4.id = " + category4.id);  //yazdirir
        System.out.println(" category4.name = " + category4.name); //yazdirir
        System.out.println(" category4.siralamasi = " + category4.siralamasi); //yazdirir



        // olusturulan objeleri yazdiralim

        Category[] categorieList = {category1, category2, category3, category4};

        for ( Category categori : categorieList) {  // foreach ile objelerin alanlarina ulasabilirz ve yazdirabilirz
            System.out.println("Category Id = " + categori.id);
            System.out.println("Category name = " + categori.name);
            System.out.println("Category siralama = " + categori.siralamasi);

        }




        System.out.println(" category1.id = " + category1.id);  // id yi alt satirlarda yazdiriyor
        System.out.println(" category1.name = " + category1.name); // name i alt satirlarda yazdiriyor
        System.out.println(" category1.siralamasi = " + category1.siralamasi); // siralamasi ni alt satirlarda yazdiriyor



        System.out.println(" category2.id = " + category2.id);     // id yi alt satirlarda yazdiriyor
        System.out.println(" category2.name = " + category2.name); // name i alt satirlarda  yazdiriyor




        System.out.println("\n----------bir metodun cagirilmasi----------------\n");

        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);  // bir yerde yaz her yerde kullan, product1 artik bir metot ile birlikte
        productManager.addToCart(product2);
        productManager.addToCart(product3);
        productManager.addToCart(product4);





























    }
}
