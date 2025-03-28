package additionalTask1;

public class Product {

    public String article;
    public String price;
    public String productDescription;
    public boolean isAvailable;

    public Product(String article, String price, String productDescription, boolean isAvailable) {
        this.article = article;
        this.price = price;
        this.productDescription = productDescription;
        this.isAvailable = isAvailable;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}
