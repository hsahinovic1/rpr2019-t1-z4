package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] korpa= new Artikl[50];
    double saldo=0;
    public Artikl[] getArtikli(){ return this.korpa;}
    public void dodajArtikl(Artikl artikl){
        int i;
        for ( i=0;i<50;i++) {
            if (korpa[i] == null)
                break;
        }
        this.korpa[i]=artikl;
        saldo=saldo+artikl.getCijena();}
    public double dajUkupnuCijenuArtikala(){return this.saldo;};
    public void izbaciArtiklSaKodom(int kod){
        for(int i=0; i<50;i++){
            if(korpa[i].kod==kod)
            korpa[i]=null;
        }

    }
}
