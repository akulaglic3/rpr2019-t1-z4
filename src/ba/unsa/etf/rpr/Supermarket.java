package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] niz = new Artikl[1000];
    private int brojEl=0;

    public void dodajArtikl(Artikl x) {
        niz[brojEl]=x;
        brojEl++;
    }

    public Artikl[] getArtikli() {
        return niz;
    }

    public Artikl izbaciArtiklSaKodom(String kod1) {
        for(int i=0; i< brojEl; i++){
            String pom1=niz[i].getKod();
            if(niz[i]!=null && kod1.equals(pom1))
            {
                Artikl pom= new Artikl(niz[i]);
                for (int j=i; j<brojEl-1; j++)
                {
                    niz[j]=niz[j+1];
                }
                niz[brojEl-1]=null;
                brojEl--;
                return pom;
            }
        }
        return null;
    }
}