package br.com.likwi;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class ExamplesTest {

    @Test
    public void for_with_objects() {
        final ArrayList<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add("2");

        for (Object number : numbers) {
            System.out.println("number = " + number);
        }
        assumeTrue(true);
    }

    @Test //EXCEPTION
    public void for_with_objects_cast() {

        final ArrayList<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add("2");

        Exception exception = assertThrows(RuntimeException.class, () -> {
            for (Object number : numbers) {
                System.out.println("number = " + (String) number); //this cast should throw a ClassCastException
            }
        });
        assumeTrue(true);
    }

    @Test
    public void comaparableNumber() {
//        Comparable number=10;
//        number.compareTo("10");
        Comparable<Integer> number = 10;
        System.out.println("number.compareTo(10) = " + number.compareTo(10));

        assumeTrue(true);
    }

    @Test
    public void java_type() {

        //placeholder E -> String
        final ArrayList<String> names = new ArrayList<>();
        names.add("john");

        //placeholder E -> Integer
        final ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);

        final HashMap<String, String> map = new HashMap<>();
        final HashMap<Point, String> mapPoint = new HashMap<>();

        assumeTrue(true);
    }

    @Test
    public void java_type_convention() {

        /**
        E – Element
        K – Key (Used in Map)
        N – Number
        T – Type
        V – Value (Used in Map)
         **/

        assumeTrue(true);
    }

}
