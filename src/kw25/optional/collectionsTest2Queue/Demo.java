package kw25.optional.collectionsTest2Queue;
import java.util.*;

public class Demo {

    public static void main(String[] args) {
       
        Queue<String> queue = new LinkedList<String>(); 
        
        queue.offer("Karen");
        queue.offer("Max");
        queue.offer("Sonya");
        queue.offer("Alex");
        queue.offer("Denys");
        queue.offer("Schmekele");
        
        System.out.println(queue);
        
        System.out.println(queue.peek()); //wird nach dem FIFO-Prinzip das erste gespeicherte Element ausgegeben
        
        queue.poll(); //nach demselben Prinzip wird das erste gespeicherte Element aus Liste entfernt
        //das naechste stehende Element wird zum ersten Element, fuehrt man den Befehl nochmal aus, wird dieses
        //auch entfernt 
        System.out.println(queue);
        
        queue.poll();
        System.out.println(queue);
        
        
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue); //trotz dass die Liste leer ist, fuehrt dieser Aufruf zum Assertion nicht 
       // queue.element(); ist aber grade nicht anwendbar, da die Liste leer ist 
        
        /*
         * Da Queue implementiert Collections, sind alle Methoden, die fuer Collctions spezifisch sind, auch in Queue anwendbar, u.a. contains, size usw...
         */
 
        System.out.printf("size: %d %n", queue.size());
        System.out.printf("is Empty: %b %n", queue.isEmpty());
        
        queue.offer("Karen");
        queue.offer("Max");
        queue.offer("Sonya");
        queue.offer("Alex");
        queue.offer("Denys");
        queue.offer("Schmekele");
        
        System.out.printf("size: %d %n", queue.size());
        System.out.printf("is Empty: %b %n", queue.isEmpty());
        System.out.printf("Contains Denys: %s %n", queue.contains("Denys"));
        
    }

}
