package kw26.required.a6x3.media;

import java.util.Objects;

/**
 * 
 * @author Maksym Zadoya
 * @version 2025/06/30 #2
 * 
 */
public class DVD extends Disc {

    private final Format dvdFormat;

    public DVD(String dvdTitel, Content dvdContent, Format dvdFormat) {
        super(dvdTitel, dvdContent);
        this.dvdFormat = dvdFormat;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(dvdFormat);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (!(obj instanceof DVD))
            return false;
        DVD other = (DVD) obj;
        return dvdFormat == other.dvdFormat;
    }
    
}
