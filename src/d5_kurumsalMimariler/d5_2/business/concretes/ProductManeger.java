package d5_kurumsalMimariler.d5_2.business.concretes;

import d5_kurumsalMimariler.d5_2.business.abstracts.ProductService;
import d5_kurumsalMimariler.d5_2.core.LoggerService;
import d5_kurumsalMimariler.d5_2.dateAccess.abstracts.ProductDao;
import d5_kurumsalMimariler.d5_2.entities.concretes.Product;

import java.util.List;



public class ProductManeger implements ProductService {

    //--------------Dependency Injection-------------

    private ProductDao productdao;
    private LoggerService loggerService;

    public ProductManeger(ProductDao productdao, LoggerService loggerService) {
        this.productdao = productdao;
        this.loggerService= loggerService;
    }

    //--------------------------------------------------


    @Override
    public void addProduct(Product product) {
        if (product.getCategoryId() == 1) {
            System.out.println("Bu katogoride ürün kabul edilmiyor");
            return;
        }
        this.productdao.addToData(product);
        this.loggerService.logToSystem("Ürün eklendi : " + product.getName());

    }


    @Override
    public List<Product> getAll() {
        return null;
    }


















}
