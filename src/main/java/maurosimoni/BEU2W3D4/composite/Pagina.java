package maurosimoni.BEU2W3D4.composite;

public class Pagina extends Elemento{
    public Pagina(String titolo) {
        super(titolo);
    }
    @Override
    public void print() {
        System.out.println("Page: " + titolo);
    }
    @Override
    public int countaPagine() {
        return 1;
    }
}
