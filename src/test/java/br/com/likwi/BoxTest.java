package br.com.likwi;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BoxTest {

    private String brand = "Samsung";
    private String sender = "renato@likwi.com.br";

    @Test
    public void java_generics_new_box() {
        final Box<Phone> box = new Box<>();
        box.set(new Phone(this.brand));

        final Box<Letter> letter = new Box<>();
        letter.set(new Letter(this.sender));

        assertEquals(this.brand, box.get().toString());
        assertEquals(this.sender, letter.get().toString());

    }

    @Test
    public void java_generics_method() {

        String[] names = {"Renato", "John"};
        Character[] letters = {'a', 'b', 'c', 'd'};
        print(names);

        assertTrue(true);
    }

    @Test
    public void java_generics_counded_type() {

        Integer[] numbersInt = {1, 2, 3};
        System.out.println("countGreaterThan(numbers, 1) = " + countGreaterThan(numbersInt, 1));
        Double[] numbersDouble = {1.0, 2.2, 3.1};
        System.out.println("countGreaterThan(numbersDouble,1) = " + countGreaterThan(numbersDouble, 1d));

        assertTrue(true);
    }

    @Test
    public void java_generics_unbounded_wildcard() {

        final List<Object> list1 = Arrays.asList("1", 2, 12d);
        final List<String> list2 = Arrays.asList("1", "2", "3");

        print(list1);
        print(list2);

        assertTrue(true);
    }
    @Test
    public void java_generics_upper_bounded() {

        final List<Number> list1 = Arrays.asList(1, 2, 12d);
        final List<Integer> list2 = Arrays.asList(1, 5, 10);
//        final List<Object> list1 = Arrays.asList("1", 2, 12d);
//        final List<String> list2 = Arrays.asList("1", "2", "3");

        printWithRestrictionsType(list1); //always that extends Number, like double or integer
        printWithRestrictionsType(list2);

        assertTrue(true);
    }


    static <T> T print(T[] array) {
        for (T e : array) {
            System.out.println("e.getClass().getName() = " + e.getClass().getName().concat(" - " + e));
        }
        return array[0];
    }

    static <T extends Comparable<T>> int countGreaterThan(T[] numbers, T number) {
        int count = 0;
        for (T n : numbers) {
            if (n.compareTo(number) > 0) count++;
        }
        return count;
    }

    static void print(List<?> list) {
        list.forEach(System.out::println);
    }

    static void printWithRestrictionsType(List<? extends Number> list) {
        //use List<? extends Double> to lower bounded wildcard

        list.forEach(System.out::println);
    }

}
