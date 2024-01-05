package d5_kurumsalMimariler.business.abstracts;

import d5_kurumsalMimariler.entities.concretes.Product;

import java.util.List;

public interface ProductService {

    void addProduct(Product product);
    List<Product> getAll();


}
