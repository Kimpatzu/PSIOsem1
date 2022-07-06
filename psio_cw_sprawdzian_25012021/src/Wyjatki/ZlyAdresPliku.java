package Wyjatki;

public class ZlyAdresPliku extends Exception {
    private static final long serialVersionUID = 73556345568L;

    public ZlyAdresPliku(String s){
        super(s);
    }

    public ZlyAdresPliku(){
        super();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();

        System.out.println("Zła nazwa Pliku");
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "Zła nazwa Pliku";
    }
}
