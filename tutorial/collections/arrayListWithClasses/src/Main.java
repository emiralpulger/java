import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer engin = new Customer(1,"Emiralp","Ülger")
        customers.add(engin);
        customers.add(new Customer(2,"Emir","Ülger"));
        customers.add(new Customer(3,"Emirhan","Ülger"));

        customers.remove(engin);

        for (Customer customer: customers){
            System.out.println(customer.firstname);
        }

    }
}