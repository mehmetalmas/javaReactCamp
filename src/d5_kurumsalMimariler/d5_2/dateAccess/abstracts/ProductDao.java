package d5_kurumsalMimariler.d5_2.dateAccess.abstracts;
import d5_kurumsalMimariler.d5_2.entities.concretes.Product;
import java.util.List;

public interface ProductDao {

    void addToData(Product product);
    void uptadeData(Product product);
    void deleteData(Product product);
    Product getProduct(int id);
    List<Product> getAllProduct();
}
