package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl[] supermarket= new Artikl[1000];

    public Artikl[] getArtikli(){ return this.supermarket;}
    public boolean dodajArtikl(Artikl artikl){
        int i;
        for ( i=0;i<50;i++) {
            if (supermarket[i] == null) {
                this.supermarket[i]=artikl;
                return true;
            }

        }

        return false;
        }
    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl artikl=null;
        for(int i=0; i<50;i++){
            if(supermarket[i].kod.equals(kod))
                artikl=supermarket[i];
                supermarket[i]=null;
            return artikl;
        }
        return null;
    }
}
