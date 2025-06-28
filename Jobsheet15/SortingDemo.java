import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {

    public static void main(String[] args) {
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Amel");
        daftarSiswa.add("Akmal");
        daftarSiswa.add("Bima");
        daftarSiswa.add("Fira");
        Collections.sort(daftarSiswa);

        System.out.println(daftarSiswa);

        ArrayList<Customer> customers = new ArrayList<>();

        Customer customer1 = new Customer(1, "Zakia");
        Customer customer2 = new Customer(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer(4, "Cica"));
        customers.add(2, new Customer(100, "Rosa"));

        customers.sort((c1,c2)->c1.name.compareTo(c2.name));

        System.out.println(customers);
    }
}