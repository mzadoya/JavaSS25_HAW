package kw26.required.a6x3.media;

public class DVD extends Disc {

    private final Format dvdFormat;

    public DVD(String dvdTitel, Content dvdContent, Format dvdFormat) {
        super(dvdTitel, dvdContent);
        this.dvdFormat = dvdFormat;
    }
}
