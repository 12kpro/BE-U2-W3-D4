package maurosimoni.BEU2W3D4.composite;

import java.util.ArrayList;
import java.util.List;

public class Sezione extends Elemento{
    private List<Elemento> children = new ArrayList<>();
    public Sezione(String title) {
        super(title);
    }
    public void add(Elemento elemento) {
        children.add(elemento);
    }
    @Override
    public void print() {
        System.out.println("Sezione: " + titolo);
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
