package konto_uzytkownik;

public abstract class Konto {
    private String nr_konta;
    private String nr_klienta;
    private double stan_konta;
    public void wplac_sume(double kwota){
        this.stan_konta+=kwota;
    }
    public void wyplac_sume(double kwota){
        this.stan_konta-=kwota;
    }
}
