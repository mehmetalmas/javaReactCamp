package d5_kurumsalMimariler.dateAccess.concretes;

import d5_kurumsalMimariler.dateAccess.abstracts.ProductDao;
import d5_kurumsalMimariler.entities.concretes.Product;

import java.util.List;

public class HibernateProductDao implements ProductDao {


    @Override
    public void addToData(Product product) {
        // .... ürünü dataya eklenecek sekilde kodlari yazdik simdi yazdiralim
        System.out.println("Hibernate ile "  + product.getName() + " dataya eklendi");  // olusturulacak ürünün adi eklendi

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
