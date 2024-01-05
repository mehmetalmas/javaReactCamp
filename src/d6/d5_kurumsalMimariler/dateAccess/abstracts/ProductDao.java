package d6.d5_kurumsalMimariler.dateAccess.abstracts;

import d6.d5_kurumsalMimariler.entities.concretes.Product;

import java.util.List;

public interface ProductDao {

    void addToData(Product product);
    void uptadeData(Product product);
    void deleteData(Product product);
    Product getProduct(int id);
    List<Product> getAllProduct();

}
