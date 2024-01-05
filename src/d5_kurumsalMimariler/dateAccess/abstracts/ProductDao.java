package d5_kurumsalMimariler.dateAccess.abstracts;

import d5_kurumsalMimariler.entities.concretes.Product;

import java.util.List;

public interface ProductDao {
    /*
    ürun ile ilgili neler yapilabilir
    ürün ekleme
    ürün silme
    ürün listeleme
    ürün güncelleme gibi kodlar yazilabilir
     */

    void addToData(Product product);
    void uptadeData(Product product);
    void deleteData(Product product);
    Product getProduct(int id); // bana bir id verirsen o id numarali ürünü sana getiririm
    List<Product> getAllProduct();// listelenmis ürünleri getirir, ArrayList ile calisiyoruz üye ekleme problemi yok
                           // List, ArrayList in base hem ArrayList tutuyor hemde onu türeten imlement eden nesneleri,
                           // List interface dir
                           // ArrayList<Integer> sayialar = new ArrayList<Integer>(); örnek icin yazildi







}
