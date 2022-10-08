package br.com.likwi;

import lombok.Builder;

@Builder
public class Phone {

    private final String brand;

    @Override
    public String toString() {
        return this.brand;
    }
}
