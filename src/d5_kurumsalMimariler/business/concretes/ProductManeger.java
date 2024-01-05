package d5_kurumsalMimariler.business.concretes;

import d5_kurumsalMimariler.business.abstracts.ProductService;
import d5_kurumsalMimariler.dateAccess.abstracts.ProductDao;
import d5_kurumsalMimariler.entities.concretes.Product;
import java.util.List;



public class ProductManeger implements ProductService {

    //--------------Dependency Injection-------------

    private ProductDao productdao; // HibernateProductDao referansini tutan interface olan ProductDao

    public ProductManeger(ProductDao productdao) { //ProductDao gecerek ProductDao yu imlement edenlerin bu constructuru
        this.productdao = productdao;              // kullanbilmesini istiyoruz HibernateProductDao bunu kullanabilir
                                                   // productdao referansi ile HibernateProductDao elemanlarina
                                                   // ulasabilecegiz
    }

    //--------------------------------------------------



    @Override
    public void addProduct(Product product) {


        // bir ürün eklenirken ilk bunu kontrol et
        if (product.getCategoryId() == 1) {
            System.out.println("Bu katogoride ürün kabul edilmiyor");
            return; // bos return olayi bitirir asagiya devam etmez, bundan kullanilir
        }

        // sonra ekle
        this.productdao.addToData(product);  // Dependency Injection, bagilik tan kurtulmak icin böyle kullanilir
                                       // bu metot ürünü dataya ekleyecek, productdao interface böylece interface
                                       // üzerinden calisiyoruz
    }



    @Override
    public List<Product> getAll() {
        return null;
    }


/*
        add metodundaki

        this.productdao.add(product); yerien hemen alttaki kodlar da olabilir di

        HibernateProductDao dao = new HibernateProductDao();
        dao.add(product);

        böyle bir kullanim calisir ama add metodunu HibernateProductDao bagimli yapar ileride Hibernate yerine baska
        sey kullanmak istersen sorun yasarsin bunu yerine Dependency Injection kullanilir. yani söyle deriz Sen
        dataAcces e baglisin ama sadece gevsek baglisin, dataAcces in sadece referans tutucu olan abstracts
        klasöründeki yapisina baglanabilirisin

        Dependency Injection kısaca bir nesnenin bağımlılıklardan kurtulmasını sağlayan ve o nesneyi olabildiğince
        bağımsızlaştırmayı sağlayan bir programlama tekniğidir. Dependency Injection kullanılarak; bir nesnenin
        sınıfın bağımlı olduğu nesneden bağımsız hareket edebilmesi sağlanabilmektedir. Bu da kod üzerinde yapılacak
        olan değişikliklerde, geliştirmelerde kodda değişiklik yapmamıza gerek kalmamasını sağlar.

        Bağımlılık oluşturacak olan nesneleri direkt olarak kullanmak yerine, bağımlılık oluşturacak olan bu nesnelerin
        dışarıdan verilmesi ile birlikte sistem içerisindeki bağımlılığın minimize edilmesi amaçlanır. Bu şekilde bağımlılık
        bulunan sınıf üzerindeki değişikliklerden korunulmuş olunur.

        Unit testlerin yazımını kolaylaştırırken doğruluğunu da arttırmaktadır. Yazılım içerisinde bulunan
        componentlerin “loosely coupled” gevşek bağlı olmasını sağlar. Bu şekilde bağımsızlığı sağlanan sınıflar tek
        başına test edilebilirler.

        Nasil yapilir

        ilk önce bu sinifta interface olan ProductDao dan bir "private ProductDao productdao" degiskeni olusturulur
        sonra bu variable constructor u olusturulur, bu Injection anlamina gelir
        public ProductManeger(ProductDao productdao) {
             this.productdao = productdao;
        }

        artik Hibernate bagimliliktan kurtulduk ama Hibernate referansini tutabilen ProductDao ile bundan kurtuldun
        HibernateProductDao, ProductDao yu imlement ettigi icin ProductDao yu kullanabiliyorum ve ileride yapacagiiz
        degisiklikler cok kolay olacak, degisiklikleri ProductDao da yapacagim

        en son kontolü constrocturu kullanarak asagidaki sekilde yapariz

        this.productdao.add(product);



*/

















}
