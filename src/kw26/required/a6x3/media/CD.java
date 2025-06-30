package kw26.required.a6x3.media;

import java.util.Objects;

/**
 * 
 * @author Maksym Zadoya
 * @version 2025/06/30 #2
 * 
 */
public class CD extends Disc {

    private final String cdInterpret;
    
    public CD (String cdTitel, Content cdContent, String cdInterpret) {
        super(cdTitel,cdContent);
        this.cdInterpret = cdInterpret;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(cdInterpret);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (!(obj instanceof CD))
            return false;
        CD other = (CD) obj;
        return Objects.equals(cdInterpret, other.cdInterpret);
    }
    
    
}
