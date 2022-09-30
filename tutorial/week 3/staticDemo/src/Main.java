public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 10;
        product.name = "";

        manager.add(product);
        /*
        static pek sık kullanılmaz, kullanıldığı zamanlar static bellekten atılmaz uygulama
        sonlandığı zaman bellekten atılır.
         */
        DatabaseHelper.Connection.createConnection();
    }
}