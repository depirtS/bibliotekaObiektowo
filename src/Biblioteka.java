import java.util.ArrayList;

public class Biblioteka {

    private ArrayList<Czytelnik> czytelnicy = new ArrayList<>();
    private ArrayList<Bibliotekarz> bibliotekarze = new ArrayList<>();
    private ArrayList<Ksiazka> ksiazki = new ArrayList<>();

    public Biblioteka(Bibliotekarz ...bibliotekarze) {
        for(Bibliotekarz bibliotekarz:bibliotekarze){
            this.bibliotekarze.add(bibliotekarz);
        }
    }

    public ArrayList<Czytelnik> getCzytelnicy() {
        return czytelnicy;
    }

    public void setCzytelnicy(ArrayList<Czytelnik> czytelnicy) {
        this.czytelnicy = czytelnicy;
    }

    public ArrayList<Bibliotekarz> getBibliotekarze() {
        return bibliotekarze;
    }

    public void setBibliotekarze(ArrayList<Bibliotekarz> bibliotekarze) {
        this.bibliotekarze = bibliotekarze;
    }

    public ArrayList<Ksiazka> getKsiazki() {
        return ksiazki;
    }

    public void setKsiazki(ArrayList<Ksiazka> ksiazki) {
        this.ksiazki = ksiazki;
    }

    @Override
    public String toString() {
        return "Czytelnicy " + czytelnicy + " Bibliotekarze " + bibliotekarze + " Książki " + ksiazki + " ";
    }

    public void dodajNowegoCzytelnika(Czytelnik czytelnik){
        czytelnicy.add(czytelnik);
    }

    public void dodajNowaKsiazke(Ksiazka ksiazka){
        ksiazki.add(ksiazka);
    }
}
