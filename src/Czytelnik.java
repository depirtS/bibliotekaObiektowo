import java.util.ArrayList;

public class Czytelnik extends Osoba{
    private static int ileCzytelnikow = 0;
    private  int nrCzytelnika = 0;
    private ArrayList<Ksiazka> wypozyczoneKsiazki = new ArrayList<>();

    public Czytelnik(String imie, String nazwisko, String dataUr) {
        super(imie, nazwisko, dataUr);
        ileCzytelnikow++;
        nrCzytelnika = ileCzytelnikow;
    }
    public static int getIleCzytelnikow() {
        return ileCzytelnikow;
    }

    public static void setIleCzytelnikow(int ileCzytelnikow) {
        Czytelnik.ileCzytelnikow = ileCzytelnikow;
    }

    public int getnrCzytelnika() {
        return nrCzytelnika;
    }

    public void setnrCzytelnika(int nrCzytelnika) {
        this.nrCzytelnika = nrCzytelnika;
    }

    public ArrayList<Ksiazka> getWypozyczoneKsiazki() {
        return wypozyczoneKsiazki;
    }

    public void setWypozyczoneKsiazki(ArrayList<Ksiazka> wypozyczoneKsiazki) {
        this.wypozyczoneKsiazki = wypozyczoneKsiazki;
    }

    @Override
    public String toString() {
        return "nrCzytelnika " + nrCzytelnika + ", wypozyczoneKsiazki " + wypozyczoneKsiazki + super.toString() + " ";
    }

    public String wyporzyczKsiazke(Ksiazka ksiazka){
//        for(Uczen uczen:uczniowie
//        ) {
//            this.uczniowie.add(uczen);
//        }
        if(ksiazka.isCzyWyporzyczona()) {
            return "Ksiązka " + ksiazka.getTytul() + " jest niedostępna.";
        }
        else{
            ksiazka.setCzyWyporzyczona(true);
            this.wypozyczoneKsiazki.add(ksiazka);
            return "Ksiązka " + ksiazka.getTytul() + " została pożyczona.";
        }
    }

    public  String ileKsiazekWypozyczylCzytelnik(){
        return "Ilość wyporzyczonych książek: " + wypozyczoneKsiazki.size();
    }
}
