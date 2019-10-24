package ba.unsa.etf.rpr;

public class Artikl {
    String naziv,cijena;
    String kod;
    public Artikl(String naziv, String kod, String cijena){this.naziv=naziv; this.kod=kod; this.cijena=cijena;};

    public int getCijena(){return Integer.parseInt(this.cijena);}
    public  String getNaziv(){return this.naziv;}
    public  String getKod(){return this.kod;}
}
