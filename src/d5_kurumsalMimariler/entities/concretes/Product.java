package d5_kurumsalMimariler.entities.concretes;

import d5_kurumsalMimariler.entities.abstracts.Entity;

public class Product implements Entity {

    // sinifin böyle bir sekilde kalmasi, extends veya imlemente edilmemisse bize ileride problem cikarabilir,
    // cünkü ileride tüm entities lere bir sinirlama getirelim dedigimizde bu ve vb seyleri yapamayiz. Bu
    // sinifin ne oldugunu kurdugumuz sisteme belirtmemiz gerekiyor yani sen bir entities elemanisin, sen bir
    // dataAccess elemanisin vb demeliyiz, bu bizi rahatlatir. Biz bu sinifa klasörü ile ayni bir
    // interface olusturup ona sen bir Entity oldugunu belirttik. Entity interface bu sinifin referansini tutuyor



    private int id;
    private int categoryId;
    private String name;
    private double unitPrice;
    private int unitsInStock;



    public Product(){
    }

    public Product(int id, int categoryId, String name, double unitPrice, int unitsInStock) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

















}
