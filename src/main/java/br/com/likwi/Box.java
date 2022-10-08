package br.com.likwi;

public class Box<T> {

    private T anyType;

    public void set(T anyType) {
        this.anyType = anyType;
    }

    public T get() {
        return this.anyType;
    }
}
