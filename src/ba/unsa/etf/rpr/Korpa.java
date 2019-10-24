package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] korpa= new Artikl[50];
    double saldo=0;
    public Artikl[] getArtikli(){ return this.korpa;}
    public boolean dodajArtikl(Artikl artikl){
        int i;
        for ( i=0;i<50;i++) {
            if (korpa[i] == null)
                break;
            return false;
        }
        this.korpa[i]=artikl;
        saldo=saldo+artikl.getCijena();
        return true;}
    public double dajUkupnuCijenuArtikala(){return this.saldo;};
    public Artikl izbaciArtiklSaKodom(int kod){
        Artikl artikl=null;
        for(int i=0; i<50;i++){
            if(korpa[i].kod==kod)
                artikl=korpa[i];
            korpa[i]=null;
        }
        return artikl;
    }
}
