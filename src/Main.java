// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
/*Wykonaj model biblioteki. Zdefiniuj klasy zawierające wypunktowane pola. Wykorzystaj mechanizm dziedziczenia, hermetyzacji.
Biblioteka
czytelnicy
bibliotekarze
ksiazki

Osoba
imie
nazwisko
dataUr

Czytelnik
nrCzytelnika
wypozyczoneKsiazki

Bibliotekarz
dataZatrudnienia

Ksiazka
tytul
autor
czyWypozyczona


Dla każdej klasy utwórz konstruktor, metody set i get oraz metodę toString.
Zaimplementuj w odpowiedniej klasie następujące metody:
·        wypozyczKsiazke, +
·        sprawdzCzyKsiazkaJestDostepna, +
·        ileKsiazekWypozyczylCzytelnik, +
·        dodajNowegoCzytelnika. +*/

        Bibliotekarz andrzej = new Bibliotekarz("Andrzej","Duda","04.11.2002","09.10.2023");
        Bibliotekarz jozek = new Bibliotekarz("Józek","Papież","06.09.1999","09.10.2023");
        System.out.println(andrzej);
        System.out.println(" ");

        Biblioteka filiaNr1 = new Biblioteka(andrzej,jozek);
        System.out.println(filiaNr1);
        System.out.println(" ");

        Ksiazka latarnik = new Ksiazka("latarnik","Hendryk Sienkiewicz");
        System.out.println(latarnik.sprawdzCzyKsiazkaJestDostepna());
        System.out.println(latarnik);
        filiaNr1.dodajNowaKsiazke(latarnik);
        System.out.println(" ");

        Czytelnik filipinka = new Czytelnik("Filipinka","Hrabówna","03.11.2006");
        Czytelnik karol = new Czytelnik("Karol","Miejski","09.01.1987");
        filiaNr1.dodajNowegoCzytelnika(filipinka);
        filiaNr1.dodajNowegoCzytelnika(karol);
        System.out.println(" ");

        System.out.println(filipinka);
        System.out.println(filipinka.wyporzyczKsiazke(latarnik));
        System.out.println(latarnik.sprawdzCzyKsiazkaJestDostepna());
        System.out.println(filipinka);
        System.out.println(karol);
        System.out.println(karol.wyporzyczKsiazke(latarnik));
        System.out.println(karol);
        System.out.println(filiaNr1);
        System.out.println(" ");

        Ksiazka malyKsiaze = new Ksiazka("Mały książe","Antoine de Saint-Exupéry");
        System.out.println(filipinka.wyporzyczKsiazke(malyKsiaze));
        System.out.println(filipinka.ileKsiazekWypozyczylCzytelnik());
        System.out.println(karol.ileKsiazekWypozyczylCzytelnik());

    }
}