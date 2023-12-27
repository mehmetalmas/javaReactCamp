package oopIntro;

public class Category {

    int id;
    String name;
    int siralamasi;

// 1.default constructor
    public Category(){
        //baska bir sinifta normal sekilde degerleri atayarak olusturdumuz her obje icin bu sout da calisir
        System.out.println("default constructor calisti");
    }

// 2.Iki parametreli bir constructor, belirtilen parametrelerde verilen objeler olusturur
    public Category(int id, String name){
        // bu siniftaki id ye girielen id yi ata / yada girilen id bu siniftaki id (this=bu siniftaki gibi anlami var)
        this.id = id;
        this.name = name;
    }

// 3.Uc parametreli bir constructor, belirtilen parametrelerde ve default constructor elemanlarina göre objeler olusturur
    public Category(int id, String name, int siralamasi){
        this(); //default constructor cagrilmis, bu constructor ile olusturulan her obje icin calisir, ilk sirada olmali
        this.id = id;
        this.name = name;
        this.siralamasi = siralamasi;
    }

// 3.Bir parametreli bir constructor, belirtilen parametre ile ve belirtildigi sekilde 2. constructora
// girilen parametreler ile obje olusturur
    public Category(int siralamasi){
        this(35, "özelCatogori"); //id si 35 olan ve name i özelCatogori olan durum sbt buna altta siralamsi eklenecek
        this.siralamasi = siralamasi;
    }






}
