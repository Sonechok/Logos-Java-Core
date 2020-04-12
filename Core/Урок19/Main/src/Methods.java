import java.io.*;
import java.util.List;

public class Methods {
    public static void serialize(Employee employee) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("info.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    public static void serialize(List list) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("infoList.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    public static Employee deserialize(Employee employee) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("info.txt");
        ObjectInputStream oin = new ObjectInputStream(fis);
        employee = (Employee) oin.readObject();
        System.out.println(employee.toString());
        return employee;
    }

    public static List deserialize(List list) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("infoList.txt");
        ObjectInputStream oin = new ObjectInputStream(fis);
        list = (List) oin.readObject();
        System.out.println(list.toString());
        System.out.println(list);
        return list;
    }
}
