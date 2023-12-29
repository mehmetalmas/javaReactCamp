package d2_oopIntro;

public class D1_Main {
    public static <Product1> void main(String[] args) {



        System.out.println("\n----------Sinifinda constructor olusturmadan obje olusturma----------------\n");

        D2_Product product1 = new D2_Product(); // obje. referans olusturma (instance)
        product1.id = 1;
        product1.name = "Lenova V14";
        product1.unitPrice = 1500;
        product1.detail = "8 GB Ram";

        //-------------------------------------------------------------------------------------------------

        D2_Product[] productsList1 = {}; // bu esitligin karsisinda getProducts() diye bir metot koyarlar bu metot
                                      // verileri buradaki listeye getirir
        System.out.println( "productsList1 uzunlugu = " + productsList1.length); // 0 yazdirir, hic elemani yok

        //-------------------------------------------------------------------------------------------------

        D2_Product[] productsList2 = {product1};
        System.out.println( "productsList2 uzunlugu = " + productsList2.length); // 1 yazdirir, 1 tane obje elemani var

        //-------------------------------------------------------------------------------------------------

        D2_Product product2 = new D2_Product(); // obje. referans olusturma (instance)
        product2.id = 2;
        product2.name = "Lenova V15";
        product2.unitPrice = 1700;
        product2.detail = "16 GB Ram";

        //-------------------------------------------------------------------------------------------------

        D2_Product product3 = new D2_Product(); // obje. referans olusturma (instance)
        product3.id = 3;
        product3.name = "Lenova V14T";
        product3.unitPrice = 1600;
        product3.detail = "16 GB Ram";

        //-------------------------------------------------------------------------------------------------

        D2_Product product4 = new D2_Product(); // obje. referans olusturma (instance)
        product4.id = 4;
        product4.name = "Lenova V14TM";
        product4.unitPrice = 1900;
        product4.detail = "32 GB Ram";

        //-------------------------------------------------------------------------------------------------

        D2_Product[] productsList3 = {product1, product2, product3, product4};
        System.out.println( "productsList3 uzunlugu = " + productsList3.length); // 4 yazdirir, 4 tane obje elemani var

        for ( D2_Product produck : productsList3) {  // foreach ile objelerin alanlarina ulasabilirz ve yazdirabilirz
            System.out.println("Produck Id = " + produck.id);
            System.out.println("produck name = " + produck.name);
            System.out.println("produck unitPrice = " + produck.unitPrice);
            System.out.println("produck detail = " + produck.detail);
        }













        System.out.println("\n----------Sinifinda constructor olusturarak obje olusturma----------------\n");


        //Category sinifindaki 1.Constructor(default) ile obje olusturma
        D2_Category category1 = new D2_Category();
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
        D2_Category category2 = new D2_Category(2,"Telefonlar"); //constructor ile obje olusturma
        System.out.println(" category2.id = " + category2.id);     // id yi üst satirda yazdirmiyor neden
        System.out.println(" category2.name = " + category2.name); // name i üst satirda yazdirmiyor neden






        System.out.println("\n----------constructorlarin Birbirlerini cagirmasi----------------\n");


        //Category sinifindaki 3.Constructor ile obje olusturma, uc paremetreli ama ayriyaten default constructoru cagiriyor
        D2_Category category3 = new D2_Category(3, "Ekranlar", 3);
        /*calistiginda default constructor icindeki sout da calisir*/
        System.out.println(" category3.id = " + category3.id); //yazdirir
        System.out.println(" category3.name = " + category3.name); //yazdirir
        System.out.println(" category3.siralamasi = " + category3.siralamasi); //yazdirir


        //Category sinifindaki 4.Constructor ile obje olusturma, bir paremetreli ama ayriyaten 2.constructoru cagiriyor
        D2_Category category4 = new D2_Category(4);
        /*calistiginda id si 35, name "özelCatogori" olan bir obje ile birlikte siralamayida alip yeni bir obje olusturur*/
        System.out.println(" category4.id = " + category4.id);  //yazdirir
        System.out.println(" category4.name = " + category4.name); //yazdirir
        System.out.println(" category4.siralamasi = " + category4.siralamasi); //yazdirir



        // olusturulan objeleri yazdiralim

        D2_Category[] categorieList = {category1, category2, category3, category4};

        for ( D2_Category categori : categorieList) {  // foreach ile objelerin alanlarina ulasabilirz ve yazdirabilirz
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

        D2_ProductManager productManager = new D2_ProductManager();
        productManager.addToCart(product1);  // bir yerde yaz her yerde kullan, product1 artik bu metot ile birlikte
        productManager.addToCart(product2);  // bir yerde yaz her yerde kullan, product1 artik bu metot ile birlikte
        productManager.addToCart(product3);  // bir yerde yaz her yerde kullan, product1 artik bu metot ile birlikte
        productManager.addToCart(product4);  // bir yerde yaz her yerde kullan, product1 artik bu metot ile birlikte











        System.out.println("\n----------get ve set metotlari----------------\n");

        // bir obje olusturuluo kesinlikle boyle birakilmaz
        // diyelim ki diskont u 100 class da kullandik, sonra ona bir kural getirmemiz gerekti diyelim,
        // durumda 100 farkli yeri degistirmen gerekecek, ayriyaten herkes bu kodlari baska yerleden degistirebilir
        // iste bundan dolayi biz sinflardaki alanlari private
        // yapip sonra bunlara get ve set ler ile ulasiriz

        // Bu mantikla obje olusturmak gercek programlama da olmaz
        D2_Product product5 = new D2_Product(); // obje. referans olusturma (instance)
        product5.id = 5;
        product5.name = "Lenova Ultra T213";
        product5.unitPrice = 2500;
        product5.detail = "32 GB Ram";
        product5.discount = 10;
        product5.unitPriceAfterDiscount = 2350; // elle girilmis bir indirim


        //gercekte obje olusturma mantigi asagidaki gibi set ve set metotlari ile olur
         D2_Product product6 = new D2_Product();
         product6.setId1(6);
         product6.setName1("Asus Ultrabook T23");
         product6.setUnitPrice1(1900);
         product6.setDetail1("32 GB Ram");
         product6.setDiscount1(10);
        System.out.println(product6.getUnitPriceAfterDiscount1());  // yazamiyoruz sadece okuyoruz
        // UnitPriceAfterDiscount1 set'i olmadigindan ulasamayiz


        System.out.println("\n----------get ve set metotlarinin faydasi----------------\n");

        // bu objelerin farkli siniflarda oldugunu ve daha fazla oldugunu düsün
        D2_Category d2_category1 = new D2_Category(5, "Icecekler");
        D2_Category d2_category2 = new D2_Category(6, "Sulu yemekler");
        D2_Category d2_category3 = new D2_Category(7, "Mezeler");
        D2_Category d2_category4 = new D2_Category(8, "Tatlilar");

        System.out.println(d2_category1.name);
        System.out.println(d2_category2.name);
        System.out.println(d2_category3.name);
        System.out.println(d2_category4.name);

        //Birgün Patron dedi ki her katagori isminin sonunda ! olsun, get ve set kullanmazsan her sinifa gidip bunu el
        // ile düzenlemek, eklemek zorunda kalirsin

        System.out.println(d2_category1.name + "!" );  // bunlar gibi, yüzlerce sinifta oldugunu düsün
        System.out.println(d2_category2.name + "!" );
        System.out.println(d2_category3.name + "!" );
        System.out.println(d2_category4.name + "!" );




        // yada name in get metotuna gidersin  return a     + "!"     eklersin ve hersey düzelir



        D2_Category d2_category5 = new D2_Category();
        d2_category5.setId1(1);
        d2_category5.setName1("Kadayif");
        d2_category5.setSiralamasi1(1);
        d2_category5.setKatogorisi1("Tatlilar");

        D2_Category d2_category6 = new D2_Category();
        d2_category6.setId1(2);
        d2_category6.setName1("Baklava");
        d2_category6.setSiralamasi1(2);
        d2_category6.setKatogorisi1("Tatlilar");


        D2_Category d2_category7 = new D2_Category();
        d2_category7.setId1(2);
        d2_category7.setName1("Söbiyet");
        d2_category7.setSiralamasi1(2);
        d2_category7.setKatogorisi1("Tatlilar");

        System.out.println(d2_category5.getName1());  // getName e  + "!"  ekledik böylece tüm isimlere  ! eklendi
        System.out.println(d2_category6.getName1());
        System.out.println(d2_category7.getName1());
















































    }
}
