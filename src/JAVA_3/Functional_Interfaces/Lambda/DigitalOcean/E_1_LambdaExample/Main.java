package JAVA_3.Functional_Interfaces.Lambda.DigitalOcean.E_1_LambdaExample;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // No parameters; void result
        Runnable runnable1 = () -> {};

        // No parameters, expression body
        Supplier<Integer> supplier1 = () -> 42;

        // No parameters, expression body
        Supplier<Object> supplier2 = () -> null;

        // No parameters, block body with return
        Supplier<Integer> supplier3 = () -> { return 42; };

        // No parameters, void block body
        Runnable runnable2 = () -> { System.gc(); };

        // Complex block body with multiple returns
        Supplier<Integer> supplier4 = () -> {
            if (true) return 10;
            else {
                int result = 15;
                for (int i = 1; i < 10; i++)
                    result *= i;
                return result;
            }
        };

        // Single declared-type argument
        Function<Integer, Integer> function1 = x -> x + 1;

        // Single declared-type argument
        Function<Integer, Integer> function2 = x -> { return x + 1; };

        // Single inferred-type argument
        Function<Integer, Integer> function3 = (x) -> x + 1;

        // Parenthesis optional for single inferred-type case
        Function<Integer, Integer> function4 = x -> x + 1;

        // Single declared-type argument
        Function<String, Integer> function5 = (String s) -> s.length();

        // Single declared-type argument
        Consumer<Thread> consumer1 = (Thread t) -> { t.start(); };

        // Single inferred-type argument
        Function<String, Integer> function6 = s -> s.length();

        // Single inferred-type argument
        Consumer<Thread> consumer2 = t -> { t.start(); };

        // Multiple declared-type parameters
        BinaryOperator<Integer> binaryOperator1 = (x, y) -> x + y;

        // Multiple inferred-type parameters
        BinaryOperator<Integer> binaryOperator2 = (x, y) -> x + y;


    }
}
