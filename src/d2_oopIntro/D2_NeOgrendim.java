package d2_oopIntro;

public class D2_NeOgrendim {

/*

1). Constructor olusturmadan obje olusturmanin kod tekrarina sebep oldugunu ve daha cok sey yazarak süreci uzattigini

                        ----------------------------------------------------------------------

2). Bir sinifin aslinda ikiye bölünmesi gerektigini özellikleri tutan ve is yapan olarak, Product sinifi alanlari,
 constructur lari ve get ve set metolarini tutatken, ProduckManeger metotlari tutuyor

                        ----------------------------------------------------------------------

3). Constructur olusturmayi, this ve this() in kullanimlarini

    public Category(int id, String name, int siralamasi){
        this(); //default constructor cagrilmis, bu constructor ile olusturulan her obje icin calisir,ilk sirada olmali
        this.id = id;
        this.name = name;
        this.siralamasi = siralamasi;
    }

                       ----------------------------------------------------------------------

4). Bir objeyi veya objeler array'e koymayi

  D2_Product[] productsList = {product1};     // objenin referansi geciliyor
     System.out.println( "productsList uzunlugu = " + productsList.length); // 1 yazdirir, 1 tane obje elemani var

    veya

  D2_Product[] productsList = {product1, product2, product3, product4};
        System.out.println( "productsList uzunlugu = " + productsList.length); // 4 yazdirir, 4 tane obje elemani var

                       ----------------------------------------------------------------------

5). Array deki obje veya obyelerin elamanlarinin nasil yazdirilabilecegini

    Product[] productsList = {product1, product2, product3, product4};

        for (Product produck : productsList) {  // foreach ile objelerin alanlarina ulasabilirz ve yazdirabilirz
            System.out.println("Produck Id = " + produck.id);
            System.out.println("produck name = " + produck.name);
            System.out.println("produck unitPrice = " + produck.unitPrice);
            System.out.println("produck detail = " + produck.detail);
        }

    Her obje icin sirayla bu alanlari yazdiracak

                       ----------------------------------------------------------------------

6). Bir metota obje gecerek alanlari ile bu metodu her yerde kullanabilecegimi

    public void addToCart(Product product){
        System.out.println("Sepete eklendi " + product.id);
    }


     * Produck sinifinda olusturulan her obje bu metodu kullabilir gecilen bu parametre sayesinde
     * Bu metot is yaptigi icin ProductManager sinifinda olmali
     * addToCart(sepete ekle) genel de her ürünün(objenin) altinda olur, biz bunu bir kere yazip sinif referansini
     parametre olarak ayarlayinca bu sinifin tüm objeleri bu metodu kullanabiliyor. Bir degisiklik gerektiginde de bu
     metot 1 tane oldugundan burada yaptigim degisiklik tüm bu metodu kullanan objeler icin cabucak uygulaniyor
     Bir kere yaz her yerde kullan, BIRDEN FAZLA KULLANILACAK HER METOT HER ZAMAN TEK OLMALI DIYE DÜSÜNMELISIN,
     DEFALARCA AYNI METODU HER YERDE YAZARSAN BIR DEGISIKLIK ANINDA AYVAYI YERSIN

     ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);
        productManager.addToCart(product4);

     * product1 referans ve Produck sinifinin bir objesi, digerleride öyle
     * ürün1(product1) in altindaki addToCart butonuna basildiginda ürünü id numarsina göre sepete ekleyecek metot

                   ----------------------------------------------------------------------

7). get ve set metotlarinin neden önemli oldugunu

    * set ve get metotlari özellik sinifinda olmali
    * alanlari private yapmak isteriz böylece baska yerden alanlarimiz gözükmez ve degistirilemez
    * ama bu alanlara yeni objeler olusturuken bir sekilde ulasip 0/*-yeni objeler icin atama yapilmasi gerekecek
    * private olan alanlara yazmak ve okumak icin set ve get metotlerina ihtiyac duyariz
    * set ile yazma yapar get ile okuma yapariz
    * alanlarin set veya get metotlarina ihtiyaci olup olmadigini programci karar verir
    * bazi alanlar baska alanlari kullanark bir islem yapar, baska is yapmasi veya atama yapilmasi istenmez
      bu alanlarin sadece get olmasi gerekir, böyle alanlarin sadece get metodu olur, alanlardan silinirler
      ve constructor' a parametre olarak gecilmezler, bu get metodu ise istenilen yerlede kullanilir

    örnek: getUnitPriceAfterDiscount bir alan olarak düsünüldü ama üzerinde belirli bir islem yaptigindan get metodu
    olusturulup alanlardan silindi

    public double getUnitPriceAfterDiscount() {
       return this.unitPrice-(this.unitPrice * this.discount / 100); // indirimden sonraki fiyatini dönmesini istiyoruz
    }

    * Bir gün patron dedi ki tüm ürün isimlerinin sonunda ! olsun, simdi sen get ile objelerini olusturmadi isen
    tüm objelerini bulup name lerin arkasina  + " ! " eklemelisin 100 lerce sinif 1000 lerce obje oldugunu düsün
    ama get metodu ile objelerini olusturdu isen get metoduna gir metodun sonuna + " ! " ekle herye otomatik düzelsin




8). get ve set metotlarinin kullanimini

    Product product = new Product();
      product.setId(6);   // set ile id sini 6 atadik, setId() metodu onu yapiyor
      product.setName("Asus Ultrabook T23");  // name ini "Asus Ultrabook T23" atadik, setName() metodu onu yapiyor
      product.setUnitPrice(1900);        //....
      product.setDetail("32 GB Ram");    //....
      product.setDiscount(10);           //....
      System.out.println(product.getUnitPriceAfterDiscount1());  // yazamiyoruz sadece get ile okuyoruz


     // UnitPriceAfterDiscount1 set'i olmadigindan ulasamayiz(atama yapilmaz) zaten buna ihtiyaci yok bir islem yapiyor














 */

































































}
