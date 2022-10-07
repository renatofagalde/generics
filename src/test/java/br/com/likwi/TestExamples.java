package br.com.likwi;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

class TestExamples {

    @Test
    public void for_with_objects() {
        final ArrayList<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add("2");

        for (Object number : numbers) {
            System.out.println("number = " + number);
        }

        assumeTrue(5 > 1);


    }

}
