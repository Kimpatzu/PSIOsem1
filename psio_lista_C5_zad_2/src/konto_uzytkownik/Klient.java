package konto_uzytkownik;

public class Klient {
    private String nr_klienta;
    private String imie;
    private String nazwisko;
    private String PESEL;
    private Konto[] konta;
    private String e_mail;
    private String[] nr_telefonu;
    private String haslo;
    private Adres adres;
    public void setHaslo(String nowe_haslo){
        this.haslo =nowe_haslo;
    }
    public void setE_mail(String nowy_email){
        this.e_mail = nowy_email;
    }
}
