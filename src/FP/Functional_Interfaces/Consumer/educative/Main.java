package FP.Functional_Interfaces.Consumer.educative;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main{

    static class Student{
        public int age;
        public String name;

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Consumer<Student> consumerChangeAge = s1 -> s1.age += 5;
        Consumer<Student> consumerPrint = System.out::println;
        List<Student> studentList = Arrays.asList(new Student(18, "Andy"), new Student(19, "Jack"), new Student(20, "Dan"));

        System.out.println("Before chaining:");
        studentList.forEach(consumerPrint);

        System.out.println("----");

        System.out.println("After chaining:");
        studentList.forEach(consumerChangeAge.andThen(consumerPrint));
    }
}