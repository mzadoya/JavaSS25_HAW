package kw26.required.a6x2.wordCounter;

import java.util.Objects;

/**
 * @author Maksym Zadoya
 * @version 2025/06/29 #1
 */

public class Word {

    String wort;

    public Word(String wort) {
        this.wort = wort.toLowerCase();
    }

    @Override
    public int hashCode() {
        return Objects.hash(wort);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Word))
            return false;
        Word other = (Word) obj;
        return Objects.equals(wort, other.wort);
    }

    @Override
    public String toString() {
        return this.getClass() + "[wort=" + wort + "]";
    }

}
