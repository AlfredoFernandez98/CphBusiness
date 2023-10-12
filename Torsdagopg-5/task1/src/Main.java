import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer("Alfredo", "Fernandez", "Alfredo98", 2345432);
        Customer customer2 = new Customer("Melissa", "Clemmensen", "Melissa03", 1234543);


        customers.add(customer1);
        customers.add(customer2);

        printCustomers(customers);

    }
    public static void printCustomers (ArrayList < Customer > customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}