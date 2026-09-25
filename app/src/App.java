package src;
import controllers.ProductController;

public class App {
    public static void main(String[] args) {
        ProductController controller = new ProductController();
        controller.run();
    }
}