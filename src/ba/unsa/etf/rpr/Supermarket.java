package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl[] supermarket= new Artikl[1000];

    public Artikl[] getArtikli(){ return this.supermarket;}
    public boolean dodajArtikl(Artikl artikl){
        int i;
        for ( i=0;i<50;i++) {
            if (supermarket[i] == null)
                break;
                return false;
        }
        this.supermarket[i]=artikl;
        return true;
        }
    public Artikl izbaciArtiklSaKodom(int kod){
        Artikl artikl=null;
        for(int i=0; i<50;i++){
            if(supermarket[i].kod==kod)
                artikl=supermarket[i];
                supermarket[i]=null;
        }
        return artikl;
    }
}
