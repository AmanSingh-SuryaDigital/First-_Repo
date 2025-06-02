package Lamda_Expression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Mainclass {

public static int write(List<String> name, Consumer<String> con){
int c=0;
    for(String s : name){
        con.accept(s);

        c++;
    }
return c;
    }

    public static void main(String[] args) {

        List<String> naam = Arrays.asList("Aman","Aman Singh", "Aman Singh Rajawat","the coder Aman");

        write(naam,(n)-> System.out.println(n) );

    }

}
