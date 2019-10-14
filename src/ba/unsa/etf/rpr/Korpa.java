package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] niz = new Artikl[50];
    private int brojEl=0;

    public Artikl[] getArtikli() {
        return niz;
    }

    public boolean dodajArtikl(Artikl x) {
        if(brojEl==49)
            return false;

        niz[brojEl]=new Artikl(x);
        brojEl++;
        return true;
    }

    public Artikl izbaciArtiklSaKodom(String kod1) {
        for(int i=0; i< brojEl; i++){
            if(kod1.equals(niz[i].getKod()))
            {
                Artikl pom= new Artikl(niz[i]);
                for (int j=i; j<niz.length-1; j++)
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

    public int dajUkupnuCijenuArtikala() {
        int suma=0;
        for (int i=0; i<brojEl; i++){
            suma = suma + niz[i].getCijena();
        }
        return suma;
    }
}

