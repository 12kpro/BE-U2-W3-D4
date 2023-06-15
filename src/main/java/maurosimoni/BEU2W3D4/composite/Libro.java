package maurosimoni.BEU2W3D4.composite;

import java.util.ArrayList;
import java.util.List;

public class Libro extends Elemento{
    private List<Elemento> children = new ArrayList<>();
    private List<String> autori;
    private double prezzo;

    public Libro(String titolo, List<String> autori, double prezzo) {
        super(titolo);
        this.autori = autori;
        this.prezzo = prezzo;
    }

    public void add(Elemento component) {
        children.add(component);
    }

    @Override
    public void print() {
        System.out.println("Libro: " + titolo);
        for (Elemento child : children) {
            child.print();
        }
    }
    @Override
    public int countaPagine() {
        int count = 0;
        for (Elemento child : children) {
            count += child.countaPagine();
        }
        return count;
    }
}
