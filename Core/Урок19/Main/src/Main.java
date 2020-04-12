import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Employee employee0 = new Employee("Oleg", "o2l0e2g0", 2020);
        Employee employee1 = new Employee("Stepan", "s2t1e2p1an", 2121);
        Employee employee2= new Employee("Max", "m3a0x20", 3020);
        List<Employee> employeeList;
        employeeList = List.of(employee0, employee1, employee2);
        Methods.serialize(employee0);
        Methods.serialize(employeeList);
        System.out.println("Object deserialization");
        Methods.deserialize(employee0);
        System.out.println("List deserialization");
        Methods.deserialize(employeeList);

    }
}

