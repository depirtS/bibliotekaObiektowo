public class Ksiazka {
    private String tytul;
    private String autor;
    private boolean czyWyporzyczona;

    public Ksiazka(String tytul, String autor) {
        this.tytul = tytul;
        this.autor = autor;
        this.czyWyporzyczona = false;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isCzyWyporzyczona() {
        return czyWyporzyczona;
    }

    public void setCzyWyporzyczona(boolean czyWyporzyczona) {
        this.czyWyporzyczona = czyWyporzyczona;
    }
    @Override
    public String toString() {
        return "Książka " + tytul + " autora " + autor + " ";
    }

    public String sprawdzCzyKsiazkaJestDostepna(){
        if(czyWyporzyczona)
        return "Wypożyczona " + tytul;
        else
        return "Nie wypożyczona " + tytul;
    }
}
