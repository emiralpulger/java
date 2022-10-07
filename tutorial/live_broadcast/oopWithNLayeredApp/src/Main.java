import business.ProductManager;
import business.core.logging.DatabaseLogger;
import business.core.logging.FileLogger;
import business.core.logging.Logger;
import business.core.logging.MailLogger;
import dataAccess.HibernateProductDao;
import dataAccess.JdbcProductDao;
import entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"Iphone XR",10000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(),new MailLogger()};

        ProductManager productManager = new ProductManager
                (new HibernateProductDao(),loggers);
        productManager.add(product1);

    }
}
