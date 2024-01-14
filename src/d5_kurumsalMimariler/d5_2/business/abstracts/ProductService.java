package d5_kurumsalMimariler.d5_2.business.abstracts;

import d5_kurumsalMimariler.d5_2.entities.concretes.Product;
import java.util.List;

public interface ProductService {

    void addProduct(Product product);
    List<Product> getAll();

}
