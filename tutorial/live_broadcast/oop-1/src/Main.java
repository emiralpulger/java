public class Main {
    public static void main(String[] args) {
        // set value = değer atamaya denir
        String mesaj = "Vade oranı";
        //  get = okumaya denir
        //System.out.println(product1.name);

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(17);
        product2.setUnitPrice(4455);
        product2.setUnitsInStock(75);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(4);
        product3.setUnitPrice(15500);
        product3.setUnitsInStock(12);
        product3.setImageUrl("image3.jpg");

        Product[] products = {product1,product2,product3};

        for (Product product: products) {
            System.out.println(product.getName());

        }
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05222222222");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Emiralp");
        individualCustomer.setLastName("Ülger");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Alhabet");
        corporateCustomer.setPhone("051111111111");
        corporateCustomer.setTaxNumber("1111111111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = {individualCustomer,corporateCustomer};

    }
}