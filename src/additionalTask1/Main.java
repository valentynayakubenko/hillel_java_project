package additionalTask1;


public class Main extends Product {


    public Main(String article, String price, String productDescription, boolean isAvailable) {
        super(article, price, productDescription, isAvailable);
    }

    public static void main(String[] args) {
        Product tea = new Product("Greenfield", "100", "Greenfield tea", true);
        Product coffee = new Product("Jacobs", "200", "Jacobs coffee", false);
        Product milk = new Product("Nesquik", "50", "Milk", true);

        coffee.setPrice("250");
        coffee.isAvailable = true;

        System.out.println("Tea: " + tea.getArticle() + ", Prise: " + tea.getPrice() + ", Description: " + tea.getProductDescription() + ", Available: " + tea.isAvailable());
        System.out.println("Coffee: " + coffee.getArticle() + ", Prise: " + coffee.getPrice() + ", Description: " + coffee.getProductDescription() + ", Available: " + coffee.isAvailable());
        System.out.println("Milk: " + milk.getArticle() + ", Prise: " + milk.getPrice() + ", Description: " + milk.getProductDescription() + ", Available: " + milk.isAvailable());
    }
}
