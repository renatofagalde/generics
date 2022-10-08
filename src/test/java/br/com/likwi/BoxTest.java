package br.com.likwi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    private String brand = "Samsung";

    @Test
    public void java_generics_new_box() {
        final Box<Phone> box = new Box<>();
        box.set(new Phone(this.brand));

        assertEquals(this.brand, box.get().toString());

    }

}
