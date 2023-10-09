public class Bibliotekarz extends Osoba{
    private String dataZatrudnienia;

    public Bibliotekarz(String imie, String nazwisko, String dataUr, String dataZatrudnienia) {
        super(imie, nazwisko, dataUr);
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public String getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    public void setDataZatrudnienia(String dataZatrudnienia) {
        this.dataZatrudnienia = dataZatrudnienia;
    }

    @Override
    public String toString() {
        return "DataZatrudnienia " + dataZatrudnienia + " " + super.toString();
    }

    public Bibliotekarz(String imie, String nazwisko, String dataUr) {
        super(imie, nazwisko, dataUr);
    }
}
