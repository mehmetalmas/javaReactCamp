package d2_oopIntro;

public class D2_Product {

    //Encapsulation ve get set metotlari

    //------------------------------default Fieldlar------------------------------------------

    //gercek programlamada bu alanalari her zaman get ve set metotlari olusturulur, bunlari encapsulation yapariz,
    // private olmalilar
    int id;
    String name;
    double unitPrice;
    String detail;
    double discount = 10;
    double unitPriceAfterDiscount;

    //------------------------------private Fieldlar------------------------------------------

    private int id1; // set i ve get i olabilir
    private String name1; // set i ve get i olabilir
    private double unitPrice1; // set i ve get i olabilir
    private String detail1; // set i ve get i olabilir
    private double discount1 = 10; // set i (write islemi) ve get i (read islemi) olabilir,
 // private double unitPriceAfterDiscount1;  // indirimi hesaplayan bir tanimi olmali yani sadece get olabilir

    // sadece get metodu olan field lari burada tutmanin bir anlami yok silinebilir, cünkü o bir metot olarak islam
    // görüyor artik, constuctor icinde de olmaz oradan da parametre olarak silinir


    //------------------------------Constructorlar------------------------------------------


       // default constructor
    public D2_Product(){

    }

       // default fiealt larin parametreli constructoru, double unitPriceAfterDiscount sahip
    public D2_Product(int id, String name, double unitPrice, String detail,
                      double discount, double unitPriceAfterDiscount){
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
        this.discount = discount;
        this.unitPriceAfterDiscount =  unitPriceAfterDiscount;

    }


        // private fiealt larin parametreli constructoru, double unitPriceAfterDiscount sahip cünkü get metodu yapildi
    public D2_Product(int id1, String name1, double unitPrice1, String detail1,
                      double discount1 /*double unitPriceAfterDiscount1*/){
        this.id1 = id1;
        this.name1 = name1;
        this.unitPrice1 = unitPrice1;
        this.detail1 = detail1;
        this.discount1 = discount1;
        //  this.unitPriceAfterDiscount =  unitPriceAfterDiscount; // get oldugu icin yazilmasina gerek yok

    }

    // bir sinif olusturulurken her zaman fieald larin get ve set metotlari olusturulur böylece obje
    // olusturulurekn bu fieald lar üzerinde islem yapabilirz, bazi fielad lari sadece okuyabilmeli bazi
    // field larida yazabilmeliyiz, buna programci codu yazarken karar verir, mesela %10 indirimli fiyati sadece
    // okunmali bunun üzerinde bir yazim islemi yapilmamali, arkada bir hesap calisip sonucu getirmeli, her deger
    // icin %10 indirim elle yazilamaz


    //----------------------------private Fieldlar lerin get ve set metotlari----------------------------------

    public int getId1() {  //
        return id;
    }

    public void setId1(int id) {
        this.id = id;
    }

    public String getName1() {  //bana bir name olarak bir String döndürüyor ben onu bir yere atayacagim
        return name;
    }

    public void setName1(String name) { // ben birString name bir seye set ediyorum, örnegin ürünün ismi Lenova Leptop
        this.name = name;
    }

    public double getUnitPrice1() {
        return unitPrice;
    }

    public void setUnitPrice1(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDetail1() {
        return detail;
    }

    public void setDetail1(String detail) {
        this.detail = detail;
    }

    public double getDiscount1() {
        return discount;
    }

    public void setDiscount1(double discount) {
        this.discount = discount;
    }

    public double getUnitPriceAfterDiscount1() {
        return this.unitPrice1-(this.unitPrice1 * this.discount1 / 100); // dönmesini istedigimiz seyi programliyoruz,
        // this ile yazilabilirde yazilmiyabilirde
    }

   // setUnitPriceAfterDiscount  metodunu bilerek sildik cünkü sinif disindan ulasilmasini istemiyoruz,
   // böylece degistirilemiyecek, zaten privat oldugundan baska yerde gözükmez


}
