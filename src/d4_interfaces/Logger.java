
/*
    Biz interface ler olusturup o interfasleri imlement eden class lara bir uyuma zorluyoruz, bir tasarima
    zorluyoruz, her sey bir tasarim sekline göre ilerlesin, bir yönetmelige göre hersey olsun diye interface
    olustururuz, Interface ler bie modelleme imkanlari verir, interface ler operasyonlarimizi(metotlari) dogru
    gruplara ayirmamizi sagliyor.

    Bir sinif sadece bir sinifi extends eder ama bir sinif birden fazal interface imlement edebilir, bir anne
    olur ama birden fazla akraba olabilir

    Bir interface ile operasyonlarimizi nasil düzenleriz, buna interfacemize sadece imzali metotlar koyarak yapariz ve
    bu metotlarin interface imlement eden class lar tarafindan icinin doldurulmasini isteriz. void log(String message);
    gibi

    interface ler extends edilen ebeveyn siniflari gibi referans tutatlar, ebeveyn sinifinda olusturulan bir metot a
    sadece ebeveyn sinifinin referansi gecildiginde cocularinin referansi ile de bu metotlar calisiyordu ayni sey
    interfaceler icinde gecerlidir

*/


package d4_interfaces;
public interface Logger {

    void log(String message);












}
