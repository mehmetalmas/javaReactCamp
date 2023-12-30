package d3_inheritance.d3_2_inheritanceKullanimi;

public class D3_Main2 {
    public static void main(String[] args) {

        D5_IndividualCustomer2 mehmet = new D5_IndividualCustomer2();
        //D5_IndividualCustomer2, D4_Customer2 extends ettiginden kullanicilarin ortak alanlarina ulasir

        mehmet.id = 1;   //  D4_Customer2 den extends etti, custiomer larin ortak alani
        mehmet.cunstomerNummer = "0001"; //  D4_Customer2 den extends etti, custiomer larin ortak alani
        mehmet.firstName = "Mehmet";
        mehmet.lastName = "Elmas";
        mehmet.natiaonalIdentity = "9834838812018";

        //------------------------------------------------------------------------------

        D6_CorporateCustomer2 hepsiBurada = new D6_CorporateCustomer2();
        //D6_CorporateCustomer2, D4_Customer2 extends ettiginden kullanicilarin ortak alanlarina ulasir

        hepsiBurada.id = 2;
        hepsiBurada.cunstomerNummer = "0002";
        hepsiBurada.companyName = "Hepsi Burada";
        hepsiBurada.taxNummer = "9723NH65972USHG365";


        //------------------------------------------------------------------------------


        D9_CustomerSendika sendika = new D9_CustomerSendika();
        sendika.cunstomerNummer = "0003";




        D8_CustomerManager d8_customerManager = new D8_CustomerManager();
/*
        d8_customerManager.add(mehmet);
        //D8_CustomerManager da olusturalan metoda sinif referansi gecildiginden burada mehmet referansini kullanbiliyoruz
        d8_customerManager.add(hepsiBurada);
        //D8_CustomerManager da olusturalan metoda sinif referansi gecildiginden burada hepsiBurada referansini kullanbiliyoruz
        d8_customerManager.add(sendika);
        // sonradan farkli bir müsteri olarak gelen sendika, sistemimizde degisiklik yapmadan kullanabiliyoruz


 */


//----------------------yukarida yoruma alinmis tek tek kullanilan metotlar yeine bu kullanilabilir----------------

        D4_Customer2[] customer2s = {mehmet, hepsiBurada, sendika};
        d8_customerManager.addMultiple(customer2s);















    }
}
