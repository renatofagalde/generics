package br.com.likwi;

import lombok.Builder;

@Builder
public class Letter {

    private final String sender;

    @Override
    public String toString() {
        return this.sender;
    }
}
