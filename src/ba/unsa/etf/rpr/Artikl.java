package ba.unsa.etf.rpr;

public class Artikl {
    String naziv,cijena;
    int kod;
    public Artikl(String naziv, int kod, String cijena){this.naziv=naziv; this.kod=kod; this.cijena=cijena;};

    public int getCijena(){return Integer.parseInt(this.cijena);}
    public  String getNaziv(){return this.naziv;}
    public  int getKod(){return this.kod;}
}
