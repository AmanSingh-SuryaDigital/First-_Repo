package MethodREference;

import java.util.Arrays;
import java.util.List;

public class Mainclass {
    public static void main(String[] args) {

        List<String> name= Arrays.asList("Aman","Aman","Anajli");

        name.forEach(n -> System.out.println(n));

        name.forEach(System.out::println);
    }
}
