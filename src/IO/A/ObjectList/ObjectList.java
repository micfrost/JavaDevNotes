package IO.A.ObjectList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class ObjectList {

    public static void main(String[] args) {
        String fileName = "IO_Object_List.ser";

        // Create a collection of Person objects
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John Doe", 30));
        persons.add(new Person("Jane Smith", 35));

        try {
            // Writing the collection to a file using ObjectOutputStream
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(persons);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Collection of objects written to file: " + fileName);

            // Reading the collection from a file using ObjectInputStream
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Person> personsRead = (List<Person>) objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();

            // Display the read objects
            System.out.println("Objects read from file:");
            for (Person person : personsRead) {
                System.out.println(person);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

