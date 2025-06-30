package kw26.required.a6x3.media;

public class CD extends Disc {

    private final String cdInterpret;
    
    public CD (String cdTitel, Content cdContent, String cdInterpret) {
        super(cdTitel,cdContent);
        this.cdInterpret = cdInterpret;
    }
}
