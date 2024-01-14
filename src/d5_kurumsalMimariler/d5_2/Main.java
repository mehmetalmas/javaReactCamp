package d5_kurumsalMimariler.d5_2;

import d5_kurumsalMimariler.d5_2.business.abstracts.ProductService;
import d5_kurumsalMimariler.d5_2.business.concretes.ProductManeger;
import d5_kurumsalMimariler.d5_2.core.JLoggerManegerAdapter;
import d5_kurumsalMimariler.d5_2.dateAccess.concretes.HibernateProductDao;
import d5_kurumsalMimariler.d5_2.entities.concretes.Product;

public class Main {
    public static void main(String[] args) {


        ProductService productService = new ProductManeger(new HibernateProductDao(), new JLoggerManegerAdapter());

        Product elma = new Product(1,2,"elma", 12, 50);
        productService.addProduct(elma);








































    }
}
