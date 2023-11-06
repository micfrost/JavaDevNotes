package JAVA_3.IO_NIO.IO.A.E3_Object;

import java.io.*;

//      to write an object to a file and then read it back,
//      it is needed to serialize the object to bytes for writing and deserialize it back when reading.


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

public class ObjectSerialization {

    public static void main(String[] args) {
        String fileName = "IO_Object.ser";

        // Create an object to write to the file
        Person personToWrite = new Person("John Doe", 30);

        try {
            // Writing the object to a file using ObjectOutputStream
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(personToWrite);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Object written to file: " + fileName);

            // Reading the object from a file using ObjectInputStream
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Person personRead = (Person) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Object read from file: " + personRead);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
