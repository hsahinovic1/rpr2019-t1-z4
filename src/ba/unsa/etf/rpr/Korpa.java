package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] korpa= new Artikl[50];
    int saldo=0;
    public Artikl[] getArtikli(){ return this.korpa;}
    public boolean dodajArtikl(Artikl artikl){
        for (int i=0;i<50;i++) {
            if (korpa[i] == null){
                this.korpa[i]=artikl;
                saldo=saldo+artikl.getCijena();
                return true;
            }

        }

        return false;
    }

    public int dajUkupnuCijenuArtikala(){ return this.saldo;}

    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl artikl=null;
        for(int i=0; i<50;i++){
            if(korpa[i].kod.equals(kod))
                artikl=korpa[i];
            korpa[i]=null;
            saldo=saldo-artikl.getCijena();
            return artikl;
        }
        return null;
    }
}
