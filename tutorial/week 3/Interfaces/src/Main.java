public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();

        // interfaceler de "new"lenemez fakat newlenen elemanın referansını tutabilir.
// bir interfacesin üyeleri publictir.
// interfaceler katmanlar arası geçişlerde kullanılır. (veri erişim - iş - arayüz)
// bir classlar birden fazla interfacei implamente edebilir fakat sadece bir classı extend edebilir.


    }
}