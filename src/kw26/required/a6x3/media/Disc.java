package kw26.required.a6x3.media;

import java.util.Objects;

/**
 * 
 * @author Maksym Zadoya
 * @version 2025/06/30 #2
 * 
 */
public abstract class Disc {
 
    protected final String diskName;
    protected final Content contentType;
    
    public Disc(String diskName, Content contentType) {
        
        this.diskName = diskName;
        this.contentType = contentType;
        
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentType, diskName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Disc))
            return false;
        Disc other = (Disc) obj;
        return contentType == other.contentType && Objects.equals(diskName, other.diskName);
    }
    
    
}
