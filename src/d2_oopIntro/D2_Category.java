package d2_oopIntro;

public class D2_Category {

    int id;
    String name;
    int siralamasi;

// 1.default constructor
    public D2_Category(){
        //baska bir sinifta normal sekilde degerleri atayarak olusturdumuz her obje icin bu sout da calisir
        //System.out.println("default constructor calisti");
    }

    //2.Iki parametreli bir constructor, belirtilen parametrelerde verilen objeler olusturur
    public D2_Category(int id, String name){
        // bu siniftaki id ye girielen id yi ata / yada girilen id bu siniftaki id (this=bu siniftaki gibi anlami var)
        this.id = id;
        this.name = name;
        this.siralamasi = siralamasi;
    }

// 3.Uc parametreli bir constructor, belirtilen parametrelerde ve default constructor elemanlarina göre objeler olusturur
    public D2_Category(int id, String name, int siralamasi){
        this(); //default constructor cagrilmis, bu constructor ile olusturulan her obje icin calisir, ilk sirada olmali
        this.id = id;
        this.name = name;
        this.siralamasi = siralamasi;
    }

// 3.Bir parametreli bir constructor, belirtilen parametre ile ve belirtildigi sekilde 2. constructora
// girilen parametreler ile obje olusturur
    public D2_Category(int siralamasi){
        this(35, "özelCatogori"); //id si 35 olan ve name i özelCatogori olan durum sbt buna altta siralamsi eklenecek
        this.siralamasi = siralamasi;
    }




   //----------------------------------Olmasa gereken sinif yapisi-----------------------------------------------------



    private int id1;
    private String name1;
    private int siralamasi1;
    private String katogorisi1;

    public D2_Category(int id1, String name1, int siralamasi1, String katogorisi1){
        this.id1 = id1;
        this.name1 = name1;
        this.siralamasi1 = siralamasi1;
        this.katogorisi1 = katogorisi1;

    }




    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public String getName1() {
        return name1 + "!";   // Patron her isimden sonra ünlem olmasini istedi
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getSiralamasi1() {
        return siralamasi1;
    }

    public void setSiralamasi1(int siralamasi1) {
        this.siralamasi1 = siralamasi1;
    }

    public String getKatogorisi1() {
        return katogorisi1;
    }

    public void setKatogorisi1(String katogorisi1) {
        this.katogorisi1 = katogorisi1;
    }




































}
