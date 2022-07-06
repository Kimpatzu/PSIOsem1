package wykaz_klasy_wyswietlane;

public interface ListaDanych {
    public String getTytul_zestawienia();
    public String getNaglowek_zestawienia();
    public String getWiersz_zestawienia(int i);
    public int getRozmiar_zestawienia();
    public String getDodatkowe_informacje();
}
/*
kolejne metody interfejsu odpowiadają za:
1. zwraca to jest na tabelką
2. zwraca nagłówek tabeli
3. Zwraca pojedyńczy wiersz tabeli
4. Mówi ile wierszy ma mieć tabela
5. Zwraca to co ma być pod tabelą
 */