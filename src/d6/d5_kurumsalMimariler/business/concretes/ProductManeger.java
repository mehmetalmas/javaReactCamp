package d6.d5_kurumsalMimariler.business.concretes;

import d6.d5_kurumsalMimariler.business.abstracts.ProductService;
import d6.d5_kurumsalMimariler.core.LoggerService;
import d6.d5_kurumsalMimariler.dateAccess.abstracts.ProductDao;
import d6.d5_kurumsalMimariler.entities.concretes.Product;

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
