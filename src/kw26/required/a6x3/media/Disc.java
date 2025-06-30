package kw26.required.a6x3.media;

public abstract class Disc {
 
    protected final String diskName;
    protected final Content contentType;
    
    public Disc(String diskName, Content contentType) {
        
        this.diskName = diskName;
        this.contentType = contentType;
        
    }
}
