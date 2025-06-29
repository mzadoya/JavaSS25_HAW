package kw26.required.a6x2.wordCounter;

/**
 * @author Maksym Zadoya 
 * @version 2025/06/29 #1
 */

public class Counter {

    int count;

    public Counter() {
        this.count = 0;
    }

    public void inc() {
        count++;
    }

    @Override
    public String toString() {
        return "Counter [count=" + count + "]";
    }
    
    
}