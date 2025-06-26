package kw25.optional.generics;

public class SecondGenericClass<T, V> {
     T y; 
     V z;
     
     public SecondGenericClass (T y, V z) {
         this.y = y;
         this.z = z;
     }
     
     public V getValue() {
         return z;
     }
}
