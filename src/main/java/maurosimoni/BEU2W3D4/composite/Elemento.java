package maurosimoni.BEU2W3D4.composite;

public abstract  class Elemento {
    protected String titolo;
    public Elemento(String titolo) {
        this.titolo = titolo;
    }
    public abstract void print();
    public abstract int countaPagine();
}
