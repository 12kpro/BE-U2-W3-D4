package maurosimoni.BEU2W3D4.composite;

import maurosimoni.BEU2W3D4.cor.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompositeRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        List<String> autori = new ArrayList<>();
        autori.add("Author 1");
        autori.add("Author 2");

        Libro libro = new Libro("Titolo libro", autori, 9.99);

        Sezione s1 = new Sezione("Sezione 1");
        s1.add(new Pagina("Pagina 1"));
        s1.add(new Pagina("Pagina 2"));

        Sezione s2 = new Sezione("Sezione 2");
        s2.add(new Pagina("Pagina 3"));
        s2.add(new Pagina("Pagina 4"));

        Sezione sub1 = new Sezione("Sottosezione 1");
        sub1.add(new Pagina("Pagina 5"));
        sub1.add(new Pagina("Pagina 6"));
        s2.add(sub1);

        libro.add(s1);
        libro.add(s2);

        libro.print();
        System.out.println("Pagine totali: " + libro.countaPagine());
    }
}
