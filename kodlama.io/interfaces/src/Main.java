public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new EmailLogger());

        Customer emir = new Customer(1,"Emiralp","Ülger");
        customerManager.add(emir);
    }

}
