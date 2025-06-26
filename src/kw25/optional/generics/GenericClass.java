package kw25.optional.generics;

public class GenericClass <T>{

    T x;
    
    public GenericClass(T x) {
        this.x = x;
    }
    
    public T getValue() {
        return x;
    }
}
