package d5_kurumsalMimariler.d5_2.dateAccess.concretes;
import d5_kurumsalMimariler.d5_2.dateAccess.abstracts.ProductDao;
import d5_kurumsalMimariler.d5_2.entities.concretes.Product;
import java.util.List;

public class HibernateProductDao implements ProductDao {
    @Override
    public void addToData(Product product) {
        // ....kodlar
        System.out.println("Hibernate ile "  + product.getName() + " dataya eklendi");
    }
    @Override
    public void uptadeData(Product product) {
    }
    @Override
    public void deleteData(Product product) {
    }
    @Override
    public Product getProduct(int id) {
        return null;
    }
    @Override
    public List<Product> getAllProduct() {
        return null;
    }
}
