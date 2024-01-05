package d6.d5_kurumsalMimariler;

import d6.d5_kurumsalMimariler.business.abstracts.ProductService;
import d6.d5_kurumsalMimariler.business.concretes.ProductManeger;
import d6.d5_kurumsalMimariler.core.JLoggerManegerAdapter;
import d6.d5_kurumsalMimariler.dateAccess.concretes.HibernateProductDao;
import d6.d5_kurumsalMimariler.entities.concretes.Product;

public class Main {
    public static void main(String[] args) {


        // normalde new leme yapilmalmali, ileride Spring IoC ile cözülecek, suan icin kötü kod
        ProductService productService = new ProductManeger(new HibernateProductDao(), new JLoggerManegerAdapter());

        // ProductManeger in constructoru bir ProductDao aliyor ProductDao bir interface yani onu imlement edenler
        // onun yerine kullanilabilir. HibernateProductDao, ProductDao yu implement etmis ondan burada kullanilabiliniyor
        // ileride HibernateProductDao yerine ProductDao yu implement eden baska bir seyi burada kullanabiliriz
        // sisteme AbcProductDao yu ekledik "new HibernateProductDao()" yerine "new AbcProductDao()" yaz ve yoluna devam et

        Product elma = new Product(1,2,"elma", 12, 50);
        productService.addProduct(elma);  // productService bir interface onun üzerinden ProductManeger in bir metoduna
                                          // ulasiyoruz, olusturdugumuz elma objesinin referansini giriyoruz ve dataya
                                          // ekliyoruz









































    }
}
