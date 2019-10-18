package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] korpa= new Artikl[50];
    double saldo=0;
    public void dodajUKorpu(Artikl artikl){ this.korpa[0]=artikl; saldo=saldo+artikl.cijena;}
}
